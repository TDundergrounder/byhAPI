package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HotelGoodsInfo {
    private long OrgId;
    private String GoodsId;
    private String GoodsName;
    private BigDecimal Price;
    private BigDecimal Count;
    private String Category;
    private Long CategoryId;
    private Long ParentCategoryId;
    private String GoodsNo;
    private String Unit;
    private Boolean IsSaleable;
    private Boolean IsActive;
    private String GoodsDescription;
    private String ImageUris;

    public HotelGoodsInfo(long orgId, String goodsId, String goodsName, BigDecimal price) {
        OrgId = orgId;
        GoodsId = goodsId;
        GoodsName = goodsName;
        Price = price;
    }

    public long getOrgId() {
        return OrgId;
    }

    public void setOrgId(long orgId) {
        OrgId = orgId;
    }

    public String getGoodsId() {
        return GoodsId;
    }

    public void setGoodsId(String goodsId) {
        GoodsId = goodsId;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public BigDecimal getPrice() {
        return Price.setScale(2, RoundingMode.HALF_UP);
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public BigDecimal getCount() {
        return Count;
    }

    public void setCount(BigDecimal count) {
        Count = count;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Long categoryId) {
        CategoryId = categoryId;
    }

    public Long getParentCategoryId() {
        return ParentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        ParentCategoryId = parentCategoryId;
    }

    public String getGoodsNo() {
        return GoodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        GoodsNo = goodsNo;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public Boolean getSaleable() {
        return IsSaleable;
    }

    public void setSaleable(Boolean saleable) {
        IsSaleable = saleable;
    }

    public Boolean getActive() {
        return IsActive;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }

    public String getGoodsDescription() {
        return GoodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        GoodsDescription = goodsDescription;
    }

    public String getImageUris() {
        return ImageUris;
    }

    public void setImageUris(String imageUris) {
        ImageUris = imageUris;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
