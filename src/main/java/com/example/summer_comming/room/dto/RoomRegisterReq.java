package com.example.summer_comming.room.dto;

import com.example.summer_comming.room.Room;

public class RoomRegisterReq {
    private String type;
    private int price;

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
    //DTO to Entity 로직을 서비스가 아닌 DTO에 담기.
    public Room toEntity(){
        return new Room(type, price);
    }
}
