package com.beyondh.utility;

import com.beyondh.constants.HttpConstants;

import java.beans.Encoder;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.security.MessageDigest;

public final class Cryptograph {

    private static  final String INPUT_CHARSET_UTF8 = "UTF-8";

    public static String Sha1(String data)
    {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };

        return encrypt(data, HttpConstants.ENCRYPT_SHA1,INPUT_CHARSET_UTF8,hexDigits);
    }

    public static String MD5(String data)
    {
        char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F' };

        return encrypt(data, HttpConstants.ENCRYPT_MD5,INPUT_CHARSET_UTF8,hexDigits);
    }

    private static String encrypt(String data,String encrptMethod,String charact ,char[] hexDigits)
    {
        try
        {
            MessageDigest messageDigest = MessageDigest.getInstance(encrptMethod);
            messageDigest.update(data.getBytes(charact));

            byte[] md = messageDigest.digest();
            int j = md.length;
            char[] str = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++)
            {
                byte byte0 = md[i];
                str[k++] = hexDigits[(int)(((byte)byte0) >> 4) & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }

            return new String(str);
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public static String SHA256(String data)
    {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance( HttpConstants.ENCRYPT_SHA256);
            messageDigest.update(data.getBytes(INPUT_CHARSET_UTF8));
            byte[] md = messageDigest.digest();
            String hashString = "";
            for (byte x : md) {
                hashString += String.format("%02x", x);
            }
            return hashString;
        }
        catch (Exception e)
        {
            return null;
        }
    }
}
