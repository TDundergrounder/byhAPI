package com.beyondh.model.hotel;

public class AvailableRoomQueryModel {
    public AvailableRoomQueryModel(Long orgId, String arriveTime, String departureTime) {
        OrgId = orgId;
        ArriveTime = arriveTime;
        DepartureTime = departureTime;
    }

    public AvailableRoomQueryModel(Long orgId, String arriveTime, String departureTime, String[] roomTypeIds) {
        this(orgId,arriveTime,departureTime);
        RoomTypeIds = roomTypeIds;
    }

    public AvailableRoomQueryModel(Long orgId,String arriveTime, String departureTime, String[] roomTypeIds, String[] roomStatuses) {
        this(orgId,arriveTime,departureTime,roomTypeIds);
        RoomStatuses = roomStatuses;
    }

    private Long OrgId;
    public  Long getOrgId()
    {
        return OrgId;
    }
    public  void setOrgId(Long value)
    {
        OrgId = value;
    }
    private Long[] HallIds;
    public  Long[] getHallIds()
    {
        return HallIds;
    }
    public  void setHallIds(Long[] value)
    {
        HallIds = value;
    }
    private  Long[] FloorIds;
    public  Long[] getFloorIds()
    {
        return FloorIds;
    }
    public  void setFloorIds(Long[] value)
    {
        FloorIds = value;
    }
    private  String[] RoomAttributeIds;
    public  String[] getRoomAttributeIds()
    {
        return RoomAttributeIds;
    }
    public  void setRoomAttributeIds(String[] value)
    {
        RoomAttributeIds = value;
    }
    private String[] RoomTypeIds;
    public  String[] getRoomTypeIds()
    {
        return RoomTypeIds;
    }
    public  void setRoomTypeIds(String[] value)
    {
        RoomTypeIds = value;
    }
    private String[] RoomStatuses;
    public  String[] getRoomStatuses()
    {
        return RoomStatuses;
    }
    public  void setRoomStatuses(String[] value)
    {
        RoomStatuses = value;
    }
    private String ArriveTime;
    public  String getArriveTime()
    {
        return ArriveTime;
    }
    public  void setArriveTime(String value)
    {
        ArriveTime = value;
    }
    private String DepartureTime;
    public  String getDepartureTime()
    {
        return DepartureTime;
    }
    public  void setDepartureTime(String value)
    {
        DepartureTime = value;
    }
    private String CheckinType;
    public  String getCheckinType()
    {
        return CheckinType;
    }
    public  void setCheckinType(String value)
    {
        CheckinType = value;
    }
}
