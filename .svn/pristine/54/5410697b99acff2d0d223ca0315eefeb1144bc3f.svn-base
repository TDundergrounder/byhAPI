package com.beyondh.cases.member;

import com.beyondh.cases.AbstractTestCase;
import com.beyondh.constants.TestConstants;
import com.beyondh.dataprovider.MemberDataProvider;
import com.beyondh.model.Member.*;
import com.beyondh.utility.ClientGroup;
import com.beyondh.utility.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Calendar;


@Test(groups = (TestConstants.GRPOUP_MEMBER),singleThreaded=true)
@ClientGroup(TestConstants.GRPOUP_MEMBER)
public class MemberCases extends AbstractTestCase {

    @Test(dataProvider = MemberDataProvider.DATA_REGISTERMEMBER,dataProviderClass = MemberDataProvider.class)
    private void registerMembersCase(RegisterModel model) {
        String result = _memberAPIInvoker.registerMember(model);
        Assert.assertNotNull(result);

        String memberId = result.replaceAll("\"","");
        String openId =  model.getOpenId();
       //get
        MemberInfo member = null !=openId ? _memberAPIInvoker.getMemberByOpenId(openId) : _memberAPIInvoker.getMemberByIdentityCard(new MemberIdentityCardModel(model.getIdType(), model.getIdNo()));
        Assert.assertNotNull(member);
        Assert.assertEquals(member.getMemberLevel(), model.getMemberLevel());
        Assert.assertEquals(member.getName(), model.getName());
        Assert.assertEquals(member.getMobile(), model.getMobile());

        //search
        MemberQueryModel queryModel = new MemberQueryModel(new String[]{memberId});
        MemberInfo[] members = _memberAPIInvoker.searchMembers(queryModel).getContent();
        Assert.assertTrue(members.length == 1);
        member = members[0];
        Assert.assertEquals(member.getMemberLevel(), model.getMemberLevel());
        Assert.assertEquals(member.getName(), model.getName());
        Assert.assertEquals(member.getMobile(), model.getMobile());

        queryModel = new MemberQueryModel(model.getName(),model.getMobile());
        members = _memberAPIInvoker.searchMembers(queryModel).getContent();
        Assert.assertTrue(members.length == 1);
        member = members[0];
        Assert.assertEquals(member.getMemberLevel(), model.getMemberLevel());
        Assert.assertEquals(member.getName(), model.getName());
        Assert.assertEquals(member.getMobile(), model.getMobile());

        queryModel = new MemberQueryModel(model.getIdNo());
        members = _memberAPIInvoker.searchMembers(queryModel).getContent();
        Assert.assertTrue(members.length == 1);
        member = members[0];
        Assert.assertEquals(member.getMemberLevel(), model.getMemberLevel());
        Assert.assertEquals(member.getName(), model.getName());
        Assert.assertEquals(member.getMobile(), model.getMobile());

        //login
        LoginModel login = null != openId ? new LoginModel(model.getMobile(),model.getPassword(),openId) : new LoginModel(model.getMobile(),model.getPassword());
        Assert.assertTrue(_memberAPIInvoker.loginAndBinding(login));

        //Change password
        String newPassword = "!@#$%^&*()_+";
        if(model.getQuestion() !=null)
        {
            MemberChangePasswordByQuestionModel change = new MemberChangePasswordByQuestionModel(memberId,model.getQuestion(),model.getAnswer(),newPassword);
            Assert.assertTrue(_memberAPIInvoker.changePasswordByQuestion(change));
        }
        else
        {
            MemberChangePasswordByOldPasswordModel change = new MemberChangePasswordByOldPasswordModel(memberId,model.getPassword(),newPassword);
            Assert.assertTrue(_memberAPIInvoker.changePasswordByOldPassword(change));
        }

        login.setPassword(newPassword);
        Assert.assertTrue(_memberAPIInvoker.loginAndBinding(login));

        MemberChangePasswordByMobileModel change = new MemberChangePasswordByMobileModel(model.getMobile(),model.getPassword());
        Assert.assertTrue(_memberAPIInvoker.changePasswordByMobile(change));

        login.setPassword(model.getPassword());
        Assert.assertTrue(_memberAPIInvoker.loginAndBinding(login));

        //update member
        UpdateModel update = new UpdateModel(memberId, Helper.getRandomChineseName(),Helper.getMobileNumber(),TestConstants.CARD_TYPE_C02,Helper.getRandomNumber(16),String.format("%s@163.com",Helper.getRandomLowerCaseString(10)),"1",Helper.getRandomChinese(22));
        Assert.assertTrue(_memberAPIInvoker.updateMember(update));

        member = null !=openId ? _memberAPIInvoker.getMemberByOpenId(openId) : _memberAPIInvoker.getMemberByIdentityCard(new MemberIdentityCardModel(update.getIdType(), update.getIdNo()));
        Assert.assertNotNull(member);
        Assert.assertEquals(member.getMemberLevel(), model.getMemberLevel());
        Assert.assertEquals(member.getName(), update.getName());
        Assert.assertEquals(member.getMobile(), update.getMobile());
    }

