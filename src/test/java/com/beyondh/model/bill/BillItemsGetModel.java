package com.beyondh.model.bill;

import com.google.gson.Gson;

import java.io.Serializable;

public class BillItemsGetModel implements Serializable {
    private long[] BillItemIds;

    private long HotelId;

    public long getHotelId() {
        return HotelId;
    }

    public BillItemsGetModel(long[] billItemIds, long hotelId) {
        BillItemIds = billItemIds;
        HotelId = hotelId;
    }

    public BillItemsGetModel(long hotelId) {
        HotelId = hotelId;
    }

    public void setHotelId(long hotelId) {
        HotelId = hotelId;
    }

    public BillItemsGetModel(long[] billItemIds) {
        BillItemIds = billItemIds;
    }

    public long[] getBillItemIds() {
        return BillItemIds;
    }

    public void setBillItemIds(long[] billItemIds) {
        BillItemIds = billItemIds;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
