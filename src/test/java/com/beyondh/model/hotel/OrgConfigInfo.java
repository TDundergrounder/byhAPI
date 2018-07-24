package com.beyondh.model.hotel;

public class OrgConfigInfo {
    private long OrgId;
    private String Category;
    private String Key;
    private String Value;
    private String Description;

    public OrgConfigInfo(String category, String key, String value, String description) {
        Category = category;
        Key = key;
        Value = value;
        Description = description;
    }

    public OrgConfigInfo(long orgId, String category, String key, String value, String description) {
        OrgId = orgId;
        Category = category;
        Key = key;
        Value = value;
        Description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
