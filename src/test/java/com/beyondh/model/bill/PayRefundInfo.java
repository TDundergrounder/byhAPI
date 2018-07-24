package com.beyondh.model.bill;

public class PayRefundInfo {
    private long BillItemId;
    private long OnlinePaymentId;
    private String TransactionId;
    private String RefundId;

    public long getBillItemId() {
        return BillItemId;
    }

    public void setBillItemId(long billItemId) {
        BillItemId = billItemId;
    }

    public long getOnlinePaymentId() {
        return OnlinePaymentId;
    }

    public void setOnlinePaymentId(long onlinePaymentId) {
        OnlinePaymentId = onlinePaymentId;
    }

    public String getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(String transactionId) {
        TransactionId = transactionId;
    }

    public String getRefundId() {
        return RefundId;
    }

    public void setRefundId(String refundId) {
        RefundId = refundId;
    }
}
