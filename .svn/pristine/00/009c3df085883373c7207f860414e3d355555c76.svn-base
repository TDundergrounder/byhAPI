package com.beyondh.model.hotel;

import com.google.gson.Gson;

public class OwnerConfigQueryModel {
    private String Category;
    private String Key;

    public OwnerConfigQueryModel(String category, String key) {
        Category = category;
        Key = key;
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

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
