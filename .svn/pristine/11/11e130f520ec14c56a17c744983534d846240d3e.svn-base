package com.beyondh.dataprovider;
import com.beyondh.constants.TestConstants;
import com.beyondh.enums.pms.CouponStatus;
import com.beyondh.model.coupon.*;
import com.beyondh.model.order.OrderInfo;
import com.beyondh.utility.ClientGroup;
import com.beyondh.utility.Helper;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.util.HashMap;

@ClientGroup(TestConstants.GRPOUP_COUPON)
public class CouponDataProvider extends  AbstractTestDataProvider {

    protected  static HashMap<String,String> _coupanData = _data.get(TestConstants.DATA_MODULE_COUPON);

    public static final String DATA_COUPONS = "CouponsCases";

    @DataProvider(name = DATA_COUPONS)
    public static Object[][] couponsCaseData(ITestContext context) {

        OrderInfo order = getDefaultOrder(context);
        return new Object[][]{
                {new CouponUseModel(_commonData.get("MemberId"),null,null,getOrgId(),order.getOrderId(),order.getBillId(),_commonData.get("RoomTypeTR")),Long.valueOf(_coupanData.get("TemplateId")),_coupanData.get("CouponDiscount")},
                {new CouponUseModel(null,_commonData.get("MemberMobile"),null,getOrgId(),order.getOrderId(),order.getBillId(),_commonData.get("RoomTypeTR")),Long.valueOf(_coupanData.get("TemplateId")),_coupanData.get("CouponDiscount")},
                {new CouponUseModel(null,null,_commonData.get("MemberOpenId"),getOrgId(),order.getOrderId(),order.getBillId(),_commonData.get("RoomTypeTR")),Long.valueOf(_coupanData.get("TemplateId")),_coupanData.get("CouponDiscount")},
                {new CouponUseModel(_commonData.get("MemberId"),null,_commonData.get("MemberOpenId"),getOrgId(),order.getOrderId(),order.getBillId(),_commonData.get("RoomTypeTR")),Long.valueOf(_coupanData.get("TemplateId")),_coupanData.get("CouponDiscount")},
                {new CouponUseModel(_commonData.get("MemberId"),_commonData.get("MemberMobile"),null,getOrgId(),order.getOrderId(),order.getBillId(),_commonData.get("RoomTypeTR")),Long.valueOf(_coupanData.get("TemplateId")),_coupanData.get("CouponDiscount")},
                {new CouponUseModel(null,_commonData.get("MemberMobile"),_commonData.get("MemberOpenId"),getOrgId(),order.getOrderId(),order.getBillId(),_commonData.get("RoomTypeTR")),Long.valueOf(_coupanData.get("TemplateId")),_coupanData.get("CouponDiscount")},
                {new CouponUseModel(_commonData.get("MemberId"),_commonData.get("MemberMobile"),_commonData.get("MemberOpenId"),getOrgId(),order.getOrderId(),order.getBillId(),_commonData.get("RoomTypeTR")),Long.valueOf(_coupanData.get("TemplateId")),_coupanData.get("CouponDiscount")},
        };
    }

}
