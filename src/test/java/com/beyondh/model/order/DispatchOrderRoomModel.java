package com.beyondh.model.order;

import java.io.Serializable;

public class DispatchOrderRoomModel implements Serializable {
    public long OrgId;

    public long OccupationId;

    public String RoomNumber;

    public DispatchOrderRoomModel() {
    }

    public DispatchOrderRoomModel(long orgId, long occupationId, String roomNumber) {
        OrgId = orgId;
        OccupationId = occupationId;
        RoomNumber = roomNumber;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }
}
