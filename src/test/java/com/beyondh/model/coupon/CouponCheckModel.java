package com.beyondh.model.coupon;

public class CouponCheckModel {
    private long OrgId;
    public long getOrgId(){return OrgId;}
    public void setOrgId(long orgId){OrgId = orgId;}

    private String SerialNo;
    public String getSerialNo(){return SerialNo;}
    public void setSerialNo(String serialNo){SerialNo = serialNo;}

    private String RoomTypeId;
    public String getRoomTypeId(){return RoomTypeId;}
    public void setRoomTypeId(String value){RoomTypeId = value;}

    public CouponCheckModel(long orgId,String serialNo)
    {
        OrgId = orgId;
        SerialNo = serialNo;
    }


}
