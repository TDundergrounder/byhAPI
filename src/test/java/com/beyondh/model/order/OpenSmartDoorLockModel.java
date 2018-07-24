package com.beyondh.model.order;

import com.google.gson.Gson;

public class OpenSmartDoorLockModel {
    public long OrgId;
    public long CheckinId;

    public OpenSmartDoorLockModel(long orgId, long checkinId) {
        OrgId = orgId;
        CheckinId = checkinId;
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

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
