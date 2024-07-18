package com.example.summer_comming.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private House house;
    private Person instance;

    public Person() {
        this.name = "잇츠미";
        System.out.println(this.name+" create");
    }

    //다 실행 시킴
    @Autowired
    public void setHouse(House house) {
        this.house = house;
        System.out.println(this.name+" buy House: " + this.house.getName());
    }

    public String getName() {
        return name;
    }

    //불변하지 않을때
    @Autowired
    public void setName(House house) {
        this.name = "새로운 이름";
        System.out.println(this.name+" buy House: " + this.house.getName());
    }

}
