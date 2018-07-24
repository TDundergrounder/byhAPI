package com.beyondh.model.order;

import com.beyondh.model.hotel.RoomType;
import com.google.gson.Gson;

import java.io.Serializable;

public class RoomPlan implements Serializable {
    private String RoomTypeId;


    private String PhysicalRoomTypeId;


    private RoomType RoomType;


    private int Count;

    private RoomPrice[] Price;

    private String[] RoomNumbers;

    public RoomPlan(String roomTypeId, int count ,RoomPrice[] price) {
        RoomTypeId = roomTypeId;
        Price = price;
        Count = count;
    }

    public RoomPlan(String roomTypeId, String physicalRoomTypeId, com.beyondh.model.hotel.RoomType roomType, int count, RoomPrice[] price) {
        RoomTypeId = roomTypeId;
        PhysicalRoomTypeId = physicalRoomTypeId;
        RoomType = roomType;
        Count = count;
        Price = price;
    }

    public String getRoomTypeId() {
        return RoomTypeId;
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

    public com.beyondh.model.hotel.RoomType getRoomType() {
        return RoomType;
    }

    public void setRoomType(com.beyondh.model.hotel.RoomType roomType) {
        RoomType = roomType;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public RoomPrice[] getPrice() {
        return Price;
    }

    public void setPrice(RoomPrice[] price) {
        Price = price;
    }

    public String[] getRoomNumbers() {
        return RoomNumbers;
    }

    public void setRoomNumbers(String[] roomNumbers) {
        RoomNumbers = roomNumbers;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
