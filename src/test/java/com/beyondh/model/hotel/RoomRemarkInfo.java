package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.io.Serializable;

public class RoomRemarkInfo implements Serializable {
    public long OrgId;
    public String OrgName;
    public long CheckinId;
    public String RoomNumber;
    public int CleanScore;
    public int FacilityScore;
    public int ServiceScore;
    public int LocationScore;
    public boolean IsAlsoCheckIn;
    public String Remark;
    public String ReplyContent;
    public String CreateTime;

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public long getCheckinId() {
        return CheckinId;
    }

    public void setCheckinId(long checkinId) {
        CheckinId = checkinId;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        RoomNumber = roomNumber;
    }

    public int getCleanScore() {
        return CleanScore;
    }

    public void setCleanScore(int cleanScore) {
        CleanScore = cleanScore;
    }

    public int getFacilityScore() {
        return FacilityScore;
    }

    public void setFacilityScore(int facilityScore) {
        FacilityScore = facilityScore;
    }

    public int getServiceScore() {
        return ServiceScore;
    }

    public void setServiceScore(int serviceScore) {
        ServiceScore = serviceScore;
    }

    public int getLocationScore() {
        return LocationScore;
    }

    public void setLocationScore(int locationScore) {
        LocationScore = locationScore;
    }

    public boolean isAlsoCheckIn() {
        return IsAlsoCheckIn;
    }

    public void setAlsoCheckIn(boolean alsoCheckIn) {
        IsAlsoCheckIn = alsoCheckIn;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getReplyContent() {
        return ReplyContent;
    }

    public void setReplyContent(String replyContent) {
        ReplyContent = replyContent;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
