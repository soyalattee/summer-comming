package com.example.summer_comming.trip;

public class Accomodation {
    String name;
    String location;
    String phoneNumber;
    int minimumPrice;

    public Accomodation(String name, String location, String phoneNumber, int minimumPrice) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.minimumPrice = minimumPrice;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getMinimumPrice() {
        return minimumPrice;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
