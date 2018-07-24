package com.beyondh.model.message;

public class CheckVerifyCodeModel {
    private String UnionId;

    public String getUnionId() {
        return UnionId;
    }

    public CheckVerifyCodeModel(String unionId, String verifyCode) {
        UnionId = unionId;
        VerifyCode = verifyCode;
    }

    public String getVerifyCode() {
        return VerifyCode;

    }

    private String VerifyCode;

    public void setUnionId(String unionId) {
        UnionId = unionId;
    }

    public void setVerifyCode(String verifyCode) {
        VerifyCode = verifyCode;
    }
}
