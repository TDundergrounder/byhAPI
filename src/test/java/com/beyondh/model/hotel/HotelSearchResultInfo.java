package com.beyondh.model.hotel;

import com.beyondh.model.order.RoomPrice;

public class HotelSearchResultInfo {
    private long HotelId;
    public  long getHotelId()
    {
        return HotelId;
    }
    public  void setHotelId(long value)
    {
        HotelId = value;
    }
    private String OrgSn;
    public  String getOrgSn()
    {
        return OrgSn;
    }
    public  void setOrgSn(String value)
    {
        OrgSn = value;
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
    private String Brand;
    public  String getBrand()
    {
        return Brand;
    }
    public  void setBrand(String value)
    {
        Brand = value;
    }
    private String Address;
    public  String getAddress()
    {
        return Address;
    }
    public  void setAddress(String value)
    {
        Address = value;
    }
    private String Phone;
    public  String getPhone()
    {
        return Phone;
    }
    public  void setPhone(String value)
    {
        Phone = value;
    }
    private String Fax;
    public  String getFax()
    {
        return Fax;
    }
    public  void setFax(String value)
    {
        Fax = value;
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
    private String CityId;
    public  String getCityId()
    {
        return CityId;
    }
    public  void setCityId(String value)
    {
        CityId = value;
    }
    private String HotelInfoType;
    public  String getHotelInfoType()
    {
        return HotelInfoType;
    }
    public  void setHotelInfoType(String value)
    {
        HotelInfoType = value;
    }
    private int Star;
    public  int getStar()
    {
        return Star;
    }
    public  void setStar(int value)
    {
        Star = value;
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
    private String longitude;
    public  String getlongitude()
    {
        return longitude;
    }
    public  void setlongitude(String value)
    {
        longitude = value;
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
    private RoomPrice[] Prices;
    public  RoomPrice[] getPrices()
    {
        return Prices;
    }
    public  void setPrices(RoomPrice[] value)
    {
        Prices = value;
    }
    private RoomCount[] RoomCounts;
    public  RoomCount[] getRoomCounts()
    {
        return RoomCounts;
    }
    public  void setRoomCounts(RoomCount[] value)
    {
        RoomCounts = value;
    }
    private boolean CanNetOpen;
    public  boolean getCanNetOpen()
    {
        return CanNetOpen;
    }
    public  void setCanNetOpen(boolean value)
    {
        CanNetOpen = value;
    }
    private String ImageUris;
    public  String getImageUris()
    {
        return ImageUris;
    }
    public  void setImageUris(String value)
    {
        ImageUris = value;
    }
    private String DecorationDate;
    public  String getDecorationDate()
    {
        return DecorationDate;
    }
    public  void setDecorationDate(String value)
    {
        DecorationDate = value;
    }
    private  String OpeningDate;
    public  String getOpeningDate()
    {
        return OpeningDate;
    }
    public  void setOpeningDate(String value)
    {
        OpeningDate = value;
    }
    private String WeChatLocationId;
    public  String getWeChatLocationId()
    {
        return WeChatLocationId;
    }
    public  void setWeChatLocationId(String value)
    {
        WeChatLocationId = value;
    }
    private String PanoramicSite;
    public  String getPanoramicSite()
    {
        return PanoramicSite;
    }
    public  void setPanoramicSite(String value)
    {
        PanoramicSite = value;
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
    private  String CommercialLocationId;
    public  String getCommercialLocationId()
    {
        return CommercialLocationId;
    }
    public  void setCommercialLocationId(String value)
    {
        CommercialLocationId = value;
    }
    private String CityName;
    public  String getCityName()
    {
        return CityName;
    }
    public  void setCityName(String value)
    {
        CityName = value;
    }
    private String OrgStatus;
    public  String getOrgStatus()
    {
        return OrgStatus;
    }
    public  void setOrgStatus(String value)
    {
        OrgStatus = value;
    }
    private RoomPrice[] LowestPrices;

    public RoomPrice[] getLowestPrices() {
        return LowestPrices;
    }

    public void setLowestPrices(RoomPrice[] lowestPrices) {
        LowestPrices = lowestPrices;
    }
}
