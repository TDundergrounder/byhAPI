package com.beyondh.model.Member;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class AcquireValueModel {
    private String MemberId;

    private BigDecimal Value;

    private String Remark;

    private long OrgId;

    private String MoneyWay;

    private String MoneyChannel;

    public AcquireValueModel() {
    }

    public AcquireValueModel(String memberId, BigDecimal value, String remark, long orgId, String moneyWay, String moneyChannel) {
        MemberId = memberId;
        Value = value;
        Remark = remark;
        OrgId = orgId;
        MoneyWay = moneyWay;
        MoneyChannel = moneyChannel;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public BigDecimal getValue() {
        return Value;
    }

    public void setValue(BigDecimal value) {
        Value = value;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getMoneyWay() {
        return MoneyWay;
    }

    public void setMoneyWay(String moneyWay) {
        MoneyWay = moneyWay;
    }

    public String getMoneyChannel() {
        return MoneyChannel;
    }

    public void setMoneyChannel(String moneyChannel) {
        MoneyChannel = moneyChannel;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
