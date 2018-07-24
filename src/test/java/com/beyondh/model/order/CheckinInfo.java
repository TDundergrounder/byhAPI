package com.beyondh.model.order;

import com.google.gson.Gson;

import java.io.Serializable;

public class CheckinInfo implements Serializable {
    private long OrgId;


    private long CheckinId;

    private long OrderId;

    private long OccupationId;


    private String RoomNumber;


    private long BillId;


    private String CheckinStatus;


    private Liaison CheckinCustomer;


    private String ActualArriveTime;


    private String ActualDepatureTime;


    private String EstimatedDepartureTime;


    private String Memo;


    private boolean IsMainBill;

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public long getCheckinId() {
        return CheckinId;
    }

    public void setCheckinId(long checkinId) {
        CheckinId = checkinId;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public long getOccupationId() {
        return OccupationId;
    }

    public void setOccupationId(long occupationId) {
        OccupationId = occupationId;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    public long getBillId() {
        return BillId;
    }

    public void setBillId(long billId) {
        BillId = billId;
    }

    public String getCheckinStatus() {
        return CheckinStatus;
    }

    public void setCheckinStatus(String checkinStatus) {
        CheckinStatus = checkinStatus;
    }

    public Liaison getCheckinCustomer() {
        return CheckinCustomer;
    }

    public void setCheckinCustomer(Liaison checkinCustomer) {
        CheckinCustomer = checkinCustomer;
    }

    public String getActualArriveTime() {
        return ActualArriveTime.replaceAll("T", " ");
    }

    public void setActualArriveTime(String actualArriveTime) {
        ActualArriveTime = actualArriveTime;
    }

    public String getActualDepatureTime() {
        return ActualDepatureTime.replaceAll("T", " ");
    }

    public void setActualDepatureTime(String actualDepatureTime) {
        ActualDepatureTime = actualDepatureTime;
    }

    public String getEstimatedDepartureTime() {
        return EstimatedDepartureTime.replaceAll("T", " ");
    }

    public void setEstimatedDepartureTime(String estimatedDepartureTime) {
        EstimatedDepartureTime = estimatedDepartureTime;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }

    public boolean isMainBill() {
        return IsMainBill;
    }

    public void setMainBill(boolean mainBill) {
        IsMainBill = mainBill;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
