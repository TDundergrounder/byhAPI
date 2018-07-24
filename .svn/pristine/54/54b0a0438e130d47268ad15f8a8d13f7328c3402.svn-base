package com.beyondh.dataprovider;

import com.beyondh.constants.TestConstants;

import com.beyondh.model.Member.*;
import com.beyondh.utility.ClientGroup;
import com.beyondh.utility.Helper;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;

@ClientGroup(TestConstants.GRPOUP_MEMBER)
public class MemberDataProvider extends  AbstractTestDataProvider {

    protected static HashMap<String, String> _crmData = _data.get(TestConstants.DATA_MODULE_MEMBER);

    public static final String DATA_REGISTERMEMBER = "RegisterMemberCase";

    public static final String DATA_ACQUIREPOINT = "AcquirePointCase";

    public static final String DATA_CONSUMEPOINT = "ConsumePointCase";

    public static final String DATA_ACQUIREVALUE = "AcquireValueCase";

    public static final String DATA_GETGIFTITEMS= "GetGiftItemsCase";

    public static final String DATA_EXCHANGEGIFT= "ExchangeGiftCase";

    @DataProvider(name = DATA_REGISTERMEMBER)
    public static Object[][] queryCheckinSmartDoorLocksCaseData(ITestContext context) {
        return new Object[][]{
                {new RegisterModel(Helper.getRandomChineseName(),Helper.getMobileNumber(),TestConstants.CARD_TYPE_C01,Helper.getRandomNumber(18),_commonData.get("LevelCommon"),_crmData.get("Password"))},
                {new RegisterModel(Helper.getRandomChineseName(),Helper.getMobileNumber(),TestConstants.CARD_TYPE_C01,Helper.getRandomNumber(18),_commonData.get("LevelCommon"),Helper.getRandomNumber(28),_crmData.get("Password"))},
                {new RegisterModel(Helper.getRandomChineseName(),Helper.getMobileNumber(),TestConstants.CARD_TYPE_C01,Helper.getRandomNumber(18),_commonData.get("LevelCommon"),_crmData.get("MemberOperator"),_crmData.get("Password"),Helper.getRandomChinese(10),Helper.getRandomChinese(4), Helper.getRandomNumber(28))}

        };
    }

    @DataProvider(name = DATA_ACQUIREPOINT)
    public static Object[][] acquirePointCaseData(ITestContext context) {

        Calendar calendar = Calendar.getInstance();
        return new Object[][]{
                {new AcquirePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(4)),DATA_ACQUIREPOINT,Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"11",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new AcquirePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(4)),DATA_ACQUIREPOINT,Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"0",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new AcquirePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(4)),DATA_ACQUIREPOINT,Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"3",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new AcquirePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(4)),DATA_ACQUIREPOINT,Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"4",_crmData.get("Channel")),_commonData.get("MemberOpenId")}

        } ;
    }

    @DataProvider(name = DATA_CONSUMEPOINT)
    public static Object[][] consumePointCaseData(ITestContext context) {
        Calendar calendar = Calendar.getInstance();
        return new Object[][]{
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(10),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"0",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(11),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"2",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(12),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"3",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(13),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"4",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(14),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"5",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(15),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"6",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(16),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"7",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(17),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"9",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(18),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"10",_crmData.get("Channel")),_commonData.get("MemberOpenId")},
                {new ConsumePointModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),Helper.getRandomChinese(19),Helper.getFormatDateTime(calendar),_crmData.get("MemberOperator"),getOrgId(),"11",_crmData.get("Channel")),_commonData.get("MemberOpenId")}
        };
    }

    @DataProvider(name = DATA_ACQUIREVALUE)
    public static Object[][] acquireValueCaseData(ITestContext context) {
        return new Object[][]{
                {new AcquireValueModel(_commonData.get("MemberId"), new BigDecimal(Helper.getRandomNumber(2)),DATA_ACQUIREVALUE,getOrgId(),_crmData.get("MoneyWay"),_crmData.get("Channel")),_commonData.get("MemberOpenId")}
        };
    }

    @DataProvider(name = DATA_GETGIFTITEMS)
    public static Object[][] getGiftItemsCaseData(ITestContext context) {
        return new Object[][]{
                {new GiftItemQueryModel(BigDecimal.valueOf(0),BigDecimal.valueOf(1000),null), new String[]{_crmData.get("GiftToyTaidi"),_crmData.get("GiftPresentNotebook")}},
                {new GiftItemQueryModel(BigDecimal.valueOf(0),BigDecimal.valueOf(20),_crmData.get("GiftToy")),new String[]{_crmData.get("GiftToyTaidi")}},
                {new GiftItemQueryModel(BigDecimal.valueOf(20),BigDecimal.valueOf(100),_crmData.get("GiftPresent")),new String[]{_crmData.get("GiftPresentNotebook")}},
        };
    }

    @DataProvider(name = DATA_EXCHANGEGIFT)
    public static Object[][] exchangeGiftData(ITestContext context) {
        return new Object[][]{
                {new GiftExchangeModel(_commonData.get("MemberId"),getOrgId(),_commonData.get("MemberName"),DATA_EXCHANGEGIFT,null),_commonData.get("MemberOpenId")}
        };
    }
}
