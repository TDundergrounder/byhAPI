package com.beyondh.enums.pms;

public enum CheckinType {
    Normal("Normal"),
    LongTerm("LongTerm"),
    Trip("Trip"),
    Conference("Conference"),
    Internal("Internal"),
    Free("Free"),
    Hour1("Hour1"),
    Hour2("Hour2"),
    Hour3("Hour3"),
    Hour4("Hour4"),
    Hour5("Hour5"),
    Hour6("Hour6"),
    Hour7("Hour7"),
    Hour8("Hour8"),
    Hour9("Hour9"),
    Hour10("Hour10"),
    Hour11("Hour11"),
    Hour12("Hour12");

    CheckinType(String type)
    {
        _type = type;
    }

    private String _type;
    public String getType()
    {
        return _type;
    }

}
