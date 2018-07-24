package com.beyondh.model.order;

import com.google.gson.Gson;

import java.io.Serializable;

public class Liaison implements Serializable {
    private String Name;

    private String Mobile;

    public Liaison(String name, String mobile) {
        Name = name;
        Mobile = mobile;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
