package com.beyondh.model.Member;

import com.google.gson.Gson;

public class GiftExchangeModel {
    private String MemberId;
    private long OrgId;
    private String Recipients;
    private String Remark;
    private GiftExchangeItemModel[] Gifts;

    public GiftExchangeModel(String memberId, long orgId, String recipients, String remark, GiftExchangeItemModel[] gifts) {
        MemberId = memberId;
        OrgId = orgId;
        Recipients = recipients;
        Remark = remark;
        Gifts = gifts;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getRecipients() {
        return Recipients;
    }

    public void setRecipients(String recipients) {
        Recipients = recipients;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public GiftExchangeItemModel[] getGifts() {
        return Gifts;
    }

    public void setGifts(GiftExchangeItemModel[] gifts) {
        Gifts = gifts;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
