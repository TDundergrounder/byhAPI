package com.beyondh.invoker;

import com.beyondh.client.APIResult;
import com.beyondh.constants.TestConstants;
import com.beyondh.constants.SpringConstants;
import com.beyondh.enums.APICode;
import com.beyondh.model.PagedModel;
import com.beyondh.model.order.OpenSmartDoorLockModel;
import com.beyondh.model.order.SmartDoorLockInfo;
import com.beyondh.model.order.SmartDoorLockSearchModel;
import com.beyondh.model.order.*;
import com.google.gson.reflect.TypeToken;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SpringConstants.SCOPE_SINGLETON)
public class OrderAPIInvoker extends  AbstractAPIInvoker {
    public OrderAPIInvoker()
    {
        super(TestConstants.ORDER_ROUTE);
    }

    public long add(OrderAddModel newOrder)
    {
        APIResult result =  post("Add",newOrder);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(long.class);

        return 0;
    }


    public boolean cancel(OrderCancelModel cancelModel)
    {
        APIResult result =  post("Cancel",cancelModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }


    public OrderInfo QuerySingleOrder(OrderSearchModel model)
    {
        APIResult result =  post("QuerySingleOrder",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(OrderInfo.class);

        return null;
    }

    public PromotionInfo[] QueryOrderAvailablePromotions(OrderAddModel newOrder)
    {
        APIResult result =  post("QueryOrderAvailablePromotions",newOrder);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(PromotionInfo[].class);

        return null;

    }

    public PagedModel<CheckinInfo> QueryCheckins(CheckinSearchModel newOrder)
    {
        APIResult result =  post("QueryCheckins",newOrder);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedModel<CheckinInfo>>(){}.getType());

        return null;
    }

    public boolean dispatchRoom(DispatchOrderRoomModel dispatchOrderRoomModel)
    {
        APIResult result =  post("DispatchRoom",dispatchOrderRoomModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public SmartDoorLockInfo[] queryCheckinSmartDoorLocks(SmartDoorLockSearchModel model)
    {
        APIResult result = post("QueryCheckinSmartDoorLocks", model);
        if (result.getCode().equals(APICode.Success.getCode()))
        return result.getContent(SmartDoorLockInfo[].class);

        return null;
    }

    public boolean openCheckinSmartDoorLock(OpenSmartDoorLockModel model)
    {
        APIResult result = post("OpenCheckinSmartDoorLock", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public boolean addCheckin(AddCheckinModel newModel)
    {
        APIResult result =  post("AddCheckin",newModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public PagedModel<OrderInfo> queryOrders(OrdersSearchModel model)
    {
        APIResult result =  post("QueryOrders",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedModel<OrderInfo>>(){}.getType());

        return null;
    }

    public CheckoutResponse[] checkout(ApplyCheckoutModel model)
    {
        APIResult result =  post("Checkout",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(CheckoutResponse[].class);

        return null;
    }

    public String[] queryUnGeneratedRoomRent(ApplyCheckoutModel model)
    {
        APIResult result =  post("QueryUnGeneratedRoomRent",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(String[].class);

        return null;
    }

    public OccupationSurchargePartInfo[] queryRoomRateCharge(ApplyCheckoutModel model)
    {
        APIResult result =  post("QueryRoomRateCharge",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(OccupationSurchargePartInfo[].class);

        return null;
    }

}
