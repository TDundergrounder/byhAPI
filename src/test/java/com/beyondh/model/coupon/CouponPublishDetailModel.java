package com.beyondh.model.coupon;

public class CouponPublishDetailModel {
    private long TemplateId;
    private int Count;

    public CouponPublishDetailModel(long templateId, int count) {
        TemplateId = templateId;
        Count = count;
    }

    public long getTemplateId() {
        return TemplateId;
    }

    public void setTemplateId(long templateId) {
        TemplateId = templateId;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }
}
