package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.io.Serializable;

public class FloorInfo implements Serializable {
    private long FloorId;
    private String FloorName;
    private long HallId;
    private String HallName;

    public long getPrivateFloorId() {
        return FloorId;
    }
    public void setPrivateFloorId(long privateFloorId) {
        this.FloorId = privateFloorId;
    }

    public String getPrivateFloorName() {
        return FloorName;
    }
    public void setPrivateFloorName(String privateFloorName) {
        this.FloorName = privateFloorName;
    }

    public long getPrivateHallId() {
        return HallId;
    }

    public void setPrivateHallId(long privateHallId) {
        this.HallId = privateHallId;
    }

    public String getPrivateHallName() {
        return HallName;
    }

    public void setPrivateHallName(String privateHallName) {
        this.HallName = privateHallName;
    }
    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
