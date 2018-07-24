package com.beyondh.model.Member;

import com.beyondh.constants.TestConstants;

public class MemberQueryModel {
    private String Name;

    private String Email;

    private String Mobile;

    private String CardNo;

    private String ExtCardNo;

    private String[] Levels;

    private String IdNo;

    private String[] MemberIds;

    private String StatusCode;

    private int PageIndex;

    private int PageSize;

    public MemberQueryModel(String idNo) {
        IdNo = idNo;
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
    }

    public MemberQueryModel(String[] memberIds) {
        MemberIds = memberIds;
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
    }

    public MemberQueryModel(String name, String mobile) {
        Name = name;
        Mobile = mobile;
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
    }
}
