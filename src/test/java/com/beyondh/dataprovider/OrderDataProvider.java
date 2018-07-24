package com.beyondh.dataprovider;

import com.beyondh.constants.TestConstants;
import com.beyondh.enums.pms.CheckinType;
import com.beyondh.model.order.OpenSmartDoorLockModel;
import com.beyondh.model.order.SmartDoorLockSearchModel;
import com.beyondh.model.order.*;
import com.beyondh.utility.ClientGroup;
import com.beyondh.utility.Helper;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;

@ClientGroup(TestConstants.GRPOUP_ORDER)
public class OrderDataProvider extends  AbstractTestDataProvider {

    public static final String DATA_ADDORDER = "AddOrder";

    protected static HashMap<String, String> _orderData = _data.get(TestConstants.DATA_MODULE_ORDER);

    public static final String DATA_QUERYCHECKINSMARTDOORLOCKS = "QueryCheckinSmartDoorLocksCase";

    public static final String DATA_OPENCHECKINSMARTDOORLOCK = "OpenCheckinSmartDoorLockCase";

    public static final String DATA_ADDCHECKIN = "AddCheckinCase";

    public static final String DATA_QUERYORDERAVAILABLEPROMOTIONS= "QueryOrderAvailablePromotions";

    @DataProvider(name = DATA_ADDORDER)
    public static Object[][] addOrderData() {

        Calendar calendar = Calendar.getInstance();

        OrderAddModel newOrder = new OrderAddModel();
        newOrder.setOrgId(getOrgId());
        newOrder.setCheckinType(CheckinType.Normal.toString());
        newOrder.setEstimatedArriveTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, 6);
        newOrder.setExpireKeepTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, -6);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        newOrder.setPrePaymentTypeId(_orderData.get("PrePayment"));
        newOrder.setEstimatedDepartureTime(Helper.getFormatDateTime(calendar));
        newOrder.setLiaisons(new Liaison[]{new Liaison(Helper.getRandomChineseName(), Helper.getMobileNumber())});
        newOrder.setRoomPlans(new RoomPlan[]{new RoomPlan(_orderData.get("RoomType"), Integer.valueOf(_orderData.get("OrderAmount")), new RoomPrice[]{new RoomPrice(new BigDecimal(_orderData.get("OrignPrice")), new BigDecimal(_orderData.get("ActualPrice")), _orderData.get("RoomType"), Integer.valueOf(_orderData.get("OrderAmount")))})});

        return new Object[][]{
                {newOrder},
        };
    }

    @DataProvider(name = DATA_QUERYCHECKINSMARTDOORLOCKS)
    public static Object[][] queryCheckinSmartDoorLocksCaseData(ITestContext context) {

        CheckinInfo check = getDefaultCheckIn(context);
        return new Object[][]{
                {new SmartDoorLockSearchModel(getOrgId(), new long[]{check.getCheckinId()})}
        };
    }

    @DataProvider(name = DATA_OPENCHECKINSMARTDOORLOCK)
    public static Object[][] openCheckinSmartDoorLockCaseData(ITestContext context) {
        CheckinInfo check = getDefaultCheckIn(context);

        return new Object[][]{
                {new OpenSmartDoorLockModel(getOrgId(), check.getCheckinId())}
        };
    }

    @DataProvider(name = DATA_ADDCHECKIN)
    public static Object[][] addCheckInCaseData() {

        Calendar calendar = Calendar.getInstance();

        OrderAddModel newOrder = new OrderAddModel();
        newOrder.setOrgId(getOrgId());
        newOrder.setCheckinType(CheckinType.Normal.toString());
        newOrder.setEstimatedArriveTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, 6);
        newOrder.setExpireKeepTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, -6);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        newOrder.setPrePaymentTypeId(_orderData.get("PrePayment"));
        newOrder.setEstimatedDepartureTime(Helper.getFormatDateTime(calendar));
        newOrder.setLiaisons(new Liaison[]{new Liaison(Helper.getRandomChineseName(), Helper.getMobileNumber())});
        newOrder.setRoomPlans(new RoomPlan[]{new RoomPlan(_orderData.get("RoomType"), Integer.valueOf(_orderData.get("OrderAmount")), new RoomPrice[]{new RoomPrice(new BigDecimal(_orderData.get("OrignPrice")), new BigDecimal(_orderData.get("ActualPrice")), _orderData.get("RoomType"), Integer.valueOf(_orderData.get("OrderAmount")))})});

        return new Object[][]{
                {newOrder, new CheckinCustomer(Helper.getRandomChineseName(), TestConstants.CARD_TYPE_C01, Helper.getRandomNumber(18), Helper.getMobileNumber(), false)},
        };
    }

    @DataProvider(name = DATA_QUERYORDERAVAILABLEPROMOTIONS)
    public static Object[][] QueryOrderAvailablePromotions() {
        Calendar calendar = Calendar.getInstance();

        OrderAddModel newOrder = new OrderAddModel();
        newOrder.setOrgId(getOrgId());
        newOrder.setCheckinType(CheckinType.Normal.toString());
        newOrder.setEstimatedArriveTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, 6);
        newOrder.setExpireKeepTime(Helper.getFormatDateTime(calendar));
        calendar.add(Calendar.HOUR_OF_DAY, -6);
        calendar.add(Calendar.DAY_OF_MONTH, +4);
        newOrder.setPrePaymentTypeId(_orderData.get("PrePayment"));
        newOrder.setEstimatedDepartureTime(Helper.getFormatDateTime(calendar));
        newOrder.setLiaisons(new Liaison[]{new Liaison(Helper.getRandomChineseName(), Helper.getMobileNumber())});
        newOrder.setRoomPlans(new RoomPlan[]{new RoomPlan(_orderData.get("RoomType"), Integer.valueOf(_orderData.get("OrderAmount")), new RoomPrice[]{new RoomPrice(new BigDecimal(_orderData.get("OrignPrice")), new BigDecimal(_orderData.get("ActualPrice")), _orderData.get("RoomType"), Integer.valueOf(_orderData.get("OrderAmount")))})});

        return new Object[][]{
                {newOrder,_orderData.get("AvailablePromotion")},
        };
    }
}



