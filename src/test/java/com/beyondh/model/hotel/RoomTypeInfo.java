package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.io.Serializable;

public class RoomTypeInfo implements Serializable {
    private String RoomTypeId;
    private String PhysicalRoomTypeId;
    private String RoomTypeName;
    private String Abbreviation;
    private String Description;
    private hotelConfiguredRoomTypeInfo ConfiguredInfo;
    private int BedCount;
    private String BedTypeId;
    private boolean IsVirtual;

    public String getRoomTypeId() {
        return RoomTypeId;
    }

    public RoomTypeInfo(String roomTypeId) {
        RoomTypeId = roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        RoomTypeId = roomTypeId;
    }

    public String getPhysicalRoomTypeId() {
        return PhysicalRoomTypeId;
    }

    public void setPhysicalRoomTypeId(String physicalRoomTypeId) {
        PhysicalRoomTypeId = physicalRoomTypeId;
    }

    public String getRoomTypeName() {
        return RoomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        RoomTypeName = roomTypeName;
    }

    public String getAbbreviation() {
        return Abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        Abbreviation = abbreviation;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public hotelConfiguredRoomTypeInfo getConfiguredInfo() {
        return ConfiguredInfo;
    }

    public void setConfiguredInfo(hotelConfiguredRoomTypeInfo configuredInfo) {
        ConfiguredInfo = configuredInfo;
    }

    public int getBedCount() {
        return BedCount;
    }

    public void setBedCount(int bedCount) {
        BedCount = bedCount;
    }

    public String getBedTypeId() {
        return BedTypeId;
    }

    public void setBedTypeId(String bedTypeId) {
        BedTypeId = bedTypeId;
    }

    public boolean isVirtual() {
        return IsVirtual;
    }

    public void setVirtual(boolean virtual) {
        IsVirtual = virtual;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
