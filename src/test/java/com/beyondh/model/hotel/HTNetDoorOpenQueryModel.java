package com.beyondh.model.hotel;

import com.google.gson.Gson;

public class HTNetDoorOpenQueryModel {
    private long OrgId;
    private long CheckinId;
    private String OpenId;

    public HTNetDoorOpenQueryModel(long orgId, long checkinId) {
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

    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String openId) {
        OpenId = openId;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
