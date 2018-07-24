package com.beyondh.model.bill;

import com.google.gson.Gson;

import java.io.Serializable;

public class AdditionalRoomRentGenerateModel implements Serializable {
    private long HotelId;
    private AdditionalDetailRoomRentGenerateModel[]  GenerateRoomRentDetails;

    public AdditionalRoomRentGenerateModel(long hotelId, AdditionalDetailRoomRentGenerateModel[] generateRoomRentDetails) {
        HotelId = hotelId;
        GenerateRoomRentDetails = generateRoomRentDetails;
    }

    public long getHotelId() {
        return HotelId;
    }

    public void setHotelId(long hotelId) {
        HotelId = hotelId;
    }

    public AdditionalDetailRoomRentGenerateModel[] getGenerateRoomRentDetails() {
        return GenerateRoomRentDetails;
    }

    public void setGenerateRoomRentDetails(AdditionalDetailRoomRentGenerateModel[] generateRoomRentDetails) {
        GenerateRoomRentDetails = generateRoomRentDetails;
    }
    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
