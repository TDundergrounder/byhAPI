package com.beyondh.cases.order;

import com.beyondh.cases.AbstractTestCase;
import com.beyondh.constants.CreditConstants;
import com.beyondh.constants.TestConstants;
import com.beyondh.dataprovider.OrderDataProvider;
import com.beyondh.enums.pms.BillItemType;
import com.beyondh.model.bill.AdditionalDetailRoomRentGenerateModel;
import com.beyondh.model.bill.AdditionalRoomRentGenerateModel;
import com.beyondh.model.bill.BillItemAddModel;
import com.beyondh.model.hotel.*;
import com.beyondh.model.order.*;
import com.beyondh.utility.ClientGroup;
import com.beyondh.utility.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Test(groups = (TestConstants.GRPOUP_ORDER),singleThreaded=true)
@ClientGroup(TestConstants.GRPOUP_ORDER)
public class OrderCases extends AbstractTestCase {
    @Test(dataProvider = OrderDataProvider.DATA_ADDORDER,dataProviderClass = OrderDataProvider.class)
    private void addOrderCase(OrderAddModel newOrder)
    {
        long result = _orderAPIInvoker.add(newOrder);
        Assert.assertTrue(result>0);

        OrderSearchModel orderQuery = new OrderSearchModel(newOrder.getOrgId(),result);
        OrderInfo orderSearched = _orderAPIInvoker.QuerySingleOrder(orderQuery);
        Assert.assertNotNull(orderSearched);
        Assert.assertEquals(Helper.gmtToLocalDateTime(orderSearched.getEstimatedArriveTime(),true),newOrder.getEstimatedArriveTime());
        Assert.assertEquals(Helper.gmtToLocalDateTime(orderSearched.getEstimatedDepartureTime(),true),newOrder.getEstimatedDepartureTime());
        Assert.assertEquals(orderSearched.getLiaisons().length,newOrder.getLiaisons().length);
        Assert.assertEquals(orderSearched.getLiaisons()[0].getName(),newOrder.getLiaisons()[0].getName());
        Assert.assertEquals(orderSearched.getLiaisons()[0].getMobile(),newOrder.getLiaisons()[0].getMobile());

        String[] roomTypes =Arrays.stream(newOrder.getRoomPlans()).map(x->x.getRoomTypeId()).toArray(String[]::new);
        AvailableRoomQueryModel roomQuery= new AvailableRoomQueryModel(newOrder.getOrgId(),newOrder.getEstimatedArriveTime(),newOrder.getEstimatedDepartureTime(),roomTypes);
        RoomInfo[] rooms = _hotelInvoker.getAvailableRooms(roomQuery);
        Assert.assertTrue(rooms.length>0);

        OccupationModel[] occupations = orderSearched.getOccupations();
        for (int i = 0;i<occupations.length;i++) {
            Assert.assertTrue( _orderAPIInvoker.dispatchRoom(new DispatchOrderRoomModel(newOrder.getOrgId(),occupations[i].getOccupationId(),rooms[i].getRoomNumber())));
        }

        orderSearched = _orderAPIInvoker.QuerySingleOrder(orderQuery);
        occupations = orderSearched.getOccupations();
        for (int i = 0;i<occupations.length;i++) {
            Assert.assertEquals(occupations[i].getRoomNumber(),rooms[i].getRoomNumber());
        }

        OrderCancelModel cancel = new OrderCancelModel(newOrder.getOrgId(),result,"Canceled by addOrderCase");
        boolean cancelResult = _orderAPIInvoker.cancel(cancel);
        Assert.assertTrue(cancelResult);
    }

    @Test(dataProvider = OrderDataProvider.DATA_QUERYORDERAVAILABLEPROMOTIONS,dataProviderClass = OrderDataProvider.class)
    private void QueryOrderAvailablePromotionsCase(OrderAddModel newOrder,String expect)
    {
        PromotionInfo[] result = _orderAPIInvoker.QueryOrderAvailablePromotions(newOrder);
        Assert.assertTrue(result.length>0);

       Assert.assertNotNull(Arrays.stream(result).filter(x->x.getName().equals(expect)).findFirst().orElse(null));
    }

    @Test(dataProvider = OrderDataProvider.DATA_QUERYCHECKINSMARTDOORLOCKS,dataProviderClass = OrderDataProvider.class)
    private void queryCheckinSmartDoorLocksCase(SmartDoorLockSearchModel searchModel)
    {
        SmartDoorLockInfo[] result = _orderAPIInvoker.queryCheckinSmartDoorLocks(searchModel);
        Assert.assertTrue(result.length==1);
        Assert.assertFalse(result[0].isCanOpen());
    }

