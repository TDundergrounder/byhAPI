package com.beyondh.model.bill;

import com.beyondh.enums.pms.BillItemType;
import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BillItemModel implements Serializable {
    private long BillItemId;

    private long OrderId;

    private String OrderNo;

    private String RoomNumber;

    private String CheckinName;

    private Date ArriveTime;

    private Date DepartureTime;

    private long BillId;

    private String BillNo ;

    private Date BusinessDate;

    private BillItemType ItemType;

    private String CreditType;

    private String DebitType;

    private String BillName;

    private BigDecimal Amount;

    private String Memo;

    private String CreatorName;

    private Date CreateTimeInUtc;

    private long TransactoinId;

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
