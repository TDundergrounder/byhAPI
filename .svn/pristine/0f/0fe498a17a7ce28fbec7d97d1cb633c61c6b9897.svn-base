package com.beyondh.model.Member;

import com.beyondh.constants.TestConstants;
import com.google.gson.Gson;

public class GiftExchangeQueryModel {
    private String MemberId;
    private Integer PageIndex;
    private Integer PageSize;

    public GiftExchangeQueryModel(String memberId) {
        MemberId = memberId;
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
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
