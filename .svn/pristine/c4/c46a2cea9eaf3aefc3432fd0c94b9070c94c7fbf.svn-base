package com.beyondh.model.hotel;

import com.beyondh.constants.TestConstants;
import com.beyondh.enums.pms.CheckinType;
import com.beyondh.model.OrderByRequest;
import com.google.gson.Gson;

import java.io.Serializable;

public class HotelSearchModel implements Serializable {

    public HotelSearchModel() {
        PageIndex =1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
        BasicInfoOnly =false;
        PhysicalRoomTypeOnly = false;
        IncludeDetailCounts = true;
        IncludePrices =true;
        IncludeRoomCounts =true;
        CheckinType = com.beyondh.enums.pms.CheckinType.Normal.getType();
    }

    public HotelSearchModel(String arriveTime, String departureTime, long[] hotelIds) {
        this();
        ArriveTime = arriveTime;
        DepartureTime = departureTime;
        HotelIds = hotelIds;
    }

    public HotelSearchModel(String arriveTime, String departureTime, long[] hotelIds, String[] roomTypeIds) {
        this(arriveTime,departureTime,hotelIds);
        RoomTypeIds = roomTypeIds;
    }

    public HotelSearchModel(String arriveTime, String departureTime, long[] hotelIds, String[] roomTypeIds,String searchType) {
        this(arriveTime,departureTime,hotelIds);
        RoomTypeIds = roomTypeIds;
        SearchType = searchType;
    }

    private String ArriveTime ;
    public  String getArriveTime()
    {
        return ArriveTime;
    }
    public  void setArriveTime(String value)
    {
        ArriveTime = value;
    }
    private String DepartureTime ;
    public  String getDepartureTime()
    {
        return DepartureTime;
    }
    public  void setDepartureTime(String value)
    {
        DepartureTime = value;
    }
    private long[] HotelIds;
    public  long[] getHotelIds()
    {
        return HotelIds;
    }
    public  void setHotelIds(long[] value)
    {
        HotelIds = value;
    }
    private String HotelName;
    public  String getHotelName()
    {
        return HotelName;
    }
    public  void setHotelName(String value)
    {
        HotelName = value;
    }
    private String[] OrgSns;
    public  String[] getOrgSns()
    {
        return OrgSns;
    }
    public  void setOrgSns(String[] value)
    {
        OrgSns = value;
    }
    private String CityId;
    public  String getCityId()
    {
        return CityId;
    }
    public  void setCityId(String value)
    {
        CityId = value;
    }
    private String DistrictId;
    public  String getDistrictId()
    {
        return DistrictId;
    }
    public  void setDistrictId(String value)
    {
        DistrictId = value;
    }
    private Integer Star;
    public  Integer getStar()
    {
        return Star;
    }
    public  void setStar(Integer value)
    {
        Star = value;
    }
    private String CommercialLocationId;
    public  String getCommercialLocationId()
    {
        return CommercialLocationId;
    }
    public  void setCommercialLocationId(String value)
    {
        CommercialLocationId = value;
    }
    private String Latitude;
    public  String getLatitude()
    {
        return Latitude;
    }
    public  void setLatitude(String value)
    {
        Latitude = value;
    }
    private String Longitude;
    public  String getLongitude()
    {
        return Longitude;
    }
    public  void setLongitude(String value)
    {
        Longitude = value;
    }
    private Integer Distance;
    public  Integer getDistance()
    {
        return Distance;
    }
    public  void setDistance(Integer value)
    {
        Distance = value;
    }
    private String[] ServiceTags;
    public  String[] getServiceTags()
    {
        return ServiceTags;
    }
    public  void setServiceTags(String[] value)
    {
        ServiceTags = value;
    }
    private boolean OnlyOpenedHotel;
    public  boolean getOnlyOpenedHotel()
    {
        return OnlyOpenedHotel;
    }
    public  void setOnlyOpenedHotel(boolean value)
    {
        OnlyOpenedHotel = value;
    }

    private String Channel;
    public  String getChannel()
    {
        return Channel;
    }
    public  void setChannel(String value)
    {
        Channel = value;
    }

    private  String ChannelType;
    public  String getChannelType()
    {
        return ChannelType;
    }
    public  void setChannelType(String value)
    {
        ChannelType = value;
    }

    private  String OrderSource;
    public  String getOrderSource()
    {
        return OrderSource;
    }
    public  void setOrderSource(String value)
    {
        OrderSource = value;
    }
    String CheckinType;
    public  String getCheckinType()
    {
        return CheckinType;
    }
    public  void setCheckinType(String value)
    {
        CheckinType = value;
    }
    String[] RoomTypeIds;
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
    private String[] MemberLevels;
    public  String[] getMemberLevels()
    {
        return MemberLevels;
    }
    public  void setMemberLevels(String[] value)
    {
        MemberLevels = value;
    }
    private boolean PhysicalRoomTypeOnly;
    public  boolean getPhysicalRoomTypeOnly()
    {
        return PhysicalRoomTypeOnly;
    }
    public  void setPhysicalRoomTypeOnly(boolean value)
    {
        PhysicalRoomTypeOnly = value;
    }
    private boolean BasicInfoOnly;
    public  boolean getBasicInfoOnly()
    {
        return BasicInfoOnly;
    }
    public  void setBasicInfoOnly(boolean value)
    {
        BasicInfoOnly = value;
    }
    boolean IncludeDetailCounts;
    public  boolean getIncludeDetailCounts()
    {
        return IncludeDetailCounts;
    }
    public  void setIncludeDetailCounts(boolean value)
    {
        IncludeDetailCounts = value;
    }
    private boolean IncludePrices;
    public  boolean getIncludePrices()
    {
        return IncludePrices;
    }
    public  void setIncludePrices(boolean value)
    {
        IncludePrices = value;
    }
    private boolean IncludeRoomCounts;
    public  boolean getIncludeRoomCounts()
    {
        return IncludeRoomCounts;
    }
    public  void setIncludeRoomCounts(boolean value)
    {
        IncludeRoomCounts = value;
    }
    private  String RateCode;
    public  String getRateCode()
    {
        return RateCode;
    }
    public  void setRateCode(String value)
    {
        RateCode = value;
    }
    String[] ContractorLevels;
    public  String[] getContractorLevels()
    {
        return ContractorLevels;
    }
    public  void setContractorLevels(String[] value)
    {
        ContractorLevels = value;
    }
    private String SearchType;
    public  String getSearchType()
    {
        return SearchType;
    }
    public  void setSearchType(String value)
    {
        SearchType = value;
    }

    private OrderByRequest[] OrderByRequests;
    public  OrderByRequest[] getOrderByRequests()
    {
        return OrderByRequests;
    }
    public  void setOrderByRequests(OrderByRequest[] value)
    {
        OrderByRequests = value;
    }
    private int PageSize;
    public  int getPageSize()
    {
        return PageSize;
    }
    public  void setPageSize(int value)
    {
        PageSize = value;
    }
    private int PageIndex;
    public  int getPageIndex()
    {
        return PageIndex;
    }
    public  void setPageIndex(int value)
    {
        PageIndex = value;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
