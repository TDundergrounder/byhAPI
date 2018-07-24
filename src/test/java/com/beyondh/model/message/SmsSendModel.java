package com.beyondh.model.message;

public class SmsSendModel {

    private long HotelId;

    private String GroupName;

    private String HotelName;

    private String HotelAddress;

    private String HotelPhone;

    private String BeginTime;

    private String EndTime;

    private String OrderNumber;

    private String Rooms;

    private String TotalValue;

    private String MemberName;

    private String EventTime;

    private String ValueAmount;

    private String ValueBalance;

    private String Mobile;

    private String EventCode;

    private String Remark;

    public SmsSendModel(String mobile, String eventCode, String remark) {
        Mobile = mobile;
        EventCode = eventCode;
        Remark = remark;
    }

    public long getHotelId() {
        return HotelId;
    }

    public void setHotelId(long hotelId) {
        HotelId = hotelId;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getHotelAddress() {
        return HotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        HotelAddress = hotelAddress;
    }

    public String getHotelPhone() {
        return HotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        HotelPhone = hotelPhone;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getRooms() {
        return Rooms;
    }

    public void setRooms(String rooms) {
        Rooms = rooms;
    }

    public String getTotalValue() {
        return TotalValue;
    }

    public void setTotalValue(String totalValue) {
        TotalValue = totalValue;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getEventTime() {
        return EventTime;
    }

    public void setEventTime(String eventTime) {
        EventTime = eventTime;
    }

    public String getValueAmount() {
        return ValueAmount;
    }

    public void setValueAmount(String valueAmount) {
        ValueAmount = valueAmount;
    }

    public String getValueBalance() {
        return ValueBalance;
    }

    public void setValueBalance(String valueBalance) {
        ValueBalance = valueBalance;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEventCode() {
        return EventCode;
    }

    public void setEventCode(String eventCode) {
        EventCode = eventCode;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
