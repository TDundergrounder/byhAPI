package com.beyondh.cases.bill;

import com.beyondh.constants.CreditConstants;
import com.beyondh.constants.DebitConstants;
import com.beyondh.constants.TestConstants;
import com.beyondh.cases.AbstractTestCase;
import com.beyondh.dataprovider.BillDataProvider;
import com.beyondh.enums.pms.BillItemType;
import com.beyondh.model.bill.*;
import com.beyondh.utility.ClientGroup;
import com.beyondh.utility.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Calendar;

@Test(groups = (TestConstants.GRPOUP_BILL),singleThreaded=true)
@ClientGroup(TestConstants.GRPOUP_BILL)
public class BillCases extends AbstractTestCase {

    @Test(dataProvider = BillDataProvider.DATA_GETBILLBALANCE,dataProviderClass = BillDataProvider.class)
    private void getBillBalanceCase(BillBalanceGetModel query)
    {
        BigDecimal balanceBefore = _billInvoker.GetBillBalance(query);

        BillItemAddModel newBillItem = new BillItemAddModel(query.getHotelId(),query.getBillId(),
                BillItemType.Credit.getStringValue(),
                CreditConstants.CREDIT_C9110,
                Helper.NextDouble(100),
                null);
        long creditItemBillId = _billInvoker.addBillItem(newBillItem).getBillItemId();
        Assert.assertTrue(creditItemBillId > 0);

        BigDecimal balanceAfter = _billInvoker.GetBillBalance(query);
        Assert.assertEquals(balanceBefore.add(newBillItem.getAmount()),balanceAfter.setScale(2, RoundingMode.HALF_UP));

        newBillItem.setBillItemType(BillItemType.Debit.getStringValue());
        newBillItem.setSubItemType(DebitConstants.DEBIT_D2000);
        newBillItem.setAmount(Helper.NextDouble(100));
        long debitItemBillId = _billInvoker.addBillItem(newBillItem).getBillItemId();
        Assert.assertTrue(debitItemBillId > 0);

        BigDecimal balanceAfterDebit = _billInvoker.GetBillBalance(query);
        Assert.assertEquals(balanceAfter.subtract(newBillItem.getAmount()),balanceAfterDebit.setScale(2, RoundingMode.HALF_UP));

        //roll back
        Assert.assertTrue(_billInvoker.rollback(new BillRollbackModel(query.getHotelId(),new long[]{creditItemBillId,debitItemBillId},"rolled back by getBillBalanceCase")));
        balanceAfterDebit = _billInvoker.GetBillBalance(query);
        Assert.assertEquals(balanceBefore.setScale(2, RoundingMode.HALF_UP),balanceAfterDebit.setScale(2, RoundingMode.HALF_UP));
    }

    @Test(dataProvider = BillDataProvider.DATA_ADDBILLITEMS,dataProviderClass = BillDataProvider.class)
    private void addBillItemsCase(BillItemAddModel newBillItem)
    {
        BillItemInfo result = _billInvoker.addBillItem(newBillItem);
        Assert.assertTrue(result.getBillId() > 0);
        Assert.assertEquals(result.getAmount().abs(),newBillItem.getAmount());

        boolean isCredit = newBillItem.getBillItemType().equals(BillItemType.Credit.getStringValue());
        Assert.assertEquals(isCredit ? result.getCreditType() :result.getDebitType() ,newBillItem.getSubItemType());

        BillItemsGetModel billItemsGet = new BillItemsGetModel(new long[]{result.getBillItemId()},newBillItem.getHotelId());
        BillItemInfo[] billItems = _billInvoker.getBillItems(billItemsGet);
        Assert.assertTrue(billItems.length == 1);
        Assert.assertEquals(billItems[0].getAmount().abs(),newBillItem.getAmount());
        Assert.assertEquals(isCredit ? billItems[0].getCreditType() :billItems[0].getDebitType() ,newBillItem.getSubItemType());
    }

    @Test(dataProvider = BillDataProvider.DATA_ONLINEPAYMENT,dataProviderClass = BillDataProvider.class)
    private void onlinePaymentCase(OnlinePaymentAddModel model,String bankType) {
        OnlinePaymentInfo result = _billInvoker.addOnlinePayment(model);
        Assert.assertNotNull(result);

        PayResultInfo payResultInfo = _billInvoker.searchPayResult(new PayResultSearchModel(model.getHotelId(),result.getId(),model.getPayType()));
        Assert.assertNotNull(payResultInfo);
        Assert.assertFalse(payResultInfo.isSuccess());

        Calendar calendar = Calendar.getInstance();
        OnlinePaymentUpdateModel onlinePaymentUpdateRequest = new OnlinePaymentUpdateModel(model.getHotelId(),
                result.getId(),
                Helper.getRandomNumber(28),
                bankType,Helper.getRandomNumber(12),
                model.getAmount(),
                Helper.getFormatDateTime(calendar),
                true,
                Long.valueOf(Helper.getRandomNumber(4)));
        OnlinePaymentInfo updateResult = _billInvoker.updateOnlinePayment(onlinePaymentUpdateRequest);
        Assert.assertNotNull(updateResult);

        payResultInfo = _billInvoker.searchPayResult(new PayResultSearchModel(model.getHotelId(),result.getId(),model.getPayType()));
        Assert.assertNotNull(payResultInfo);
        Assert.assertEquals(payResultInfo.getPayAmount(),onlinePaymentUpdateRequest.getPayAmount());
        Assert.assertEquals(payResultInfo.getTransactionID(),onlinePaymentUpdateRequest.getTransctionId());
        Assert.assertEquals(payResultInfo.isSuccess(),onlinePaymentUpdateRequest.getIsSuccess());
    }

    @Test(dataProvider = BillDataProvider.DATA_GENERATEADDITIONALROOMRENT,dataProviderClass = BillDataProvider.class)
    private void generateAdditionalRoomRentCase(AdditionalRoomRentGenerateModel model) {

        boolean result = _billInvoker.generateAdditionalRoomRent(model);
        Assert.assertTrue(result);
    }
}