    @Test(dataProvider = MemberDataProvider.DATA_ACQUIREPOINT,dataProviderClass = MemberDataProvider.class)
    private void acquireMemberPointCase(AcquirePointModel model,String openId)
    {
        MemberInfo member= _memberAPIInvoker.getMemberByOpenId(openId) ;
        BigDecimal pointBefore = member.getPoint();

        Assert.assertTrue(_memberAPIInvoker.acquirePoint(model));

        Calendar  calendar = Calendar.getInstance();
        String start = Helper.getFormatDate(calendar);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        String end = Helper.getFormatDate(calendar);
        MemberPoint[] points = _memberAPIInvoker.searchPoints(new SearchPointsModel(model.getMemberId(),start,end)).getData();
        Assert.assertTrue(points.length >0);

        MemberPoint point = Arrays.stream(points).filter(x->x.getPoint().setScale(0, RoundingMode.HALF_UP).equals(model.getPoint().setScale(0, RoundingMode.HALF_UP))).findFirst().orElse(null);
        Assert.assertNotNull(point);
        Assert.assertEquals(point.getMemberId(),model.getMemberId());

        member= _memberAPIInvoker.getMemberByOpenId(openId) ;
        BigDecimal pointAfter = member.getPoint();
        Assert.assertEquals(pointAfter.setScale(0, RoundingMode.HALF_UP),pointBefore.add(model.getPoint()).setScale(0, RoundingMode.HALF_UP));
    }

    @Test(dataProvider = MemberDataProvider.DATA_CONSUMEPOINT,dataProviderClass = MemberDataProvider.class)
    private void consumeMemberPointCase(ConsumePointModel model,String openId)
    {
        MemberInfo member= _memberAPIInvoker.getMemberByOpenId(openId) ;
        BigDecimal pointBefore = member.getPoint();

        Assert.assertTrue(_memberAPIInvoker.consumePoint(model));

        Calendar  calendar = Calendar.getInstance();
        String start = Helper.getFormatDate(calendar);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        String end = Helper.getFormatDate(calendar);
        MemberPoint[] points = _memberAPIInvoker.searchPoints(new SearchPointsModel(model.getMemberId(),start,end)).getData();
        Assert.assertTrue(points.length >0);

        MemberPoint point = Arrays.stream(points).filter(x->x.getPoint().setScale(0, RoundingMode.HALF_UP).equals(model.getPoint().setScale(0, RoundingMode.HALF_UP))).findFirst().orElse(null);
        Assert.assertNotNull(point);
        Assert.assertEquals(point.getMemberId(),model.getMemberId());

        member= _memberAPIInvoker.getMemberByOpenId(openId) ;
        BigDecimal pointAfter = member.getPoint();
        Assert.assertEquals(pointAfter.setScale(0, RoundingMode.HALF_UP),pointBefore.subtract(model.getPoint()).setScale(0, RoundingMode.HALF_UP));
    }

