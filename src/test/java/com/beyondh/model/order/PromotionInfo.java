package com.beyondh.model.order;

import com.google.gson.Gson;

import java.io.Serializable;

public class PromotionInfo implements Serializable {

    private long PromotionId;
    public  long getPromotionId()
    {
        return PromotionId;
    }
    public  void setPromotionId(long value)
    {
        PromotionId = value;
    }

    private String Name;
    public  String getName()
    {
        return Name;
    }
    public  void setName(String value)
    {
        Name = value;
    }

    private String Description;
    public  String getDescription()
    {
        return Description;
    }
    public  void setDescription(String value)
    {
        Description = value;
    }

    private String BeginTime ;
    public  String getBeginTime()
    {
        return BeginTime;
    }
    public  void setBeginTime(String value)
    {
        BeginTime = value;
    }

    private String EndTime ;
    public String getEndTime()
    {
        return EndTime;
    }
    public  void setEndTime(String value)
    {
        EndTime = value;
    }

    private boolean LockOrder;
    public  boolean getLockOrder()
    {
        return LockOrder;
    }
    public  void setLockOrder(boolean value)
    {
        LockOrder = value;
    }

    private boolean BaseOnBasicPrice;
    public  boolean getBaseOnBasicPrice()
    {
        return BaseOnBasicPrice;
    }
    public  void setBaseOnBasicPrice(boolean value)
    {
        BaseOnBasicPrice = value;
    }

    private boolean IsActive;
    public  boolean getIsActive()
    {
        return IsActive;
    }
    public  void setIsActive(boolean value)
    {
        IsActive = value;
    }

    private Integer Ceiling;
    public  Integer getCeiling()
    {
        return Ceiling;
    }
    public  void setCeiling(Integer value)
    {
        Ceiling = value;
    }

    private int Remain;
    public  int getRemain()
    {
        return Remain;
    }
    public  void setRemain(int value)
    {
        Remain = value;
    }

    private RoomPrice[] DetailPrices;
    public RoomPrice[] getDetailPrices()
    {
        return DetailPrices;
    }
    public  void setDetailPrices(RoomPrice[] value)
    {
        DetailPrices = value;
    }


    @Override
    public String toString(){
        return new Gson().toJson(this);
    }

}
