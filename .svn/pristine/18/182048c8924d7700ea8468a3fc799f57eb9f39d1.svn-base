package com.beyondh.model.hotel;

import com.google.gson.Gson;

public class HourRentMemberPriceQueryModel {
    public long OrgId;
    public String ArriveTime;
    public String DepartureTime;
    public String[] MemberLevels;

    public HourRentMemberPriceQueryModel() {
    }

    public HourRentMemberPriceQueryModel(long orgId, String arriveTime, String departureTime, String[] memberLevels) {
       this(orgId,arriveTime,departureTime);
        MemberLevels = memberLevels;
    }

    public HourRentMemberPriceQueryModel(long orgId, String arriveTime, String departureTime) {
        OrgId = orgId;
        ArriveTime = arriveTime;
        DepartureTime = departureTime;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
