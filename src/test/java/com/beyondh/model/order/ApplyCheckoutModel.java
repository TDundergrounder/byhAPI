package com.beyondh.model.order;

public class ApplyCheckoutModel {
    private long OrgId;
    private long[] CheckinIds;

    public ApplyCheckoutModel(long orgId, long[] checkinIds) {
        OrgId = orgId;
        CheckinIds = checkinIds;
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
}
