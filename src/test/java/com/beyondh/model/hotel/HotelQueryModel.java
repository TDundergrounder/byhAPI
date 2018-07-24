package com.beyondh.model.hotel;

import com.beyondh.constants.TestConstants;
import com.beyondh.model.OrderByRequest;
import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;

public class HotelQueryModel implements Serializable {
    private String HotelName;
    private String CityId;
    private int Distance;
    private BigDecimal Latitude;
    private BigDecimal Longitude;
    private String[] ServiceTags;
    private  OrderByRequest[] OrderByRequests;


    public int getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(int pageIndex) {
        PageIndex = pageIndex;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    private int PageIndex;
    private int PageSize;

    public OrderByRequest[] getOrderByRequests() {
        return OrderByRequests;
    }

    public void setOrderByRequests(OrderByRequest[] orderByRequests) {
        OrderByRequests = orderByRequests;
    }

    public HotelQueryModel(String hotelName) {
        HotelName = hotelName;
        PageIndex = 1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
        OrderByRequests = new OrderByRequest[] {new OrderByRequest("OrgName",true)};
    }

    public HotelQueryModel(boolean isAsced) {
        PageIndex = 1;
        PageSize = TestConstants.RESULT_DEFUALT_SIZE;
        OrderByRequests = new OrderByRequest[] {new OrderByRequest("OrgName",isAsced)};
    }

    public HotelQueryModel(String hotelName, String cityId) {
        HotelName = hotelName;
        CityId = cityId;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getCityId() {
        return CityId;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public int getDistance() {
        return Distance;
    }

    public void setDistance(int distance) {
        Distance = distance;
    }

    public BigDecimal getLatitude() {
        return Latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        Latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return Longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        Longitude = longitude;
    }

    public String[] getServiceTags() {
        return ServiceTags;
    }

    public void setServiceTags(String[] serviceTags) {
        ServiceTags = serviceTags;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
