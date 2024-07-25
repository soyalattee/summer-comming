package com.example.summer_comming.room;

public class Room {
    private int roomNumber;
    private String type;
    private int price;
    private int headCount;
    private Long accommodationId;

    public Room(int roomNumber, String type, int price, int headCount, Long accommodationId) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.headCount = headCount;
        this.accommodationId = accommodationId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public Long getAccommodationId() {
        return accommodationId;
    }
    public void setAccommodationId(Long accommodationId) {
        this.accommodationId = accommodationId;
    }

    public int getHeadCount() {
        return headCount;
    }

    public int getPrice() {
        return price;
    }
}
