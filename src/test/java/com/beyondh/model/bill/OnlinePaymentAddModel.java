package com.beyondh.model.bill;

import java.math.BigDecimal;

public class OnlinePaymentAddModel {

    public OnlinePaymentAddModel(long hotelId, long billId, String roomDetail, String payType, BigDecimal amount) {
        HotelId = hotelId;
        BillId = billId;
        RoomDetail = roomDetail;
        PayType = payType;
        Amount = amount;
    }

    private long HotelId;
    public final long getHotelId()
    {
        return HotelId;
    }
    public final void setHotelId(long value)
    {
        HotelId = value;
    }

    private long BillId;
    public final long getBillId()
    {
        return BillId;
    }
    public final void setBillId(long value)
    {
        BillId = value;
    }

    private String RoomDetail;
    public final String getRoomDetail()
    {
        return RoomDetail;
    }
    public final void setRoomDetail(String value)
    {
        RoomDetail = value;
    }

    private String PayType;
    public final String getPayType()
    {
        return PayType;
    }
    public final void setPayType(String value)
    {
        PayType = value;
    }

    private java.math.BigDecimal Amount = new java.math.BigDecimal(0);
    public final java.math.BigDecimal getAmount()
    {
        return Amount;
    }
    public final void setAmount(java.math.BigDecimal value)
    {
        Amount = value;
    }

    private String OperationType;
    public final String getOperationType()
    {
        return OperationType;
    }
    public final void setOperationType(String value)
    {
        OperationType = value;
    }
}
