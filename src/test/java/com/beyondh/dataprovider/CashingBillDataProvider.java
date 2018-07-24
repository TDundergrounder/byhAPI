package com.beyondh.dataprovider;

import com.beyondh.constants.CreditConstants;
import com.beyondh.constants.DebitConstants;
import com.beyondh.constants.TestConstants;
import com.beyondh.enums.pms.BillItemType;
import com.beyondh.model.bill.PaymentModel;
import com.beyondh.model.cashingbill.CashingBillAddModel;
import com.beyondh.model.cashingbill.CashingBillItemAddModel;
import com.beyondh.model.cashingbill.CashingBillItemDetailAddModel;
import com.beyondh.model.cashingbill.SmallWareOrderItem;
import com.beyondh.utility.ClientGroup;
import com.beyondh.utility.Helper;
import org.testng.annotations.DataProvider;

import java.math.BigDecimal;

@ClientGroup(TestConstants.GRPOUP_CASHINGBILL)
public class CashingBillDataProvider extends  AbstractTestDataProvider {
    public static final String DATA_ADDCASHINGBILL = "AddCashingBillCase";

    public static final String DATA_ADDCASHINGBILLITEM = "AddCashingBillItemCase";

    @DataProvider(name = DATA_ADDCASHINGBILL)
    public static Object[][] addCashingBillCaseData() {
        return new Object[][]{
                {new CashingBillAddModel(Helper.getRandomChinese(6),new String[]{DebitConstants.DEBIT_D2000},getOrgId())},
        };
    }

    @DataProvider(name = DATA_ADDCASHINGBILLITEM)
    public static Object[][] addCashingBillItemCaseData() {

        BigDecimal amount = Helper.NextDouble(10,50);

        BigDecimal goodNumber = new BigDecimal(8);
        BigDecimal goodPrice = new BigDecimal(_commonData.get("GoodPrice"));
        BigDecimal goodAmount =goodNumber.multiply(goodPrice);
        return new Object[][]{
                {       new CashingBillItemAddModel(
                        getOrgId(),
                        Long.valueOf(_commonData.get("CashingBillIdMemberValue")),
                        DebitConstants.DEBIT_D7900,
                        amount,
                        CreditConstants.CREDIT_C9110,
                        new CashingBillItemDetailAddModel(_commonData.get("ItemCategory"), BillItemType.Credit.toString(), CreditConstants.CREDIT_C9110,amount,new PaymentModel(amount,_commonData.get("MemberId"))),
                        "",
                        amount)
                },
                {       new CashingBillItemAddModel(
                        getOrgId(),
                        Long.valueOf(_commonData.get("CashingBillIdGoodValue")),
                        DebitConstants.DEBIT_D6500,
                        goodAmount,
                        CreditConstants.CREDIT_C9110,
                        new CashingBillItemDetailAddModel(_commonData.get("ItemCategory"), BillItemType.Credit.toString(), CreditConstants.CREDIT_C9110,goodAmount,new PaymentModel(goodAmount)),
                        "",
                        goodAmount,
                        new SmallWareOrderItem[]{new SmallWareOrderItem(_commonData.get("GoodId"),_commonData.get("GoodName"),goodNumber.intValue(),goodPrice)})
                }
        };
    }
}
