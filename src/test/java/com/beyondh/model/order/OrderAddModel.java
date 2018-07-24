package com.beyondh.model.order;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.Date;

public class OrderAddModel implements Serializable {
    private String CheckinType;

    private long OrgId;

    private String EstimatedArriveTime;

    private String EstimatedDepartureTime;

    private RoomPlan[] RoomPlans;

    private String MemberId;

    private long ContractId;

    private String SalerId;

    private Liaison[] Liaisons;

    private boolean Locked;

    private String ExpireKeepTime;

    private String PrePaymentTypeId;

    private long PromotionId;

    private String Memo;

    private boolean IsExtenalPrice;

    private String ExternalPriceName;

    private OrderServiceItem[] ServiceItems;

    private String OrderSn;

    private String OpenId;

    private String OrderSourceId;

    public String getCheckinType() {
        return CheckinType;
    }

    public void setCheckinType(String checkinType) {
        CheckinType = checkinType;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getEstimatedArriveTime() {
        return EstimatedArriveTime.replaceAll("T", " ");
    }

    public void setEstimatedArriveTime(String estimatedArriveTime) {
        EstimatedArriveTime = estimatedArriveTime;
    }

    public String getEstimatedDepartureTime() {
        return EstimatedDepartureTime.replaceAll("T", " ");
    }

    public void setEstimatedDepartureTime(String estimatedDepartureTime) {
        EstimatedDepartureTime = estimatedDepartureTime;
    }

    public RoomPlan[] getRoomPlans() {
        return RoomPlans;
    }

    public void setRoomPlans(RoomPlan[] roomPlans) {
        RoomPlans = roomPlans;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public long getContractId() {
        return ContractId;
    }

    public void setContractId(long contractId) {
        ContractId = contractId;
    }

    public String getSalerId() {
        return SalerId;
    }

    public void setSalerId(String salerId) {
        SalerId = salerId;
    }

    public Liaison[] getLiaisons() {
        return Liaisons;
    }

    public void setLiaisons(Liaison[] liaisons) {
        Liaisons = liaisons;
    }

    public boolean isLocked() {
        return Locked;
    }

    public void setLocked(boolean locked) {
        Locked = locked;
    }

    public String getExpireKeepTime() {
        return ExpireKeepTime.replaceAll("T", " ");
    }

    public void setExpireKeepTime(String expireKeepTime) {
        ExpireKeepTime = expireKeepTime;
    }

    public String getPrePaymentTypeId() {
        return PrePaymentTypeId;
    }

    public void setPrePaymentTypeId(String prePaymentTypeId) {
        PrePaymentTypeId = prePaymentTypeId;
    }

    public long getPromotionId() {
        return PromotionId;
    }

    public void setPromotionId(long promotionId) {
        PromotionId = promotionId;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }

    public boolean isExtenalPrice() {
        return IsExtenalPrice;
    }

    public void setExtenalPrice(boolean extenalPrice) {
        IsExtenalPrice = extenalPrice;
    }

    public String getExternalPriceName() {
        return ExternalPriceName;
    }

    public void setExternalPriceName(String externalPriceName) {
        ExternalPriceName = externalPriceName;
    }

    public OrderServiceItem[] getServiceItems() {
        return ServiceItems;
    }

    public void setServiceItems(OrderServiceItem[] serviceItems) {
        ServiceItems = serviceItems;
    }

    public String getOrderSn() {
        return OrderSn;
    }

    public void setOrderSn(String orderSn) {
        OrderSn = orderSn;
    }

    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String openId) {
        OpenId = openId;
    }

    public String getOrderSourceId() {
        return OrderSourceId;
    }

    public void setOrderSourceId(String orderSourceId) {
        OrderSourceId = orderSourceId;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
