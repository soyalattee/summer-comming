package com.example.summer_comming.room.dto;

public class RoomRegisterRes {
    private String type;
    private int price;

    public RoomRegisterRes(String type, int price) {
        this.type = type;
        this.price = price;

    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
