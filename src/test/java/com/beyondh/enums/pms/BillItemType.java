package com.beyondh.enums.pms;

public enum  BillItemType {
    Debit(0,"Debit"),
    Credit(1,"Credit");

    private  String _stringValue;

    private int _intValue;

    public String getStringValue() {
        return _stringValue;
    }

    public void setStringValue(String _stringValue) {
        this._stringValue = _stringValue;
    }

    public int getIntValue() {
        return _intValue;
    }

    public void setIntValue(int _byteValue) {
        this._intValue = _byteValue;
    }

    BillItemType(int byteValue, String stringValue)
    {
        _stringValue = stringValue;
        _intValue = byteValue;
    }
}
