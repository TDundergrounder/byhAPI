package com.beyondh.model.bill;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BillItemAddModel implements Serializable {
    private long HotelId;

    private long BillId;

    private String BillItemType;

    private String SubItemType;

    private boolean IsDeposit;

    private BigDecimal Amount;

    private String Memo;

    private PaymentModel PaymentRequest;

    private long ExternalRefId;

    private SmallWareOrderItem[] SmallWareOrders;

    private long[] CheckBillIds;

    private String ItemCategory;

    private BigDecimal TotalAmount;

    public BillItemAddModel(long hotelId, long billId, String billItemType, String subItemType, BigDecimal amount, String memo) {
        HotelId = hotelId;
        BillId = billId;
        BillItemType = billItemType;
        SubItemType = subItemType;
        Amount = amount;
        Memo = memo;
        ItemCategory = "A";
    }

    public BillItemAddModel(long hotelId, long billId, String billItemType, String subItemType, BigDecimal amount, String memo, PaymentModel paymentRequest) {
        HotelId = hotelId;
        BillId = billId;
        BillItemType = billItemType;
        SubItemType = subItemType;
        Amount = amount;
        Memo = memo;
        PaymentRequest = paymentRequest;
    }

    public BillItemAddModel(long hotelId, long billId, String billItemType, String subItemType, boolean isDeposit, BigDecimal amount, String memo, PaymentModel paymentRequest, SmallWareOrderItem[] smallWareOrders, long[] checkBillIds, BigDecimal totalAmount) {
        HotelId = hotelId;
        BillId = billId;
        BillItemType = billItemType;
        SubItemType = subItemType;
        IsDeposit = isDeposit;
        Amount = amount;
        Memo = memo;
        PaymentRequest = paymentRequest;
        SmallWareOrders = smallWareOrders;
        CheckBillIds = checkBillIds;
        TotalAmount = totalAmount;
        ItemCategory = "A";
    }

    public long getHotelId() {
        return HotelId;
    }

    public void setHotelId(long hotelId) {
        HotelId = hotelId;
    }

    public long getBillId() {
        return BillId;
    }

    public void setBillId(long billId) {
        BillId = billId;
    }

    public String getBillItemType() {
        return BillItemType;
    }

    public void setBillItemType(String billItemType) {
        BillItemType = billItemType;
    }

    public String getSubItemType() {
        return SubItemType;
    }

    public void setSubItemType(String subItemType) {
        SubItemType = subItemType;
    }

    public boolean isDeposit() {
        return IsDeposit;
    }

    public void setDeposit(boolean deposit) {
        IsDeposit = deposit;
    }

    public BigDecimal getAmount() {
        return Amount.setScale(2, RoundingMode.HALF_UP);
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }

    public PaymentModel getPaymentRequest() {
        return PaymentRequest;
    }

    public void setPaymentRequest(PaymentModel paymentRequest) {
        PaymentRequest = paymentRequest;
    }

    public long getExternalRefId() {
        return ExternalRefId;
    }

    public void setExternalRefId(long externalRefId) {
        ExternalRefId = externalRefId;
    }

    public SmallWareOrderItem[] getSmallWareOrders() {
        return SmallWareOrders;
    }

    public void setSmallWareOrders(SmallWareOrderItem[] smallWareOrders) {
        SmallWareOrders = smallWareOrders;
    }

    public long[] getCheckBillIds() {
        return CheckBillIds;
    }

    public void setCheckBillIds(long[] checkBillIds) {
        CheckBillIds = checkBillIds;
    }

    public String getItemCategory() {
        return ItemCategory;
    }

    public void setItemCategory(String itemCategory) {
        ItemCategory = itemCategory;
    }

    public BigDecimal getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        TotalAmount = totalAmount;
    }
    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
