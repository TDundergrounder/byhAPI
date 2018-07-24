package com.beyondh.model.order;

import com.beyondh.constants.TestConstants;
import com.google.gson.Gson;

import java.io.Serializable;

public class CheckinSearchModel implements Serializable {
    private int PageSize;

    private int PageIndex;

    private long OrgId;

    private long[] OrderIds;

    private long[] OccupationIds;

    private long[] CheckinIds;

    private String[] RoomNumbers;

    private String[] CheckinStatus;

    private String MemberId;

    private String Mobile;

    private String IdCardNumber;

    public CheckinSearchModel(long orgId) {
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
        PageIndex =1;
        OrgId = orgId;
    }

    public CheckinSearchModel(long orgId, long[] orderIds) {
        OrgId = orgId;
        OrderIds = orderIds;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
        PageIndex =1;
    }

    public CheckinSearchModel(long orgId, String memberId) {
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
        PageIndex =1;
        OrgId = orgId;
        MemberId = memberId;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public int getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(int pageIndex) {
        PageIndex = pageIndex;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public long[] getOrderIds() {
        return OrderIds;
    }

    public void setOrderIds(long[] orderIds) {
        OrderIds = orderIds;
    }

    public long[] getOccupationIds() {
        return OccupationIds;
    }

    public void setOccupationIds(long[] occupationIds) {
        OccupationIds = occupationIds;
    }

    public long[] getCheckinIds() {
        return CheckinIds;
    }

    public void setCheckinIds(long[] checkinIds) {
        CheckinIds = checkinIds;
    }

    public String[] getRoomNumbers() {
        return RoomNumbers;
    }

    public void setRoomNumbers(String[] roomNumbers) {
        RoomNumbers = roomNumbers;
    }

    public String[] getCheckinStatus() {
        return CheckinStatus;
    }

    public void setCheckinStatus(String[] checkinStatus) {
        CheckinStatus = checkinStatus;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getIdCardNumber() {
        return IdCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        IdCardNumber = idCardNumber;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
