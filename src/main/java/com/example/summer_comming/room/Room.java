package com.example.summer_comming.room;

import jakarta.persistence.*;

@Entity
public class Room {
    private String type;
    private int price;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Room() {
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
