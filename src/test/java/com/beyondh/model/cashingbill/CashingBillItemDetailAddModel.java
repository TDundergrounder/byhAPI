package com.beyondh.model.cashingbill;

import com.beyondh.model.bill.PaymentModel;

import java.math.BigDecimal;

public class CashingBillItemDetailAddModel {
    public Long BillId;
    public String ItemCategory;
    public String ItemType;
    public String SubItemType;
    public Boolean IsDeposit;
    public BigDecimal Amount;
    public String Memo;
    public PaymentModel PaymentModel;
    public SmallWareOrderItem[] SmallWareOrders;
    public BigDecimal TotalAmount;

    public CashingBillItemDetailAddModel(String itemCategory, String itemType, String subItemType, BigDecimal amount, com.beyondh.model.bill.PaymentModel paymentModel) {
        ItemCategory = itemCategory;
        ItemType = itemType;
        SubItemType = subItemType;
        IsDeposit =false;
        Amount = amount;
        PaymentModel = paymentModel;
    }

    public Long getBillId() {
        return BillId;
    }

    public void setBillId(Long billId) {
        BillId = billId;
    }

    public String getItemCategory() {
        return ItemCategory;
    }

    public void setItemCategory(String itemCategory) {
        ItemCategory = itemCategory;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String itemType) {
        ItemType = itemType;
    }

    public String getSubItemType() {
        return SubItemType;
    }

    public void setSubItemType(String subItemType) {
        SubItemType = subItemType;
    }

    public Boolean getDeposit() {
        return IsDeposit;
    }

    public void setDeposit(Boolean deposit) {
        IsDeposit = deposit;
    }

    public BigDecimal getAmount() {
        return Amount;
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

    public com.beyondh.model.bill.PaymentModel getPaymentModel() {
        return PaymentModel;
    }

    public void setPaymentModel(com.beyondh.model.bill.PaymentModel paymentModel) {
        PaymentModel = paymentModel;
    }

    public SmallWareOrderItem[] getSmallWareOrders() {
        return SmallWareOrders;
    }

    public void setSmallWareOrders(SmallWareOrderItem[] smallWareOrders) {
        SmallWareOrders = smallWareOrders;
    }

    public BigDecimal getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        TotalAmount = totalAmount;
    }
}
