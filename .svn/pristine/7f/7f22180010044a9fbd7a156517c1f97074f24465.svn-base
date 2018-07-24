package com.beyondh.model.order;

import com.beyondh.model.hotel.RoomType;
import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;

public class RoomPrice implements Serializable {
    private String Date;

    private BigDecimal OrignPrice;

    private BigDecimal ActualPrice;

    private String RoomTypeId;

    private RoomType RoomType;

    private int RoomCount;

    private String Description;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public BigDecimal getOrignPrice() {
        return OrignPrice;
    }

    public void setOrignPrice(BigDecimal orignPrice) {
        OrignPrice = orignPrice;
    }

    public BigDecimal getActualPrice() {
        return ActualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        ActualPrice = actualPrice;
    }

    public String getRoomTypeId() {
        return RoomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        RoomTypeId = roomTypeId;
    }

    public com.beyondh.model.hotel.RoomType getRoomType() {
        return RoomType;
    }

    public void setRoomType(com.beyondh.model.hotel.RoomType roomType) {
        RoomType = roomType;
    }

    public int getRoomCount() {
        return RoomCount;
    }

    public void setRoomCount(int roomCount) {
        RoomCount = roomCount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public RoomPrice(BigDecimal orignPrice, BigDecimal actualPrice, String roomTypeId, int roomCount) {
        OrignPrice = orignPrice;
        ActualPrice = actualPrice;
        RoomTypeId = roomTypeId;
        RoomCount = roomCount;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
