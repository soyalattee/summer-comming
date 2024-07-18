package com.example.summer_comming.trip;

import com.example.summer_comming.core.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {

    private final TripService tripService;


    @Autowired   //매개변수 적어놨으니까 객체 주입해줭(DI)
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    //사용자가 요청을 보내면 아레 메소드를 호출해줄게
    //어떤 요청? 소괄호안에 적어주어요
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test() {
        return "songa";
    }

    @RequestMapping(value="/product" ,method = RequestMethod.GET)
    public String getProduct() {
        return tripService.getProduct();
    }
    // 받는 파라미터명이 같으면 ("id") 생략 가능하다
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public House product(@PathVariable("id") String id) {
        return new House() ;
    }
}
