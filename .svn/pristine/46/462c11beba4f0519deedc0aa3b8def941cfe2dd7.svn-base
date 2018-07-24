package com.beyondh.model.bill;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class BillItemInfo implements Serializable {
    private Long BillItemId;

    private Long OrderId;

    private String OrderNo;

    private String RoomNumber;

    private String CheckinName;

    private String ArriveTime;

   private String DepartureTime;

    private Long BillId;

    private String BillNo;

    private String BusinessDate;

    private String ItemType;

    private String CreditType;

    private String DebitType;

    private String BillName;

    private BigDecimal Amount;

    private String Memo;

    private String CreatorName;

    private String CreateTimeInUtc;

    private Long TransactoinId;

    public Long getBillItemId() {
        return BillItemId;
    }

    public void setBillItemId(Long billItemId) {
        BillItemId = billItemId;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String orderNo) {
        OrderNo = orderNo;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getCheckinName() {
        return CheckinName;
    }

    public void setCheckinName(String checkinName) {
        CheckinName = checkinName;
    }

    public String getArriveTime() {
        return ArriveTime;
    }

    public void setArriveTime(String arriveTime) {
        ArriveTime = arriveTime;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public Long getBillId() {
        return BillId;
    }

    public void setBillId(Long billId) {
        BillId = billId;
    }

    public String getBillNo() {
        return BillNo;
    }

    public void setBillNo(String billNo) {
        BillNo = billNo;
    }

    public String getBusinessDate() {
        return BusinessDate;
    }

    public void setBusinessDate(String businessDate) {
        BusinessDate = businessDate;
    }

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String itemType) {
        ItemType = itemType;
    }

    public String getCreditType() {
        return CreditType;
    }

    public void setCreditType(String creditType) {
        CreditType = creditType;
    }

    public String getDebitType() {
        return DebitType;
    }

    public void setDebitType(String debitType) {
        DebitType = debitType;
    }

    public String getBillName() {
        return BillName;
    }

    public void setBillName(String billName) {
        BillName = billName;
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

    public String getCreatorName() {
        return CreatorName;
    }

    public void setCreatorName(String creatorName) {
        CreatorName = creatorName;
    }

    public String getCreateTimeInUtc() {
        return CreateTimeInUtc;
    }

    public void setCreateTimeInUtc(String createTimeInUtc) {
        CreateTimeInUtc = createTimeInUtc;
    }

    public Long getTransactoinId() {
        return TransactoinId;
    }

    public void setTransactoinId(Long transactoinId) {
        TransactoinId = transactoinId;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
