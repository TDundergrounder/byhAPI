package com.beyondh.model.cashingbill;

import com.google.gson.Gson;

import java.io.Serializable;

public class CashingBillAddModel implements Serializable {

    private String Name;

    private String[]  BillProjects;

    private long HotelId;

    public CashingBillAddModel(String name, String[] billProjects, long hotelId) {
        Name = name;
        BillProjects = billProjects;
        HotelId = hotelId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String[] getBillProjects() {
        return BillProjects;
    }

    public void setBillProjects(String[] billProjects) {
        BillProjects = billProjects;
    }

    public long getHotelId() {
        return HotelId;
    }

    public void setHotelId(long hotelId) {
        HotelId = hotelId;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
