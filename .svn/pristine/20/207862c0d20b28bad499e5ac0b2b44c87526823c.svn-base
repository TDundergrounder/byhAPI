package com.beyondh.model.Member;

import com.google.gson.Gson;

public class RegisterModel {
    private String Name;

    private String Mobile;

    private String IdType;

    private String IdNo;

    private String MemberLevel;

    private String SalesId;

    private String Password;

    private String Question;

    private String Answer;

    private String OpenId;

    private String PublicNo;

    public RegisterModel()
    {

    }

    public RegisterModel(String name, String mobile, String idType, String idNo, String memberLevel,String password) {
        Name = name;
        Mobile = mobile;
        IdType = idType;
        IdNo = idNo;
        MemberLevel = memberLevel;
        Password = password;
    }

    public RegisterModel(String name, String mobile, String idType, String idNo, String memberLevel, String openId,String password) {
        Name = name;
        Mobile = mobile;
        IdType = idType;
        IdNo = idNo;
        MemberLevel = memberLevel;
        OpenId = openId;
        Password = password;
    }

    public RegisterModel(String name, String mobile, String idType, String idNo, String memberLevel, String salesId, String password, String question, String answer, String openId) {
        Name = name;
        Mobile = mobile;
        IdType = idType;
        IdNo = idNo;
        MemberLevel = memberLevel;
        SalesId = salesId;
        Password = password;
        Question = question;
        Answer = answer;
        OpenId = openId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getIdType() {
        return IdType;
    }

    public void setIdType(String idType) {
        IdType = idType;
    }

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String idNo) {
        IdNo = idNo;
    }

    public String getMemberLevel() {
        return MemberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        MemberLevel = memberLevel;
    }

    public String getSalesId() {
        return SalesId;
    }

    public void setSalesId(String salesId) {
        SalesId = salesId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String openId) {
        OpenId = openId;
    }

    public String getPrivateNo() {
        return PublicNo;
    }

    public void setPrivateNo(String publicNo) {
        PublicNo = publicNo;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
