package com.example.summer_comming.accommodation;

import java.util.List;

public class Accommodation {
    private String name;
    private String location;
    private String phoneNumber;
    private int minPrice;
    private int id;
    private List<Integer> RoomList;

    public Accommodation(String name, String location, String phoneNumber, int minPrice, int id) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.minPrice = minPrice;
    }

    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getMinPrice() {
        return minPrice;
    }
    public void setId(int id) {
        this.id = id;
    }
}
