package com.beyondh.dataprovider;

import com.beyondh.config.TestConfiguration;
import com.beyondh.constants.TestConstants;
import com.beyondh.enums.pms.CheckinType;
import com.beyondh.invoker.HotelAPIInvoker;
import com.beyondh.invoker.OrderAPIInvoker;
import com.beyondh.model.hotel.AvailableRoomQueryModel;
import com.beyondh.model.hotel.RoomInfo;
import com.beyondh.model.order.*;
import com.beyondh.utility.Helper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public abstract class AbstractTestDataProvider {

    private static  final  String FILE = "/test-data.xml";

    private static final String ELEMENT_ENVIRONMENT = "Environment";

    private static final String ELEMENT_ATTRIBUTE_NAME = "name";

    private static final String ELEMENT_ATTRIBUTE_KEY= "Key";

    private static final String ELEMENT_ATTRIBUTE_VALUE = "Value";

    protected static final HashMap<String,HashMap<String,String>> _data = new  HashMap<String,HashMap<String,String>>();

    protected  static HashMap<String,String> _commonData;

    private static boolean _isLoaded = false;
    static {
        loadData();
        _commonData = _data.get(TestConstants.DATA_MODULE_COMMON);
    }

    private static  void loadData() {
        try {
            if(_isLoaded)
                return;

            InputStream stream = Class.class.getResourceAsStream(FILE);

            List<Element> environments = new SAXReader().read(stream).getRootElement().elements(ELEMENT_ENVIRONMENT);
            Element environment = environments.stream()
                    .filter(x ->x.attribute(ELEMENT_ATTRIBUTE_NAME).getValue().equalsIgnoreCase(TestConfiguration.instance().getEnvironment()))
                    .findFirst()
                    .orElse(null);
            if (null == environment)
                throw new Exception("Data loading failed!");

            ((List<Element>)environment.elements()).forEach(module->
                    {
                        String moduleName = module.attributeValue(ELEMENT_ATTRIBUTE_NAME);
                        if(!_data.containsKey(moduleName))
                            _data.put(moduleName,new HashMap<String,String>());

                        HashMap<String,String> moudleMap = _data.get(moduleName);
                        ((List<Element>)module.elements()).forEach(data->
                        {
                            String key = data.attributeValue(ELEMENT_ATTRIBUTE_KEY);
                            String value = data.attributeValue(ELEMENT_ATTRIBUTE_VALUE);
                            if( null != key && !moudleMap.containsKey(key))
                            {
                                moudleMap.put(key,value);
                            }
                        });
                    }
            );

            stream.close();

            _isLoaded = true;
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    protected static long getOrgId()
    {
      return   Long.valueOf(_commonData.get("OrgId"));
    }

    protected  static String getOrgName()
    {
        return _commonData.get("OrgName");
    }

    protected static long getOwnerId()
    {
       return Long.valueOf(_commonData.get("OwnerId"));
    }

    protected  static CheckinInfo getDefaultCheckIn(ITestContext testContext)
    {
        OrderAPIInvoker _orderInvoker = (OrderAPIInvoker)testContext.getAttribute(OrderAPIInvoker.class.getTypeName());
        if(null == _orderInvoker)
            Assert.fail();

        CheckinSearchModel search = new CheckinSearchModel(getOrgId(),_commonData.get("MemberId"));
        CheckinInfo[] result =  _orderInvoker.QueryCheckins(search).getContent();
        if(result.length <=0)
        {
           if(!addDeftaultCheckIn(testContext))
               return  null;
        }

        return _orderInvoker.QueryCheckins(search).getContent()[0];
    }

    private static boolean addDeftaultCheckIn(ITestContext testContext)
    {
        OrderAPIInvoker _orderInvoker = (OrderAPIInvoker)testContext.getAttribute(OrderAPIInvoker.class.getTypeName());
        if(null == _orderInvoker)
            Assert.fail();

        HotelAPIInvoker _hotelInvoker = (HotelAPIInvoker)testContext.getAttribute(HotelAPIInvoker.class.getTypeName());
        if(null == _hotelInvoker)
            Assert.fail();

        Calendar calendar = Calendar.getInstance();

        OrderAddModel newOrder = new OrderAddModel();
        newOrder.setOrgId(getOrgId());
        newOrder.setCheckinType(CheckinType.Normal.toString());
        newOrder.setEstimatedArriveTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, 6);
        newOrder.setExpireKeepTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, -6);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        newOrder.setPrePaymentTypeId(_commonData.get("PrePayment"));
        newOrder.setEstimatedDepartureTime(Helper.getFormatDateTime(calendar));
        newOrder.setLiaisons(new Liaison[]{new Liaison(Helper.getRandomChineseName(), Helper.getMobileNumber())});
        newOrder.setRoomPlans(new RoomPlan[]{new RoomPlan(_commonData.get("RoomType"), Integer.valueOf(_commonData.get("OrderAmount")),new RoomPrice[]{new RoomPrice(new BigDecimal(_commonData.get("OrignPrice")), new BigDecimal(_commonData.get("ActualPrice")), _commonData.get("RoomType"), Integer.valueOf(_commonData.get("OrderAmount")))})});
        newOrder.setMemberId(_commonData.get("MemberId"));

        long result = _orderInvoker.add(newOrder);
        if(result<=0)
            Assert.fail();

        OrderSearchModel orderQuery = new OrderSearchModel(newOrder.getOrgId(),result);
        OrderInfo orderSearched = _orderInvoker.QuerySingleOrder(orderQuery);
        Assert.assertNotNull(orderSearched);

        String[] roomTypes = Arrays.stream(newOrder.getRoomPlans()).map(x->x.getRoomTypeId()).toArray(String[]::new);
        AvailableRoomQueryModel roomQuery= new AvailableRoomQueryModel(newOrder.getOrgId(),newOrder.getEstimatedArriveTime(),newOrder.getEstimatedDepartureTime(),roomTypes);
        RoomInfo[] rooms = _hotelInvoker.getAvailableRooms(roomQuery);
        Assert.assertTrue(rooms.length>0);

        CheckinCustomer customer = new CheckinCustomer(_commonData.get("MemberName"),_commonData.get("MemberIDType"),_commonData.get("CardNo"),_commonData.get("MemberMobile"),true);
        OccupationModel[] occupations = orderSearched.getOccupations();
        for (int i = 0;i<occupations.length;i++) {
            long occupationId = occupations[i].getOccupationId();
            Assert.assertTrue( _orderInvoker.dispatchRoom(new DispatchOrderRoomModel(newOrder.getOrgId(),occupationId,rooms[i].getRoomNumber())));
            Assert.assertTrue(_orderInvoker.addCheckin(new AddCheckinModel(orderSearched.getOrderId(),occupationId,orderSearched.getOrgId(),customer)));
        }

        return true;
    }

    protected  static OrderInfo getDefaultOrder(ITestContext testContext) {
        OrderAPIInvoker _orderInvoker = (OrderAPIInvoker) testContext.getAttribute(OrderAPIInvoker.class.getTypeName());
        if (null == _orderInvoker)
            Assert.fail();

        OrdersSearchModel orderQuery = new OrdersSearchModel(getOrgId(),new String[]{TestConstants.ORDER_STATUS_INPROGRESS});
        OrderInfo[] orders = _orderInvoker.queryOrders(orderQuery).getContent();

        OrderInfo result = Arrays.stream(orders).filter(x->x.getLiaisons()[0].getName().equals(_commonData.get("Liason"))).findFirst().orElse(null);
        if (null == result) {
            if (!addDeftaultOrder(testContext))
                return null;
        }

        return Arrays.stream( _orderInvoker.queryOrders(orderQuery).getContent()).filter(x->x.getLiaisons()[0].getName().equals(_commonData.get("Liason"))).findFirst().orElse(null);
    }

    private static boolean addDeftaultOrder(ITestContext testContext)
    {
        OrderAPIInvoker _orderInvoker = (OrderAPIInvoker)testContext.getAttribute(OrderAPIInvoker.class.getTypeName());
        if(null == _orderInvoker)
            Assert.fail();

        Calendar calendar = Calendar.getInstance();

        OrderAddModel newOrder = new OrderAddModel();
        newOrder.setOrgId(getOrgId());
        newOrder.setCheckinType(CheckinType.Normal.toString());
        newOrder.setEstimatedArriveTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        newOrder.setPrePaymentTypeId(_commonData.get("PrePayment"));
        newOrder.setEstimatedDepartureTime(Helper.getFormatDateTime(calendar));
        newOrder.setLiaisons(new Liaison[]{new Liaison(_commonData.get("Liason"), Helper.getMobileNumber())});
        newOrder.setRoomPlans(new RoomPlan[]{new RoomPlan(_commonData.get("RoomTypeTR"), 1, new RoomPrice[]{new RoomPrice(new BigDecimal(_commonData.get("RoomTypeTRPrice")), new BigDecimal(_commonData.get("RoomTypeTRPrice")), _commonData.get("RoomTypeTR"), 1)})});

        long result = _orderInvoker.add(newOrder);

        return result>0;
    }
}
