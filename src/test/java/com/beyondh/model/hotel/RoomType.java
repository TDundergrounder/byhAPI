package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.io.Serializable;

public class RoomType implements Serializable {
    public String RoomTypeId;


    public String RoomTypeName;


    public String Description;


    public String HotelRoomTypeDescription;


    public int BedAmount;


    public String BedType;


    public boolean Virtual;


    public String PhysicalRoomTypeId;


    public String Abbreviation;


    public boolean IsActive;


    public String ImageUris;

    public RoomType(String id) {
        RoomTypeId = id;
    }

    public String getRoomTypeId() {
        return RoomTypeId;
    }

    public void setRoomTypeId(String id) {
        RoomTypeId = id;
    }

    public String getRoomTypeName() {
        return RoomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        RoomTypeName = roomTypeName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getHotelRoomTypeDescription() {
        return HotelRoomTypeDescription;
    }

    public void setHotelRoomTypeDescription(String hotelRoomTypeDescription) {
        HotelRoomTypeDescription = hotelRoomTypeDescription;
    }

    public int getBedAmount() {
        return BedAmount;
    }

    public void setBedAmount(int bedAmount) {
        BedAmount = bedAmount;
    }

    public String getBedType() {
        return BedType;
    }

    public void setBedType(String bedType) {
        BedType = bedType;
    }

    public boolean isVirtual() {
        return Virtual;
    }

    public void setVirtual(boolean virtual) {
        Virtual = virtual;
    }

    public String getPhysicalRoomTypeId() {
        return PhysicalRoomTypeId;
    }

    public void setPhysicalRoomTypeId(String physicalRoomTypeId) {
        PhysicalRoomTypeId = physicalRoomTypeId;
    }

    public String getAbbreviation() {
        return Abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        Abbreviation = abbreviation;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public String getImageUris() {
        return ImageUris;
    }

    public void setImageUris(String imageUris) {
        ImageUris = imageUris;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
