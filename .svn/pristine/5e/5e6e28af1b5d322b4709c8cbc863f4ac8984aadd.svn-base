package com.beyondh.model.cashingbill;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;

public class CashingBillItemAddModel implements Serializable {
    public long HotelId;
    public long CashingBillId;
    public String BillProjectId;
    public BigDecimal Amount;
    public String BillCreditTypeString;
    public String PayTypeExtention;
    public SmallWareOrderItem[] SmallWareOrders;
    public CashingBillItemDetailAddModel CreditItem;
    public String Memo;
    public BigDecimal TotalAmount;
    public Integer ConfigId;

    public CashingBillItemAddModel()
    {

    }

    public CashingBillItemAddModel(long hotelId, long cashingBillId, String billProjectId, BigDecimal amount, String billCreditTypeString, CashingBillItemDetailAddModel creditItem, String memo, BigDecimal totalAmount) {
        HotelId = hotelId;
        CashingBillId = cashingBillId;
        BillProjectId = billProjectId;
        Amount = amount;
        BillCreditTypeString = billCreditTypeString;
        CreditItem = creditItem;
        Memo = memo;
        TotalAmount = totalAmount;
    }

    public CashingBillItemAddModel(long hotelId, long cashingBillId, String billProjectId, BigDecimal amount, String billCreditTypeString, CashingBillItemDetailAddModel creditItem, String memo, BigDecimal totalAmount, SmallWareOrderItem[] smallWareOrders) {
        HotelId = hotelId;
        CashingBillId = cashingBillId;
        BillProjectId = billProjectId;
        Amount = amount;
        BillCreditTypeString = billCreditTypeString;
        SmallWareOrders = smallWareOrders;
        CreditItem = creditItem;
        Memo = memo;
        TotalAmount = totalAmount;
    }

    public long getHotelId() {
        return HotelId;
    }

    public void setHotelId(long hotelId) {
        HotelId = hotelId;
    }

    public long getCashingBillId() {
        return CashingBillId;
    }

    public void setCashingBillId(long cashingBillId) {
        CashingBillId = cashingBillId;
    }

    public String getBillProjectId() {
        return BillProjectId;
    }

    public void setBillProjectId(String billProjectId) {
        BillProjectId = billProjectId;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public String getBillCreditTypeString() {
        return BillCreditTypeString;
    }

    public void setBillCreditTypeString(String billCreditTypeString) {
        BillCreditTypeString = billCreditTypeString;
    }

    public String getPayTypeExtention() {
        return PayTypeExtention;
    }

    public void setPayTypeExtention(String payTypeExtention) {
        PayTypeExtention = payTypeExtention;
    }

    public SmallWareOrderItem[] getSmallWareOrders() {
        return SmallWareOrders;
    }

    public void setSmallWareOrders(SmallWareOrderItem[] smallWareOrders) {
        SmallWareOrders = smallWareOrders;
    }

    public CashingBillItemDetailAddModel getCreditItem() {
        return CreditItem;
    }

    public void setCreditItem(CashingBillItemDetailAddModel creditItem) {
        CreditItem = creditItem;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }

    public BigDecimal getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        TotalAmount = totalAmount;
    }

    public Integer getConfigId() {
        return ConfigId;
    }

    public void setConfigId(Integer configId) {
        ConfigId = configId;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
