package com.example.summer_comming.core;

import org.springframework.stereotype.Component;

@Component
public class House {
    private String name;
    private int numberOfRooms;

    public House() {
        this.name = "first home";
        System.out.println("Home create Home");
    }

    public String getName() {
        return name;
    }
}
