package com.beyondh.client;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class APIResult{
    private String _code;

    private String _content;

    private String _message;

    private String _subCode;

    private String _subMessage;


    public APIResult(){
        super();
    };

    public APIResult(String code,String content,String message){
        super();

        _code = code;
        _content = content;
        _message = message;
    }

    public String getCode()
    {
        return _code;
    }

    public <T> T getContent(Type typeOfT){
        return new Gson().fromJson(_content,typeOfT);
    }

    public <T> T getContent(Class<T> classOfT){
        if(classOfT == String.class)
            return (T)_content;

        return new Gson().fromJson(_content,classOfT);
    }

    public String getMessage()
    {
        return _message;
    }

    public String getSubCode() {
        return _subCode;
    }

    public void setSubCode(String _subCode) {
        this._subCode = _subCode;
    }

    public String getSubMessage() {
        return _subMessage;
    }

    public void setSubMessage(String _subMessage) {
        this._subMessage = _subMessage;
    }

    public void setCode(String code)
    {
        _code = code;
    }

    public void setContent(String content)
    {
        _content = content;
    }


    public void setMessage(String message)
    {

        _message = message;
    }
}
