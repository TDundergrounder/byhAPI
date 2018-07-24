package com.beyondh.model.Member;

import java.math.BigDecimal;

public class MemberInfo {
    private String MemberId;

    private String Name;

    private String Gender;

    private String Mobile;

    private String MemberCardId;

    private String StatusCode;

    private String CardStatusCode;

    private String MemberLevel;

    private String MemberLevelName;

    private BigDecimal Value;

    private BigDecimal Point;

    private String BirthDay;

    private String SourceDetailCode;

    private String ExtCardNo;

    private String Remark;

    private String ParentCardNo;

    private String NationCode;

    private String Phone;

    private BigDecimal CreditScore;

    private Boolean IsPermanentLevel;

    private Boolean ExistPassword;

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getMemberCardId() {
        return MemberCardId;
    }

    public void setMemberCardId(String memberCardId) {
        MemberCardId = memberCardId;
    }

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String statusCode) {
        StatusCode = statusCode;
    }

    public String getCardStatusCode() {
        return CardStatusCode;
    }

    public void setCardStatusCode(String cardStatusCode) {
        CardStatusCode = cardStatusCode;
    }

    public String getMemberLevel() {
        return MemberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        MemberLevel = memberLevel;
    }

    public String getMemberLevelName() {
        return MemberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        MemberLevelName = memberLevelName;
    }

    public BigDecimal getValue() {
        return Value;
    }

    public void setValue(BigDecimal value) {
        Value = value;
    }

    public BigDecimal getPoint() {
        return Point;
    }

    public void setPoint(BigDecimal point) {
        Point = point;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getSourceDetailCode() {
        return SourceDetailCode;
    }

    public void setSourceDetailCode(String sourceDetailCode) {
        SourceDetailCode = sourceDetailCode;
    }

    public String getExtCardNo() {
        return ExtCardNo;
    }

    public void setExtCardNo(String extCardNo) {
        ExtCardNo = extCardNo;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getParentCardNo() {
        return ParentCardNo;
    }

    public void setParentCardNo(String parentCardNo) {
        ParentCardNo = parentCardNo;
    }

    public String getNationCode() {
        return NationCode;
    }

    public void setNationCode(String nationCode) {
        NationCode = nationCode;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public BigDecimal getCreditScore() {
        return CreditScore;
    }

    public void setCreditScore(BigDecimal creditScore) {
        CreditScore = creditScore;
    }

    public Boolean getPermanentLevel() {
        return IsPermanentLevel;
    }

    public void setPermanentLevel(Boolean permanentLevel) {
        IsPermanentLevel = permanentLevel;
    }

    public Boolean getExistPassword() {
        return ExistPassword;
    }

    public void setExistPassword(Boolean existPassword) {
        ExistPassword = existPassword;
    }
}
