package com.beyondh.invoker;

import com.beyondh.client.APIResult;
import com.beyondh.constants.SpringConstants;
import com.beyondh.enums.APICode;
import com.beyondh.model.bill.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.beyondh.constants.TestConstants;

import java.math.BigDecimal;

@Component
//全局只有一个实例
@Scope(SpringConstants.SCOPE_SINGLETON)
public class BillAPIInvoker extends AbstractAPIInvoker {

    public BillAPIInvoker()
    {
        super(TestConstants.BILL_ROUTE);
    }

    public BigDecimal GetBillBalance(BillBalanceGetModel billGetModel)
    {
        APIResult result =  post("GetBillBalance",billGetModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(BigDecimal.class);

        return null;
    }

    public BillItemInfo[] getBillItems(BillItemsGetModel query)
    {
        APIResult result =  post("GetBillItems",query);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(BillItemInfo[].class);

        return null;
    }

    public BillItemInfo addBillItem(BillItemAddModel newBillItem) {
        APIResult result = post("AddBillItem", newBillItem);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(BillItemInfo.class);

        return null;
    }


    public OnlinePaymentInfo addOnlinePayment(OnlinePaymentAddModel model)
    {
        APIResult result = post("AddOnlinePayment", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(OnlinePaymentInfo.class);

        return null;
    }

    public PayResultInfo searchPayResult(PayResultSearchModel model)
    {
        APIResult result = post("SearchPayResult", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(PayResultInfo.class);

        return null;
    }

    public OnlinePaymentInfo updateOnlinePayment(OnlinePaymentUpdateModel model)
    {
        APIResult result = post("UpdateOnlinePayment", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(OnlinePaymentInfo.class);

        return null;
    }

    public boolean generateAdditionalRoomRent(AdditionalRoomRentGenerateModel model)
    {
        APIResult result = post("GenerateAdditionalRoomRent", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public boolean rollback(BillRollbackModel model)
    {
        APIResult result = post("Rollback", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }
}
