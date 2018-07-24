package com.beyondh.invoker;

import com.beyondh.client.APIResult;
import com.beyondh.constants.SpringConstants;
import com.beyondh.constants.TestConstants;
import com.beyondh.enums.APICode;
import com.beyondh.model.Member.*;
import com.beyondh.model.PagedModel;
import com.beyondh.model.order.PagedResult;
import com.google.gson.reflect.TypeToken;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SpringConstants.SCOPE_SINGLETON)
public class MemberAPIInvoker extends  AbstractAPIInvoker {
    public MemberAPIInvoker()
    {
        super(TestConstants.MEMBER_ROUTE);
    }

    public String registerMember(RegisterModel model)
    {
        APIResult result =  post("RegisterMember",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(String.class);

        return null;
    }

    public String registerByActivity(RegisterByActivityModel model)
    {
        APIResult result =  post("RegisterByActivity",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(String.class);

        return null;
    }

    public RegisterOrBindResult registerOrBindMember(RegisterModel model)
    {
        APIResult result =  post("RegisterOrBindMember",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(RegisterOrBindResult.class);

        return null;
    }

    public MemberInfo getMemberByOpenId(String openId)
    {
        APIResult result =  post("GetMemberByOpenId",openId);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(MemberInfo.class);

        return null;
    }

    public MemberInfo getMemberByIdentityCard(MemberIdentityCardModel model)
    {
        APIResult result =  post("GetMemberByIdentityCard",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(MemberInfo.class);

        return null;
    }

    public PagedModel<MemberInfo> searchMembers(MemberQueryModel model)
    {
        APIResult result =  post("SearchMembers",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedModel<MemberInfo>>(){}.getType());

        return null;
    }

    public boolean loginAndBinding(LoginModel model)
    {
        APIResult result =  post("LoginAndBinding",model);
       if(result.getCode().equals(APICode.Success.getCode()))
           return result.getContent(boolean.class);

        return false;
   }

    public boolean changePasswordByOldPassword(MemberChangePasswordByOldPasswordModel model)
    {
        APIResult result =  post("ChangePasswordByOldPassword",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public boolean changePasswordByQuestion(MemberChangePasswordByQuestionModel model)
    {
        APIResult result =  post("ChangePasswordByQuestion",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public boolean changePasswordByMobile(MemberChangePasswordByMobileModel model)
    {
        APIResult result =  post("ChangePasswordByMobile",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public boolean updateMember(UpdateModel model)
    {
        APIResult result =  post("UpdateMember",model);
        return result.getCode().equals(APICode.Success.getCode());
    }

    public boolean acquirePoint(AcquirePointModel model)
    {
        APIResult result =  post("AcquirePoint",model);
        return result.getCode().equals(APICode.Success.getCode());
    }

    public boolean consumePoint(ConsumePointModel model)
    {
        APIResult result =  post("ConsumePoint",model);
        return result.getCode().equals(APICode.Success.getCode());
    }

    public boolean acquireValue(AcquireValueModel model)
    {
        APIResult result =  post("AcquireValue",model);
        return result.getCode().equals(APICode.Success.getCode());
    }

    public PagedResult<MemberPoint> searchPoints(SearchPointsModel model)
    {
        APIResult result =  post("SearchPoints",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedResult<MemberPoint>>(){}.getType());

        return null;
    }

    public PagedResult<MemberValue> searchValues(SearchValuesModel model)
    {
        APIResult result =  post("SearchValues",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedResult<MemberValue>>(){}.getType());

        return null;
    }

    public PagedModel<GiftItemInfo> getGiftItems(GiftItemQueryModel queryModel) {
        APIResult result = post("GetGiftItems", queryModel);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedModel<GiftItemInfo>>() {
            }.getType());

        return null;
    }

    public Integer exchangeGift(GiftExchangeModel model)
    {
        APIResult result =  post("ExchangeGift",model);
        if(result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(Integer.class);

        return 0;
    }

    public PagedModel<GIftExchangeInfo> getGiftExchanges(GiftExchangeQueryModel queryModel) {
        APIResult result = post("GetGiftExchanges", queryModel);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedModel<GIftExchangeInfo>>() {
            }.getType());

        return null;
    }

}


