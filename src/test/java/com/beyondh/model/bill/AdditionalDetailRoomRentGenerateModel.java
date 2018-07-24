package com.beyondh.model.bill;

public class AdditionalDetailRoomRentGenerateModel {
    private long OccupationId;

    public AdditionalDetailRoomRentGenerateModel(long occupationId) {
        OccupationId = occupationId;
    }

    public long getOccupationId() {
        return OccupationId;
    }

    public void setOccupationId(long occupationId) {
        OccupationId = occupationId;
    }
}
