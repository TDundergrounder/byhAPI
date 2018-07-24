package com.beyondh.cases.coupon;
import com.beyondh.cases.AbstractTestCase;
import com.beyondh.constants.TestConstants;
import com.beyondh.dataprovider.CouponDataProvider;
import com.beyondh.dataprovider.AbstractTestDataProvider;
import com.beyondh.enums.pms.CouponStatus;
import com.beyondh.enums.pms.CouponType;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.beyondh.utility.ClientGroup;
import com.beyondh.model.coupon.*;
import com.beyondh.model.order.*;
import com.beyondh.model.PagedModel;
import com.beyondh.model.coupon.CouponInfo;
import com.beyondh.model.coupon.CouponCheckModel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

@Test(groups = (TestConstants.GRPOUP_COUPON),singleThreaded=true)
@ClientGroup(TestConstants.GRPOUP_COUPON)
public class CouponCase extends AbstractTestCase{
    @Test(dataProvider = CouponDataProvider.DATA_COUPONS,dataProviderClass = CouponDataProvider.class)
    private void couponsCase(CouponUseModel model,long templateId,String expectDiscount) {

        CouponTemplateInfo templateBefore = _couponAPIInvoker.getCouponTemplate(templateId);
        Assert.assertNotNull(templateBefore);
        Assert.assertEquals(templateBefore.getDeductionTypeId(),CouponType.Discount.getType());
        Assert.assertEquals(templateBefore.getDeductionItemValue(),expectDiscount);

        CouponPublishModel publishModel = new CouponPublishModel(model.getMemberId(),model.getMobileNo(),model.getUserOtherId(),new CouponPublishDetailModel[]{new CouponPublishDetailModel(templateId,1)});
        Assert.assertTrue(_couponAPIInvoker.publish(publishModel));

        MyCouponQueryModel queryModel = new MyCouponQueryModel(CouponStatus.ReadyForUse.getStatusString(),model.getMemberId(),model.getMobileNo(),model.getUserOtherId());
        CouponInfo[] couponInfosBefore = _couponAPIInvoker.getMyCoupons(queryModel).getContent();
        Assert.assertTrue(couponInfosBefore.length >0);

        AvailableCouponQueryModel queryAvailableModel = new AvailableCouponQueryModel(model.getMemberId(),model.getMobileNo(),model.getUserOtherId(),model.getOrgId(),model.getRoomTypeId(),new String[]{CouponType.Discount.getType()});
        CouponInfo[] availableCoupsBefore = _couponAPIInvoker.getAvailableCoupons(queryAvailableModel);
        Assert.assertTrue(availableCoupsBefore.length >0);

        CouponInfo couponInfoDiscount = Arrays.stream(availableCoupsBefore).filter(x->x.getStatusId().equals(CouponStatus.ReadyForUse.getStatusString())).findFirst().orElse(null);
        Assert.assertNotNull(couponInfoDiscount);

        String serialNo = couponInfoDiscount.getSerialNo();
        CouponInfo coupon = _couponAPIInvoker.getCoupon(serialNo);
        Assert.assertNotNull(coupon);
        Assert.assertEquals(coupon.getStatusId(), CouponStatus.ReadyForUse.getStatusString());
        Assert.assertEquals(coupon.getTemplateDeductionItemValue(), expectDiscount);

        CouponCheckModel couponCheckModel = new CouponCheckModel(model.getOrgId(),serialNo);
        boolean Checkresult = _couponAPIInvoker.checkCoupon( couponCheckModel);
        Assert.assertTrue(Checkresult);

        model.setSerialNo(serialNo);
        CouponDeductionInfo deductionInfo = _couponAPIInvoker.useCoupon(model);
        Assert.assertNotNull(deductionInfo);
        Assert.assertEquals(deductionInfo.getDiscount().setScale(0, RoundingMode.HALF_UP), (new BigDecimal(expectDiscount)).setScale(0, RoundingMode.HALF_UP));

        CouponInfo[] couponInfosAfter = _couponAPIInvoker.getMyCoupons(queryModel).getContent();
        Assert.assertTrue(couponInfosAfter.length >0);
        Assert.assertEquals(couponInfosAfter.length, couponInfosBefore.length -1);

        CouponInfo[] availableCoupsAfter = _couponAPIInvoker.getAvailableCoupons(queryAvailableModel);
        Assert.assertTrue(availableCoupsBefore.length >0);
        Assert.assertEquals(availableCoupsAfter.length, availableCoupsBefore.length -1);

        CouponTemplateInfo templateAfter = _couponAPIInvoker.getCouponTemplate(templateId);
        Assert.assertNotNull(templateAfter);
        Assert.assertEquals(templateAfter.getPublishedCount(), templateBefore.getPublishedCount() +1);
        Assert.assertEquals(templateAfter.getUsedCount(), templateBefore.getUsedCount() +1);

    }
}
