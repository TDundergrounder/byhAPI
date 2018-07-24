package com.beyondh.model.Member;

public class MemberChangePasswordByQuestionModel {
    private String MemberId;
    private String Question;
    private String Answer;
    private String NewPassword;

    public MemberChangePasswordByQuestionModel(String memberId, String question, String answer, String newPassword) {
        MemberId = memberId;
        Question = question;
        Answer = answer;
        NewPassword = newPassword;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
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

    public String getNewPassword() {
        return NewPassword;
    }

    public void setNewPassword(String newPassword) {
        NewPassword = newPassword;
    }
}
