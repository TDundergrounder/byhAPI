package com.beyondh.model.Member;

import com.google.gson.Gson;

import  java.math.BigDecimal;

public class GiftItemExchangeModel {
    private long GiftItemId;

    private String GiftName;

    private int Count;

    private BigDecimal Point;

    public long getGiftItemId() {
        return GiftItemId;
    }

    public void setGiftItemId(long giftItemId) {
        GiftItemId = giftItemId;
    }

    public String getGiftName() {
        return GiftName;
    }

    public void setGiftName(String giftName) {
        GiftName = giftName;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public BigDecimal getPoint() {
        return Point;
    }

    public void setPoint(BigDecimal point) {
        Point = point;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
