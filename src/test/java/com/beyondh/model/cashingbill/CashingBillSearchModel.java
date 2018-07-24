package com.beyondh.model.cashingbill;

import com.google.gson.Gson;

import java.io.Serializable;

public class CashingBillSearchModel implements Serializable {
    private long HotelId;
    private Long CashingBillId;

    public CashingBillSearchModel(long hotelId, Long cashingBillId) {
        HotelId = hotelId;
        CashingBillId = cashingBillId;
    }

    public CashingBillSearchModel(long hotelId) {
        HotelId = hotelId;
    }

    public long getHotelId() {
        return HotelId;
    }

    public void setHotelId(long hotelId) {
        HotelId = hotelId;
    }

    public Long getCashingBillId() {
        return CashingBillId;
    }

    public void setCashingBillId(Long cashingBillId) {
        CashingBillId = cashingBillId;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
