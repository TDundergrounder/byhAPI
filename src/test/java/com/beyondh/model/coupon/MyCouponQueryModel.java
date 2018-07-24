package com.beyondh.model.coupon;
import com.beyondh.constants.TestConstants;
import com.beyondh.enums.pms.CouponStatus;
import com.beyondh.model.coupon.BaseCouponQueryModel;

public class MyCouponQueryModel {
    private String CouponStatus;
    public  String getCouponStatus()
    {
        return CouponStatus;
    }
    public  void setCouponStatus(String value)
    {
        CouponStatus = value;
    }

    private Integer PageSize;
    public  Integer getPageSize()
    {
        return PageSize;
    }
    public  void setPageSize(Integer value)
    {
        PageSize = value;
    }

    private Integer PageIndex;
    public  Integer getPageIndex()
    {
        return PageIndex;
    }
    public  void setPageIndex(Integer value)
    {
        PageIndex = value;
    }

    private String MemberId;
    public  String getMemberId()
    {
        return MemberId;
    }
    public  void setMemberId(String value)
    {
        MemberId = value;
    }

    private String MobileNo;
    public  String getMobileNo()
    {
        return MobileNo;
    }
    public  void setMobileNo(String value)
    {
        MobileNo = value;
    }

    private String UserOtherId;
    public  String getUserOtherId()
    {
        return UserOtherId;
    }
    public  void setUserOtherId(String value)
    {
        UserOtherId = value;
    }

    private String UserFromType;
    public  String getUserFromType()
    {
        return UserFromType;
    }
    public  void setUserFromType(String value)
    {
        UserFromType = value;
    }

    public MyCouponQueryModel(String couponStatus,String memberId,String userFromType)
    {
        CouponStatus = couponStatus;
        PageIndex =1;
        PageSize = 10000;
        MemberId = memberId;
        UserFromType = userFromType;
    }

    public MyCouponQueryModel(String couponStatus,String memberId)
    {
        CouponStatus = couponStatus;
        PageIndex =1;
        PageSize = 10000;
        MemberId = memberId;
    }

    public MyCouponQueryModel(String couponStatus, String memberId, String mobileNo, String userOtherId) {
        CouponStatus = couponStatus;
        MemberId = memberId;
        MobileNo = mobileNo;
        UserOtherId = userOtherId;
        PageIndex =1;
        PageSize = 10000;
    }
}
