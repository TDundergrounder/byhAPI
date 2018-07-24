package com.beyondh.invoker;

import com.beyondh.client.APIResult;
import com.beyondh.constants.SpringConstants;
import com.beyondh.constants.TestConstants;
import com.beyondh.enums.APICode;
import com.beyondh.model.cashingbill.CashingBillAddModel;
import com.beyondh.model.cashingbill.CashingBillInfo;
import com.beyondh.model.cashingbill.CashingBillSearchModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import  com.beyondh.model.cashingbill.CashingBillItemAddModel;

import java.math.BigDecimal;

@Component
@Scope(SpringConstants.SCOPE_SINGLETON)
public class CashingBillAPIInvoker extends  AbstractAPIInvoker {
    public CashingBillAPIInvoker()
    {
        super(TestConstants.CASHINGBILL_ROUTE);
    }

    public boolean addCashingBill(CashingBillAddModel billAddModel)
    {
        APIResult result =  post("AddCashingBill",billAddModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public CashingBillInfo[] searchCashingBills(CashingBillSearchModel searchModel)
    {
        APIResult result =  post("SearchCashingBills",searchModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(CashingBillInfo[].class);

        return null;
    }

    public boolean addCashingBillItem(CashingBillItemAddModel billAddModel)
    {
        APIResult result =  post("AddCashingBillItem",billAddModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }
}
