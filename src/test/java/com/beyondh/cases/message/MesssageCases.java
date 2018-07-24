package com.beyondh.cases.message;

import com.beyondh.cases.AbstractTestCase;
import com.beyondh.constants.TestConstants;
import com.beyondh.dataprovider.MessageDataProvider;
import com.beyondh.model.message.CheckVerifyCodeModel;
import com.beyondh.model.message.SendVerifyCodeModel;
import com.beyondh.model.message.SmsSendModel;
import com.beyondh.utility.ClientGroup;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = (TestConstants.GRPOUP_MESSAGE),singleThreaded=true)
@ClientGroup(TestConstants.GRPOUP_MESSAGE)
public class MesssageCases extends AbstractTestCase {

    @Test(dataProvider = MessageDataProvider.DATA_SENDSMS,dataProviderClass = MessageDataProvider.class)
    private void sendSmsCase(SmsSendModel model) {
        boolean result = _messageAPIInvoker.sendSms(model);
        Assert.assertTrue(result);

    }

    @Test(dataProvider = MessageDataProvider.DATA_SENDVERIFYCODEFORWECHAT,dataProviderClass = MessageDataProvider.class)
    private void sendVerifyCodeForWeChatCase(SendVerifyCodeModel model) {
        boolean result = _messageAPIInvoker.sendVerifyCodeForWeChat(model);
        Assert.assertTrue(result);
    }

    @Test(dataProvider = MessageDataProvider.DATA_CHECKVERIFYCODEFORWECHAT,dataProviderClass = MessageDataProvider.class,priority = 1)
    private void checkVerifyCodeForWeChatCase(CheckVerifyCodeModel model) {
        boolean result = _messageAPIInvoker.checkVerifyCodeForWeChat(model);
        Assert.assertTrue(result);
    }
}


