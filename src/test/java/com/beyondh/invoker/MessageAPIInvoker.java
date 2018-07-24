package com.beyondh.invoker;

import com.beyondh.client.APIResult;
import com.beyondh.constants.SpringConstants;
import com.beyondh.constants.TestConstants;
import com.beyondh.enums.APICode;
import com.beyondh.model.message.CheckVerifyCodeModel;
import com.beyondh.model.message.SendVerifyCodeModel;
import com.beyondh.model.message.SmsSendModel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SpringConstants.SCOPE_SINGLETON)
public class MessageAPIInvoker extends  AbstractAPIInvoker {
    public MessageAPIInvoker()
    {
        super(TestConstants.MESSAGE_ROUTE);
    }

    public boolean sendSms(SmsSendModel sendModel)
    {
        APIResult result =  post("SendSms",sendModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public boolean sendVerifyCodeForWeChat(SendVerifyCodeModel verifyCodeModel)
    {
        APIResult result =  post("SendVerifyCodeForWeChat",verifyCodeModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public boolean checkVerifyCodeForWeChat(CheckVerifyCodeModel verifyCodeModel)
    {
        APIResult result =  post("CheckVerifyCodeForWeChat",verifyCodeModel);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }


}
