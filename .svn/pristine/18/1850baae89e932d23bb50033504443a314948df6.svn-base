package com.beyondh.config;

import org.testng.Assert;

import java.io.*;
import java.util.Properties;

public class TestConfiguration {

    private  static  final  String FILE = "/test-config.properties";

    private  static  final  String PROPERTY_URL = "url";

    private  static  final  String PROPERTY_ENVIROMENT= "environment";

    private  static  final  String PROPERTY_CHANNELKEY= "channelkey";

    private  static  final  String PROPERTY_DOMAIN ="domain";

    private  static  final  String PROPERTY_SING_TYPE ="signtype";

    private  static  final  String PROPERTY_SING_APP_KEY ="appkey";

    private static  final  TestConfiguration _configuration = new TestConfiguration();

    private TestConfiguration()
    {
        super();

        try {
            load();
        }
        catch (FileNotFoundException e)
        {
            Assert.fail(e.getMessage());
        }
        catch (IOException e)
        {
            Assert.fail(e.getMessage());
        }
    }

    public static TestConfiguration  instance()
    {
        return _configuration;
    }

    private String _url;

    private String _environment;

    private String _channelKey;

    private String _domain;

    private String _signType;

    private String _appKey;

    public String getUrl() {
        return _url;
    }

    public String getEnvironment(){
        return _environment;
    }

    public String getChannelkey(){
        return _channelKey;
    }

    public String getDomain(){
        return _domain;
    }

    public String getSignType(){
        return _signType;
    }

    public String getAppKey(){
        return _appKey;
    }

    public  void load() throws FileNotFoundException,IOException {
        InputStream stream=getClass().getResourceAsStream(FILE);

        Properties properties = new Properties();
        properties.load(stream);

        _url = properties.getProperty(PROPERTY_URL);
        _environment = properties.getProperty(PROPERTY_ENVIROMENT);
        _channelKey= properties.getProperty(PROPERTY_CHANNELKEY);
        _domain = properties.getProperty(PROPERTY_DOMAIN);
        _signType = properties.getProperty(PROPERTY_SING_TYPE);
        _appKey = properties.getProperty(PROPERTY_SING_APP_KEY);

        stream.close();
    }

}
