package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;

public class HotelInfo implements Serializable
{
        private long OrgId;

        private String OrgName;

        private String OrgInfoType;

        private String Brand;

        private String Address;

        private String Phone;

        private String Fax;

        private String Description;

        private String CityId;

        private String District;

        private String CommercialLocation;

        private String Longitude;

        private String Latitude;

        private String[] ServiceTags;

        private Integer Star;

        private Boolean CanNetOpen;

        private String ZipCode;

        private String OrgSn;

        private String OrgStatus;

        private String ImageUris;

        private String PanoramicSite;

        private String WeChatLocation;

    public HotelInfo(long orgId, String orgName) {
        OrgId = orgId;
        OrgName = orgName;
    }

    public HotelInfo(long orgId, String orgName, String orgSn) {
        OrgId = orgId;
        OrgName = orgName;
        OrgSn = orgSn;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public String getOrgInfoType() {
        return OrgInfoType;
    }

    public void setOrgInfoType(String orgInfoType) {
        OrgInfoType = orgInfoType;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCityId() {
        return CityId;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getCommercialLocation() {
        return CommercialLocation;
    }

    public void setCommercialLocation(String commercialLocation) {
        CommercialLocation = commercialLocation;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String[] getServiceTags() {
        return ServiceTags;
    }

    public void setServiceTags(String[] serviceTags) {
        ServiceTags = serviceTags;
    }

    public Integer getStar() {
        return Star;
    }

    public void setStar(Integer star) {
        Star = star;
    }

    public Boolean getCanNetOpen() {
        return CanNetOpen;
    }

    public void setCanNetOpen(Boolean canNetOpen) {
        CanNetOpen = canNetOpen;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public String getOrgSn() {
        return OrgSn;
    }

    public void setOrgSn(String orgSn) {
        OrgSn = orgSn;
    }

    public String getOrgStatus() {
        return OrgStatus;
    }

    public void setOrgStatus(String orgStatus) {
        OrgStatus = orgStatus;
    }

    public String getImageUris() {
        return ImageUris;
    }

    public void setImageUris(String imageUris) {
        ImageUris = imageUris;
    }

    public String getPanoramicSite() {
        return PanoramicSite;
    }

    public void setPanoramicSite(String panoramicSite) {
        PanoramicSite = panoramicSite;
    }

    public String getWeChatLocation() {
        return WeChatLocation;
    }

    public void setWeChatLocation(String weChatLocation) {
        WeChatLocation = weChatLocation;
    }

    @Override
public String toString(){
    return new Gson().toJson(this);
}
}
