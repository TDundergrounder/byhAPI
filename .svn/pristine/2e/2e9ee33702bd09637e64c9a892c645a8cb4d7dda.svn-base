package com.beyondh.model.bill;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PaymentModel implements Serializable {
    private long ArAccountId;

    private String ArAccountName;

    private String BankKey;

    private String CardNumber;


    private String AuthorizeId;

    private String BeginValidTime;

    private String EndValidTime;

    private long OnlinePaymentId;

    private String Memo;

    private BigDecimal Amount;


    private String MemberId;


    private String FeeType;


    private String MemberName;

    private String Mobile;

    private String MemberCardId;

    private String ExtCardNo;

    public PaymentModel(String bankKey, String cardNumber, BigDecimal amount) {
        BankKey = bankKey;
        CardNumber = cardNumber;
        Amount = amount;
    }

    public PaymentModel(BigDecimal amount) {
        Amount = amount;
    }

    public PaymentModel(BigDecimal amount, String memberId) {
        Amount = amount;
        MemberId = memberId;
    }

    public long getArAccountId() {
        return ArAccountId;
    }

    public void setArAccountId(long arAccountId) {
        ArAccountId = arAccountId;
    }

    public String getArAccountName() {
        return ArAccountName;
    }

    public void setArAccountName(String arAccountName) {
        ArAccountName = arAccountName;
    }

    public String getBankKey() {
        return BankKey;
    }

    public void setBankKey(String bankKey) {
        BankKey = bankKey;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getAuthorizeId() {
        return AuthorizeId;
    }

    public void setAuthorizeId(String authorizeId) {
        AuthorizeId = authorizeId;
    }

    public String getBeginValidTime() {
        return BeginValidTime;
    }

    public void setBeginValidTime(String beginValidTime) {
        BeginValidTime = beginValidTime;
    }

    public String getEndValidTime() {
        return EndValidTime;
    }

    public void setEndValidTime(String endValidTime) {
        EndValidTime = endValidTime;
    }

    public long getOnlinePaymentId() {
        return OnlinePaymentId;
    }

    public void setOnlinePaymentId(long onlinePaymentId) {
        OnlinePaymentId = onlinePaymentId;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getFeeType() {
        return FeeType;
    }

    public void setFeeType(String feeType) {
        FeeType = feeType;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
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

    public String getExtCardNo() {
        return ExtCardNo;
    }

    public void setExtCardNo(String extCardNo) {
        ExtCardNo = extCardNo;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
