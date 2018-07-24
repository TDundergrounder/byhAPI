package com.beyondh.model.bill;

import com.google.gson.Gson;

import java.io.Serializable;

public class BillBalanceGetModel implements Serializable {
    private long BillId;

    private long HotelId;

    public long getHotelId() {
        return HotelId;
    }

    public void setHotelId(long hotelId) {
        HotelId = hotelId;
    }

    private boolean IncludePreAuthorization;

    public BillBalanceGetModel(long billId,long hotelId)
    {
        this(billId,hotelId,false);
    }

    public BillBalanceGetModel(long billId,long hotelId, boolean includePreAuthorization) {
        BillId = billId;
        HotelId = hotelId;
        IncludePreAuthorization = includePreAuthorization;
    }

    public long getBillId() {
        return BillId;
    }

    public void setBillId(long billId) {
        BillId = billId;
    }

    public boolean isIncludePreAuthorization() {
        return IncludePreAuthorization;
    }

    public void setIncludePreAuthorization(boolean includePreAuthorization) {
        IncludePreAuthorization = includePreAuthorization;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
