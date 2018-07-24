package com.beyondh.invoker;
import com.beyondh.client.APIResult;
import com.beyondh.constants.TestConstants;
import com.beyondh.constants.SpringConstants;
import com.beyondh.enums.APICode;
import com.beyondh.model.PagedModel;
import com.beyondh.model.coupon.CouponInfo;
import com.beyondh.model.coupon.MyCouponQueryModel;
import com.beyondh.model.coupon.*;
import com.google.gson.reflect.TypeToken;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SpringConstants.SCOPE_SINGLETON)
public class CouponAPIInvoker extends  AbstractAPIInvoker {
    public CouponAPIInvoker()
    {
        super(TestConstants.COUPON_ROUTE);
    }

    public PagedModel<CouponInfo> getMyCoupons(MyCouponQueryModel myCouponQueryModel)
    {
        APIResult result = post("GetMyCoupons", myCouponQueryModel);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(new TypeToken<PagedModel<CouponInfo>>(){}.getType());

        return null;
    }

    public CouponInfo getCoupon( String serialNo)
    {
        APIResult result = post("GetCoupon", serialNo);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(CouponInfo.class);

        return null;
    }

    public boolean checkCoupon(CouponCheckModel model ) {
        APIResult result = post("CheckCoupon", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }

    public CouponDeductionInfo useCoupon(CouponUseModel model ) {
        APIResult result = post("UseCoupon", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(CouponDeductionInfo.class);

        return null;
    }

    public CouponInfo[] getAvailableCoupons(AvailableCouponQueryModel model)
    {
        APIResult result = post("GetAvailableCoupons", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(CouponInfo[].class);

        return null;
    }

    public CouponTemplateInfo getCouponTemplate(long id)
    {
        APIResult result = post("GetCouponTemplate", id);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(CouponTemplateInfo.class);

        return null;
    }

    public boolean publish(CouponPublishModel model)
    {
        APIResult result = post("Publish", model);
        if (result.getCode().equals(APICode.Success.getCode()))
            return result.getContent(boolean.class);

        return false;
    }
}
