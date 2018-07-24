package com.beyondh.model.Member;

import com.beyondh.constants.TestConstants;
import com.google.gson.Gson;

import java.math.BigDecimal;

public class GiftItemQueryModel {
    private BigDecimal FromPoint;
    private BigDecimal ToPoint;
    private String GiftCategory;
    private Integer PageIndex;
    private Integer PageSize;

    public GiftItemQueryModel(BigDecimal fromPoint, BigDecimal toPoint, String giftCategory) {
        FromPoint = fromPoint;
        ToPoint = toPoint;
        GiftCategory = giftCategory;
        PageSize= TestConstants.RESULT_DEFUALT_SIZE;
        PageIndex =1;
    }

    public BigDecimal getFromPoint() {
        return FromPoint;
    }

    public void setFromPoint(BigDecimal fromPoint) {
        FromPoint = fromPoint;
    }

    public BigDecimal getToPoint() {
        return ToPoint;
    }

    public void setToPoint(BigDecimal toPoint) {
        ToPoint = toPoint;
    }

    public String getGiftCategory() {
        return GiftCategory;
    }

    public void setGiftCategory(String giftCategory) {
        GiftCategory = giftCategory;
    }

    public Integer getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        PageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
