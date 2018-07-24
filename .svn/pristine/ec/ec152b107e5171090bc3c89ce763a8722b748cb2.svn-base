package com.beyondh.model.order;

import com.beyondh.constants.TestConstants;
import org.testng.annotations.Test;

public class OrdersSearchModel {
    private int PageSize;

    private int PageIndex;

    private Long OrgId;

    private String MemberId;

    private String OpenId;

    private String Keywords;

    private String Channel;

    private Boolean IncludeOrgInfo;

    private String BeginTime;

    private String EndTime;

    private String[] OrderStatusIds;

    public OrdersSearchModel(Long orgId) {
        OrgId = orgId;
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
    }

    public OrdersSearchModel(Long orgId, String[] orderStatusIds) {
        OrgId = orgId;
        OrderStatusIds = orderStatusIds;
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
    }

    public OrdersSearchModel(Long orgId, String keywords, String[] orderStatusIds) {
        OrgId = orgId;
        Keywords = keywords;
        OrderStatusIds = orderStatusIds;
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public int getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(int pageIndex) {
        PageIndex = pageIndex;
    }

    public Long getOrgId() {
        return OrgId;
    }

    public void setOrgId(Long orgId) {
        OrgId = orgId;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String openId) {
        OpenId = openId;
    }

    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String keywords) {
        Keywords = keywords;
    }

    public String getChannel() {
        return Channel;
    }

    public void setChannel(String channel) {
        Channel = channel;
    }

    public Boolean getIncludeOrgInfo() {
        return IncludeOrgInfo;
    }

    public void setIncludeOrgInfo(Boolean includeOrgInfo) {
        IncludeOrgInfo = includeOrgInfo;
    }

    public String getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(String beginTime) {
        BeginTime = beginTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String[] getOrderStatusIds() {
        return OrderStatusIds;
    }

    public void setOrderStatusIds(String[] orderStatusIds) {
        OrderStatusIds = orderStatusIds;
    }
}
