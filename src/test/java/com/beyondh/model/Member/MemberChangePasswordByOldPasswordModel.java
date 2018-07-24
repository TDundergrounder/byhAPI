package com.beyondh.model.Member;

public class MemberChangePasswordByOldPasswordModel {
    private String MemberId;
    private String OldPassword;
    private String NewPassword;

    public MemberChangePasswordByOldPasswordModel(String memberId, String oldPassword, String newPassword) {
        MemberId = memberId;
        OldPassword = oldPassword;
        NewPassword = newPassword;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getOldPassword() {
        return OldPassword;
    }

    public void setOldPassword(String oldPassword) {
        OldPassword = oldPassword;
    }

    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String newPassword) {
        NewPassword = newPassword;
    }
}
