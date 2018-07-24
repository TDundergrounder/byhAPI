package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.io.Serializable;

public class HotelBrandInfo implements Serializable {
    private String BrandCode;
    private String BrandName;
    private String Description;

    public String getBrandCode() {
        return BrandCode;
    }

    public void setBrandCode(String brandCode) {
        BrandCode = brandCode;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
