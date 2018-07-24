package com.beyondh.model.hotel;

import com.google.gson.Gson;

import java.io.Serializable;

public class hotelConfiguredRoomTypeInfo implements Serializable {
    private String Description ;
    private String ImageUri;

    public hotelConfiguredRoomTypeInfo(String description, String imageUri) {
        Description = description;
        ImageUri = imageUri;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImageUri() {
        return ImageUri;
    }

    public void setImageUri(String imageUri) {
        ImageUri = imageUri;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
