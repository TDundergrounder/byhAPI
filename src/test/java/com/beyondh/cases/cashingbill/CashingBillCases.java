package com.beyondh.cases.cashingbill;

import com.beyondh.cases.AbstractTestCase;
import com.beyondh.constants.TestConstants;
import com.beyondh.dataprovider.CashingBillDataProvider;
import com.beyondh.model.cashingbill.CashingBillAddModel;
import com.beyondh.model.cashingbill.CashingBillInfo;
import com.beyondh.model.cashingbill.CashingBillItemAddModel;
import com.beyondh.model.cashingbill.CashingBillSearchModel;
import com.beyondh.utility.ClientGroup;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

@Test(groups = (TestConstants.GRPOUP_CASHINGBILL),singleThreaded=true)
@ClientGroup(TestConstants.GRPOUP_CASHINGBILL)
public class CashingBillCases extends AbstractTestCase {


    @Test(dataProvider = CashingBillDataProvider.DATA_ADDCASHINGBILL,dataProviderClass = CashingBillDataProvider.class)
    private void addCashingBillCase(CashingBillAddModel newBill) {
        boolean result = _cashingBillAPIInvoker.addCashingBill(newBill);
        Assert.assertTrue(result);

        CashingBillSearchModel query = new CashingBillSearchModel(newBill.getHotelId());
        CashingBillInfo[] cashbingBills = _cashingBillAPIInvoker.searchCashingBills(query);
        CashingBillInfo cashingBillInfo = Arrays.stream(cashbingBills).filter(bill->bill.getName().equals(newBill.getName())).findFirst().orElse(null);
        Assert.assertNotNull(cashingBillInfo);
        Assert.assertEquals(cashingBillInfo.getBillProjects()[0],newBill.getBillProjects()[0]);
    }

    @Test(dataProvider = CashingBillDataProvider.DATA_ADDCASHINGBILLITEM,dataProviderClass = CashingBillDataProvider.class)
    private void addCashingBillItemCase(CashingBillItemAddModel newBillItem) {
        boolean result = _cashingBillAPIInvoker.addCashingBillItem(newBillItem);
        Assert.assertTrue(result);
    }
}
