package com.beyondh.model.order;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderServiceItem implements Serializable {
    private long ItemId;

    private BigDecimal ItemPrice;

    private int ItemCount;

    private boolean CustomerOwned;

    private boolean PersistentOnRefresh;

    public OrderServiceItem(long itemId, BigDecimal itemPrice, int itemCount, boolean customerOwned, boolean persistentOnRefresh) {
        ItemId = itemId;
        ItemPrice = itemPrice;
        ItemCount = itemCount;
        CustomerOwned = customerOwned;
        PersistentOnRefresh = persistentOnRefresh;
    }

    public long getItemId() {
        return ItemId;
    }

    public void setItemId(long itemId) {
        ItemId = itemId;
    }

    public BigDecimal getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        ItemPrice = itemPrice;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public boolean isCustomerOwned() {
        return CustomerOwned;
    }

    public void setCustomerOwned(boolean customerOwned) {
        CustomerOwned = customerOwned;
    }

    public boolean isPersistentOnRefresh() {
        return PersistentOnRefresh;
    }

    public void setPersistentOnRefresh(boolean persistentOnRefresh) {
        PersistentOnRefresh = persistentOnRefresh;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
