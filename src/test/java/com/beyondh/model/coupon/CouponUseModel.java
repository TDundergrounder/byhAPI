package com.beyondh.model.coupon;

import com.google.gson.Gson;

public class CouponUseModel {
    private String MemberId;
    private String MobileNo;
    private String UserOtherId;
    private long OrgId;
    private String SerialNo;
    private String RoomTypeId;
    private String CheckInDate;
    private String CheckOutDate;
    private long OrderId;
    private long BillId;
    private String UserFromType;

    public CouponUseModel(String memberId, String mobileNo, String userOtherId, long orgId, long orderId, long billId,String roomTypeId) {
        MemberId = memberId;
        MobileNo = mobileNo;
        UserOtherId = userOtherId;
        OrgId = orgId;
        OrderId = orderId;
        BillId = billId;
        RoomTypeId = roomTypeId;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getUserOtherId() {
        return UserOtherId;
    }

    public void setUserOtherId(String userOtherId) {
        UserOtherId = userOtherId;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String serialNo) {
        SerialNo = serialNo;
    }

    public String getRoomTypeId() {
        return RoomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        RoomTypeId = roomTypeId;
    }

    public String getCheckInDate() {
        return CheckInDate;
    }

    public void setCheckInDate(String checkInDate) {
        CheckInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return CheckOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        CheckOutDate = checkOutDate;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public long getBillId() {
        return BillId;
    }

    public void setBillId(long billId) {
        BillId = billId;
    }

    public String getUserFromType() {
        return UserFromType;
    }

    public void setUserFromType(String userFromType) {
        UserFromType = userFromType;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
