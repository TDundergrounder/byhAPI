package com.beyondh.enums;

public enum  APICode {
    Success("10000"),
    UnknowError("20000"),
    ValidationFailed("30000"),
    MissingArgument("40001"),
    InvalidArgument("40002");

    private String _code;
    APICode(String code)
    {
        _code = code;
    }

    public String getCode()
    {
        return _code;
    }

}
