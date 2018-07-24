package com.beyondh.model.order;

public class CheckinCustomer {
    private String Name;

    private String CardTypeId;

    private String CardNo;

    private String Mobile;

    private Boolean ThemSelfCheckin;

    public CheckinCustomer(String name, String mobile) {
        Name = name;
        Mobile = mobile;
        ThemSelfCheckin =false;
    }

    public CheckinCustomer(String name, String cardTypeId, String cardNo, String mobile, Boolean themSelfCheckin) {
        Name = name;
        CardTypeId = cardTypeId;
        CardNo = cardNo;
        Mobile = mobile;
        ThemSelfCheckin = themSelfCheckin;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCardTypeId() {
        return CardTypeId;
    }

    public void setCardTypeId(String cardTypeId) {
        CardTypeId = cardTypeId;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String cardNo) {
        CardNo = cardNo;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public Boolean getThemSelfCheckin() {
        return ThemSelfCheckin;
    }

    public void setThemSelfCheckin(Boolean themSelfCheckin) {
        ThemSelfCheckin = themSelfCheckin;
    }
}
