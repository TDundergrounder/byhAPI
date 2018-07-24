package com.beyondh.model.Member;

public class LoginModel {
    public String Mobile;

    public String Password;

    public String OpenId;

    public LoginModel(String mobile, String password) {
        Mobile = mobile;
        Password = password;
    }

    public LoginModel(String mobile, String password, String openId) {
        Mobile = mobile;
        Password = password;
        OpenId = openId;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String openId) {
        OpenId = openId;
    }
}
