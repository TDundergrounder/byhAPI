package com.beyondh.model.coupon;

import java.math.BigDecimal;

public class CouponDeductionInfo {
    private String RoomNumber;

    private BigDecimal Discount;

    private long BillId;

    private String Date;

    private String EntrySubject;

    private long DiscountedBillItemId;

    private String DiscountedBillItemSubject;

    public CouponDeductionInfo(String roomNumber, BigDecimal discount, long billId, String date, String entrySubject, long discountedBillItemId, String discountedBillItemSubject) {
        RoomNumber = roomNumber;
        Discount = discount;
        BillId = billId;
        Date = date;
        EntrySubject = entrySubject;
        DiscountedBillItemId = discountedBillItemId;
        DiscountedBillItemSubject = discountedBillItemSubject;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    public BigDecimal getDiscount() {
        return Discount;
    }

    public void setDiscount(BigDecimal discount) {
        Discount = discount;
    }

    public long getBillId() {
        return BillId;
    }

    public void setBillId(long billId) {
        BillId = billId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getEntrySubject() {
        return EntrySubject;
    }

    public void setEntrySubject(String entrySubject) {
        EntrySubject = entrySubject;
    }

    public long getDiscountedBillItemId() {
        return DiscountedBillItemId;
    }

    public void setDiscountedBillItemId(long discountedBillItemId) {
        DiscountedBillItemId = discountedBillItemId;
    }

    public String getDiscountedBillItemSubject() {
        return DiscountedBillItemSubject;
    }

    public void setDiscountedBillItemSubject(String discountedBillItemSubject) {
        DiscountedBillItemSubject = discountedBillItemSubject;
    }
}
