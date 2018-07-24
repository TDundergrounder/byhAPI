package com.beyondh.model.bill;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;

public class SmallWareOrderItem implements Serializable {
    private String Id;
    private String GoodsNo;
    private String Name;
    private int Count;
    private BigDecimal Price;
    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