    @Test(dataProvider = MemberDataProvider.DATA_ACQUIREVALUE,dataProviderClass = MemberDataProvider.class)
    private void acquireValueCase(AcquireValueModel model,String openId)
    {
        MemberInfo member= _memberAPIInvoker.getMemberByOpenId(openId) ;
        BigDecimal valueBefore = member.getValue();

        Assert.assertTrue(_memberAPIInvoker.acquireValue(model));

        Calendar  calendar = Calendar.getInstance();
        String start = Helper.getFormatDate(calendar);
        calendar.add(Calendar.DAY_OF_MONTH, +1);
        String end = Helper.getFormatDate(calendar);
        MemberValue[] values = _memberAPIInvoker.searchValues(new SearchValuesModel(model.getMemberId(),start,end)).getData();
        Assert.assertTrue(values.length >0);

        MemberValue value = Arrays.stream(values).filter(x->x.getAmount().setScale(0, RoundingMode.HALF_UP).equals(model.getValue().setScale(0, RoundingMode.HALF_UP))).findFirst().orElse(null);
        Assert.assertNotNull(value);
        Assert.assertEquals(value.getMemberId(),model.getMemberId());

        member= _memberAPIInvoker.getMemberByOpenId(openId) ;
        BigDecimal valueAfter = member.getValue();
        Assert.assertEquals(valueAfter.setScale(0, RoundingMode.HALF_UP),valueBefore.add(model.getValue()).setScale(0, RoundingMode.HALF_UP));
    }

    @Test(dataProvider = MemberDataProvider.DATA_GETGIFTITEMS,dataProviderClass = MemberDataProvider.class)
    private void getGiftItemsCase(GiftItemQueryModel model,String[] expect) {
        GiftItemInfo[] items = _memberAPIInvoker.getGiftItems(model).getContent();
        Assert.assertTrue(items.length == expect.length);

        Arrays.stream(items).forEach(x->
                {
                    Assert.assertNotNull(Arrays.stream(expect).filter(y->y.equals(x.getName())).findFirst().orElse(null));
                }
        );
    }

    @Test(dataProvider = MemberDataProvider.DATA_EXCHANGEGIFT,dataProviderClass = MemberDataProvider.class)
    private void exchangeGiftCase(GiftExchangeModel model,String openId) {

        MemberInfo member= _memberAPIInvoker.getMemberByOpenId(openId) ;
        BigDecimal pointBefore = member.getPoint();

        GiftItemInfo[] items = _memberAPIInvoker.getGiftItems(new GiftItemQueryModel(null,null,null)).getContent();
        Assert.assertTrue(items.length > 0);

        int count = 3;
        int amount = Arrays.stream(items).mapToInt(x->x.getPoint().intValue()).sum() *count;
        GiftExchangeItemModel[] exchangeItemModels =  Arrays.stream(items).map(x-> new GiftExchangeItemModel(x.getId(),count,x.getPoint())).toArray(GiftExchangeItemModel[]::new);
        model.setGifts(exchangeItemModels);

        int result = _memberAPIInvoker.exchangeGift(model);
        Assert.assertTrue(result >0);

        member= _memberAPIInvoker.getMemberByOpenId(openId) ;
        Assert.assertEquals(member.getPoint(),pointBefore.subtract(BigDecimal.valueOf(amount)));

        GiftExchangeQueryModel query = new GiftExchangeQueryModel(model.getMemberId());
        GIftExchangeInfo[] exchanges = _memberAPIInvoker.getGiftExchanges(query).getContent();
        Assert.assertTrue(exchanges.length>0);
        Assert.assertNotNull(Arrays.stream(exchanges).filter(x->x.getExchangeGiftId()==result).findFirst().orElse(null));
    }
}
