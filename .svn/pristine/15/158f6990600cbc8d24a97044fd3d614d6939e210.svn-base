package com.beyondh.model.order;

import com.google.gson.Gson;

public class SmartDoorLockSearchModel {
    public long OrgId;

    public long[] CheckinIds;

    public Boolean IncludeLockDetail;

    public SmartDoorLockSearchModel(long orgId, long[] checkinIds) {
        OrgId = orgId;
        CheckinIds = checkinIds;
        IncludeLockDetail =false;
    }

    public SmartDoorLockSearchModel(long orgId, long[] checkinIds, Boolean includeLockDetail) {
        OrgId = orgId;
        CheckinIds = checkinIds;
        IncludeLockDetail = includeLockDetail;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public long[] getCheckinIds() {
        return CheckinIds;
    }

    public void setCheckinIds(long[] checkinIds) {
        CheckinIds = checkinIds;
    }

    public Boolean getIncludeLockDetail() {
        return IncludeLockDetail;
    }

    public void setIncludeLockDetail(Boolean includeLockDetail) {
        IncludeLockDetail = includeLockDetail;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
