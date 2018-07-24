package com.beyondh.enums.pms;

public enum  CouponType {
    Discount("Discount"),
    Rate("Rate");

    CouponType(String type)
    {
        _type = type;
    }

    private String _type;

    public  String getType()
    {
        return _type;
    }
}
