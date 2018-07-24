package com.beyondh.model.hotel;

import com.beyondh.constants.TestConstants;

public class MyRoomRemarkQueryModel {
    public MyRoomRemarkQueryModel(long orgId, long checkinId) {
        OrgId = orgId;
        CheckinId = checkinId;
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
    }

    public MyRoomRemarkQueryModel(long orgId, long checkinId, String memberId) {
        this(orgId,checkinId);
        MemberId = memberId;
    }

    private long OrgId;
    public long getOrgId()
    {
        return OrgId;
    }
    public  void setOrgId(long value)
    {
        OrgId = value;
    }
    private long CheckinId;
    public long getCheckinId()
    {
        return CheckinId;
    }
    public void setCheckinId(long value)
    {
        CheckinId = value;
    }

    private String MemberId;
    public  String getMemberId()
    {
        return MemberId;
    }
    public void setMemberId(String value)
    {
        MemberId = value;
    }
    private int PageIndex;
    public int getPageIndex()
    {
        return PageIndex;
    }
    public void setPageIndex(int value)
    {
        PageIndex = value;
    }
    private int PageSize;
    public int getPageSize()
    {
        return PageSize;
    }
    public void setPageSize(int value)
    {
        PageSize = value;
    }
}