    @Test(dataProvider = OrderDataProvider.DATA_OPENCHECKINSMARTDOORLOCK,dataProviderClass = OrderDataProvider.class)
    private void openCheckinSmartDoorLockCase(OpenSmartDoorLockModel openSmartDoorLockModel)
    {
        boolean result = _orderAPIInvoker.openCheckinSmartDoorLock(openSmartDoorLockModel);
        Assert.assertFalse(result);
    }

    @Test(dataProvider = OrderDataProvider.DATA_ADDCHECKIN,dataProviderClass = OrderDataProvider.class)
    private void addCheckInCase(OrderAddModel newOrder,CheckinCustomer customer)
    {
        long newOrderId = _orderAPIInvoker.add(newOrder);
        Assert.assertTrue(newOrderId>0);

        OrderSearchModel orderQuery = new OrderSearchModel(newOrder.getOrgId(),newOrderId);
        OrderInfo orderSearched = _orderAPIInvoker.QuerySingleOrder(orderQuery);
        Assert.assertNotNull(orderSearched);

        String[] roomTypes =Arrays.stream(newOrder.getRoomPlans()).map(x->x.getRoomTypeId()).toArray(String[]::new);
        AvailableRoomQueryModel roomQuery= new AvailableRoomQueryModel(newOrder.getOrgId(),newOrder.getEstimatedArriveTime(),newOrder.getEstimatedDepartureTime(),roomTypes);
        RoomInfo[] rooms = _hotelInvoker.getAvailableRooms(roomQuery);
        Assert.assertTrue(rooms.length>0);

        OccupationModel[] occupations = orderSearched.getOccupations();
        for (int i = 0;i<occupations.length;i++) {
            long occupationId = occupations[i].getOccupationId();
            Assert.assertTrue( _orderAPIInvoker.dispatchRoom(new DispatchOrderRoomModel(newOrder.getOrgId(),occupationId,rooms[i].getRoomNumber())));
            Assert.assertTrue(_orderAPIInvoker.addCheckin(new AddCheckinModel(orderSearched.getOrderId(),occupationId,orderSearched.getOrgId(),customer)));
        }

        CheckinSearchModel search = new CheckinSearchModel(newOrder.getOrgId(),new long[]{newOrderId});
        CheckinInfo checkIn =  _orderAPIInvoker.QueryCheckins(search).getContent()[0];
        Assert.assertNotNull(checkIn);
        Assert.assertEquals(checkIn.getCheckinCustomer().getName(),customer.getName());
        Assert.assertEquals(checkIn.getCheckinCustomer().getMobile(),customer.getMobile());
        Assert.assertEquals(checkIn.getEstimatedDepartureTime(),newOrder.getEstimatedDepartureTime());
        Assert.assertEquals(Helper.format(checkIn.getActualArriveTime(),"yyyy-MM-dd"),Helper.format(newOrder.getEstimatedArriveTime(),"yyyy-MM-dd"));

        //房费查询
        String[] roomRent = _orderAPIInvoker.queryUnGeneratedRoomRent(new ApplyCheckoutModel(newOrder.getOrgId(),new long[]{checkIn.getCheckinId()}));
        Assert.assertEquals(roomRent.length,1);
        Assert.assertEquals(roomRent[0],checkIn.getRoomNumber());

        //加收房费
        AdditionalRoomRentGenerateModel generateModel =  new AdditionalRoomRentGenerateModel(newOrder.getOrgId(),new AdditionalDetailRoomRentGenerateModel[]{new AdditionalDetailRoomRentGenerateModel(checkIn.getOccupationId())});
        boolean result = _billInvoker.generateAdditionalRoomRent(generateModel);
        Assert.assertTrue(result);

        //入账平账
        BillItemAddModel newBillItem = new BillItemAddModel(newOrder.getOrgId(),checkIn.getBillId(),
                BillItemType.Credit.getStringValue(),
                CreditConstants.CREDIT_C9110,
                newOrder.getRoomPlans()[0].getPrice()[0].getActualPrice(),
                null);
        Assert.assertTrue(_billInvoker.addBillItem(newBillItem).getBillId() > 0);

        CheckoutResponse[] checkOuts = _orderAPIInvoker.checkout(new ApplyCheckoutModel(checkIn.getOrgId(),new long[]{checkIn.getCheckinId()}));
        Assert.assertTrue(checkOuts.length ==1);
        Assert.assertEquals(checkOuts[0].getCheckinId(),checkIn.getCheckinId());
        Assert.assertTrue(checkOuts[0].isCheckout());

//        OccupationSurchargePartInfo[] surchargePartInfos = _orderAPIInvoker.queryRoomRateCharge(new ApplyCheckoutModel(newOrder.getOrgId(),new long[]{Long.valueOf("660134551093254")}));
//       Assert.assertEquals(surchargePartInfos.length,1);
    }

}
