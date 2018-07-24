package com.beyondh.model.hotel;

import com.google.gson.Gson;

public class WechatLocationModel {
    private long OrgId;
    private String WechatLocation;

    public WechatLocationModel(long orgId, String wechatLocation) {
        OrgId = orgId;
        WechatLocation = wechatLocation;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getWechatLocation() {
        return WechatLocation;
    }

    public void setWechatLocation(String wechatLocation) {
        WechatLocation = wechatLocation;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
