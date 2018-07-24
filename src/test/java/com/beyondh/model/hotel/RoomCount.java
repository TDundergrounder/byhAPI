package com.beyondh.model.hotel;

public class RoomCount {
    private String RoomTypeId;
    public String getRoomTypeId()
    {
        return RoomTypeId;
    }
    public void setRoomTypeId(String value)
    {
        RoomTypeId = value;
    }

    private  RoomType RoomType;
    public RoomType getRoomType()
    {
        return RoomType;
    }
    public void setRoomType(RoomType value)
    {
        RoomType = value;
    }

    private  int Count;
    public int getCount()
    {
        return Count;
    }
    public void setCount(int value)
    {
        Count = value;
    }

    private  int[] DetailCounts;
    public int[] getDetailCounts()
    {
        return DetailCounts;
    }
    public void setDetailCounts(int[] value)
    {
        DetailCounts = value;
    }

    private  int OverbookingCount;
    public int getOverbookingCount()
    {
        return OverbookingCount;
    }
    public void setOverbookingCount(int value)
    {
        OverbookingCount = value;
    }
}
