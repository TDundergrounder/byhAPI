package com.beyondh.model.Member;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class ConsumePointModel {

    private String MemberId;


    private BigDecimal Point;

    private String Remark;

    private String CreateTime;


    private String CreateBy;


    private long OrgId;


    private String PointWay;


    private String PointChannel;


    private BigDecimal RoomPrice;

    public ConsumePointModel(String memberId, BigDecimal point, String remark, long orgId, String pointWay, BigDecimal roomPrice) {
        MemberId = memberId;
        Point = point;
        Remark = remark;
        OrgId = orgId;
        PointWay = pointWay;
        RoomPrice = roomPrice;
    }

    public ConsumePointModel(String memberId, BigDecimal point, String remark, String createTime, String createBy, long orgId, String pointWay, String pointChannel) {
        MemberId = memberId;
        Point = point;
        Remark = remark;
        CreateTime = createTime;
        CreateBy = createBy;
        OrgId = orgId;
        PointWay = pointWay;
        PointChannel = pointChannel;
    }

    public ConsumePointModel() {
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public BigDecimal getPoint() {
        return Point;
    }

    public void setPoint(BigDecimal point) {
        Point = point;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String createBy) {
        CreateBy = createBy;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getPointWay() {
        return PointWay;
    }

    public void setPointWay(String pointWay) {
        PointWay = pointWay;
    }

    public String getPointChannel() {
        return PointChannel;
    }

    public void setPointChannel(String pointChannel) {
        PointChannel = pointChannel;
    }

    public BigDecimal getRoomPrice() {
        return RoomPrice;
    }

    public void setRoomPrice(BigDecimal roomPrice) {
        RoomPrice = roomPrice;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
