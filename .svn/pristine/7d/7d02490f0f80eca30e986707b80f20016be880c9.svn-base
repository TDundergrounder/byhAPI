package com.beyondh.dataprovider;

import com.beyondh.constants.TestConstants;
import com.beyondh.model.message.CheckVerifyCodeModel;
import com.beyondh.model.message.SendVerifyCodeModel;
import com.beyondh.model.message.SmsSendModel;
import com.beyondh.utility.ClientGroup;
import com.beyondh.utility.Helper;
import org.testng.annotations.DataProvider;

import java.util.Calendar;
import java.util.HashMap;

@ClientGroup(TestConstants.GRPOUP_MEMBER)
public class MessageDataProvider extends  AbstractTestDataProvider {

    protected static HashMap<String, String> _messageData = _data.get(TestConstants.DATA_MODULE_MESSAGE);

    public static final String DATA_SENDSMS = "SendSms";

    public static final String DATA_SENDVERIFYCODEFORWECHAT ="SendVerifyCodeForWeChat";

    public static final String DATA_CHECKVERIFYCODEFORWECHAT= "CheckVerifyCodeForWeChat";

    @DataProvider(name = DATA_SENDSMS)
    public static Object[][] sendSmsData() {

        SmsSendModel sendModel = new SmsSendModel(_messageData.get("Mobile"),_messageData.get("Event"),_messageData.get("VerifyCode"));
        sendModel.setEventTime(Helper.getFormatDateTime(Calendar.getInstance()));

        return new Object[][]{
                {sendModel},
        };
    }

    @DataProvider(name = DATA_SENDVERIFYCODEFORWECHAT)
    public static Object[][] sendVerifyCodeForWeChatData() {

        SendVerifyCodeModel verifyCodeModel = new SendVerifyCodeModel(_messageData.get("UnionId"),_messageData.get("Mobile"));
        return new Object[][]{
                {verifyCodeModel},
        };
    }

    @DataProvider(name = DATA_CHECKVERIFYCODEFORWECHAT)
    public static Object[][] checkVerifyCodeForWeChatData() {

        CheckVerifyCodeModel verifyCodeModel = new CheckVerifyCodeModel(_messageData.get("UnionId"),_messageData.get("VerifyCode"));
        return new Object[][]{
                {verifyCodeModel},
        };
    }

}
