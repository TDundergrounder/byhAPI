package com.beyondh.model.Member;

import com.google.gson.Gson;

import java.math.BigDecimal;

public class GiftExchangeItemModel {
    private long GiftItemId;
    private int Count;
    private BigDecimal Point;

    public GiftExchangeItemModel() {
    }

    public GiftExchangeItemModel(long giftItemId, int count, BigDecimal point) {
        GiftItemId = giftItemId;
        Count = count;
        Point = point;
    }

    public long getGiftItemId() {
        return GiftItemId;
    }

    public void setGiftItemId(long giftItemId) {
        GiftItemId = giftItemId;
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
