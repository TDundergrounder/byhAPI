package com.beyondh.model.order;

public class AddCheckinModel {
    private long OrderId;

    private long OccupationId;

    private long OrgId;

    private CheckinCustomer Customer;

    public AddCheckinModel(long orderId, long occupationId, long orgId, CheckinCustomer customer) {
        OrderId = orderId;
        OccupationId = occupationId;
        OrgId = orgId;
        Customer = customer;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public long getOccupationId() {
        return OccupationId;
    }

    public void setOccupationId(long occupationId) {
        OccupationId = occupationId;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public CheckinCustomer getCustomer() {
        return Customer;
    }

    public void setCustomer(CheckinCustomer customer) {
        Customer = customer;
    }
}
