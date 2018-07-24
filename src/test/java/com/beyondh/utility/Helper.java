package com.beyondh.utility;

import com.beyondh.constants.TestConstants;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.StreamSupport;

public final  class Helper {
    public static String toUrlParameter(JsonObject json) {
        if (json == null)
            return null;

        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator  = json.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();

            JsonElement element = (JsonElement)entry.getValue();
            if(element.isJsonArray()){
                JsonArray array = (JsonArray)element;
                if(array.size() == 0)
                    continue;;

                StreamSupport.stream(array.spliterator(),false)
                        .map(literator->String.format("%s[]=%s&", entry.getKey(), literator.getAsString().trim()))
                        .forEach(string->  stringBuilder.append(string));
                continue;
            }

            stringBuilder.append(String.format("%s=%s&", entry.getKey(), element.getAsString()));
        }

        String result = stringBuilder.toString();
        if(result.length() == 0)
            return result;

        return result.substring(0,result.length()-1);
    }

    public static String getRandomChineseNameST()
    {
        return getRandomChinese(3);
    }

    public static String getRandomChineseName()
    {
        return getRandomChinese(4);
    }


    public static String getRandomChinese(int len)
    {
        String result ="";
        for(int i=0;i<len;i++){
            String string = null;
            int hightPos, lowPos; // 定义高低位
            Random random = new Random();
            hightPos = (176 + Math.abs(random.nextInt(39))); //获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93))); //获取低位值
            byte[] buffer = new byte[2];
            buffer[0] = (new Integer(hightPos).byteValue());
            buffer[1] = (new Integer(lowPos).byteValue());
            try
            {
                string = new String(buffer, "GBk"); //转成中文
            }
            catch (UnsupportedEncodingException ex)
            {
                ex.printStackTrace();
            }
            result+=string;
        }
        return result;
    }

    private static String formatDateTime(String format, Calendar calendar)
    {
        return new java.text.SimpleDateFormat(format).format(calendar.getTime());
    }

    private static String formatDateTime(String format, Date dateTime)
    {
        return new java.text.SimpleDateFormat(format).format(dateTime);
    }


    public static String getFormatDateTime(Calendar calendar)
    {
        return formatDateTime(TestConstants.DATE_TIME_FORMAT,calendar);
    }

    public static String getFormatDateTime(Date dateTime)
    {
        return formatDateTime(TestConstants.DATE_TIME_FORMAT,dateTime);
    }

    public static String gmtToLocalDateTime(String dateTimeString, boolean isStringReplace)
    {
        return  isStringReplace? dateTimeString.replace('T',' ') : gmtToLocalDateTime(dateTimeString);
    }

    public static String gmtToLocalDateTime(String dateTimeString)
    {

        try {
           return getFormatDateTime(new java.text.SimpleDateFormat(TestConstants.GMT_DATE_TIME_FORMAT).parse(dateTimeString));
        }catch (Exception e)
        {
            return  null;
        }
    }


    public static String getFormatDate(Calendar calendar)
    {
        return formatDateTime(TestConstants.DATE_FORMAT,calendar);
    }

    public static String getFormatTime(Calendar calendar)
    {
        return formatDateTime(TestConstants.TIME_FORMAT,calendar);
    }


    private static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1+Math.random()*(ch2-ch1+1));//因为random<1.0，所以需要+1，才能取到ch2
    }
    private static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
    private static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }
    private static char getRandomDigitLetter(){
        return getRandomCharacter('0','9');
    }

    public static String getRandomLowerCaseString(int length)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<length;i++)
            stringBuilder.append(getRandomLowerCaseLetter());

        return stringBuilder.toString();
    }

    public static String getRandomUpperCaseString(int length)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<length;i++)
            stringBuilder.append(getRandomUpperCaseLetter());

        return stringBuilder.toString();
    }

    public static String getRandomNumber(int length)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<length;i++)
            stringBuilder.append(getRandomDigitLetter());

        return stringBuilder.toString();
    }

    public static  String getMobileNumber()
    {
        return  String.format("130%s",getRandomNumber(8));
    }

    public static double NextDouble(double max)
    {
        return max * new Random().nextDouble();
    }

    public static double NextDouble(double min, double max)
    {
        return min +  (max - min) * new Random().nextDouble();
    }

    public  static BigDecimal NextDouble(int max)
    {
        return BigDecimal.valueOf(NextDouble((double)max)).setScale(2, RoundingMode.HALF_UP);
    }

    public  static BigDecimal NextDouble(int min, int max)
    {
        return BigDecimal.valueOf(NextDouble((double)min,(double)max)).setScale(2, RoundingMode.HALF_UP);
    }

    public static String format(String date,String format)
    {
        try {
            Date dateConvert = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date);
            return new SimpleDateFormat(format).format(dateConvert);
        }
        catch (Exception e)
        {
            return null;
        }
    }

}
