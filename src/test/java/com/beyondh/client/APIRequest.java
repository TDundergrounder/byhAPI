package com.beyondh.client;

import com.beyondh.config.TestConfiguration;
import com.beyondh.constants.HttpConstants;
import com.beyondh.utility.Cryptograph;
import org.testng.annotations.Test;

import java.net.URLEncoder;

public class APIRequest {

    private String ChannelKey;

    private String Method;

    private String BizContent;

    private String Sign;

    private String SignType;

    private String Format;

    private String Charset;

    private String Version;

    private String Timestamp;

    public APIRequest( String method, String bizContent) {
        ChannelKey = TestConfiguration.instance().getChannelkey();
        Method = method;
        BizContent = bizContent;//.replaceAll("\"","\'");
        SignType = TestConfiguration.instance().getSignType();
        Format = HttpConstants.PUBLIC_API_CONTENT_Format;
        Charset = HttpConstants.ENTITY_CONTENT_ENCODE;
        Version = HttpConstants.PUBLIC_API_VERISON;
        Timestamp = "2017-02-12 14:12:13";

        String encryptString = String.format("BizContent=%s&",BizContent.replaceAll("\"","\\\""))
                +String.format("ChannelKey=%s&",ChannelKey)
                +String.format("Charset=%s&",Charset)
                +String.format("Format=%s&",Format)
                +String.format("Method=%s&",Method)
                +String.format("SignType=%s&",SignType)
                +String.format("Timestamp=%s&",Timestamp)
                +String.format("Version=%s",Version)
                + TestConfiguration.instance().getAppKey();
        Sign = SignType.equalsIgnoreCase(HttpConstants.ENCRYPT_MD5) ? Cryptograph.MD5(encryptString) : Cryptograph.SHA256(encryptString);
    }

    public String getChannelKey() {
        return ChannelKey;
    }

    public void setChannelKey(String channelKey) {
        ChannelKey = channelKey;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public String getBizContent() {
        return BizContent;
    }

    public void setBizContent(String bizContent) {
        BizContent = bizContent;
    }

    public String getSign() {
        return Sign;
    }

    public void setSign(String sign) {
        Sign = sign;
    }

    public String getSignType() {
        return SignType;
    }

    public void setSignType(String signType) {
        SignType = signType;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getCharset() {
        return Charset;
    }

    public void setCharset(String charset) {
        Charset = charset;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }
}
