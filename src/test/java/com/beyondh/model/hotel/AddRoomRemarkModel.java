package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.io.Serializable;

public class AddRoomRemarkModel implements Serializable {
    private long OrgId;

    private long CheckinId;

    private String MemberId;

    private int CleanScore;

    private int FacilityScore;

    private int ServiceScore;

    private String Remark;

    private int LocationScore;

    private boolean IsAlsoCheckIn;

    public AddRoomRemarkModel(long orgId, long checkinId, int cleanScore, int facilityScore, int serviceScore, String remark, int locationScore) {
        OrgId = orgId;
        CheckinId = checkinId;
        CleanScore = cleanScore;
        FacilityScore = facilityScore;
        ServiceScore = serviceScore;
        Remark = remark;
        LocationScore = locationScore;
    }

    public AddRoomRemarkModel(long orgId, long checkinId, String memberId, int cleanScore, int facilityScore, int serviceScore, String remark, int locationScore, boolean isAlsoCheckIn) {
        OrgId = orgId;
        CheckinId = checkinId;
        MemberId = memberId;
        CleanScore = cleanScore;
        FacilityScore = facilityScore;
        ServiceScore = serviceScore;
        Remark = remark;
        LocationScore = locationScore;
        IsAlsoCheckIn = isAlsoCheckIn;
    }

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

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
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

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
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

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
