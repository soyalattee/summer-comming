package com.example.summer_comming.trip;

import com.example.summer_comming.core.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TripController {

    private final TripService tripService;


    @Autowired   //매개변수 적어놨으니까 객체 주입해줭(DI)
    public TripController(TripService tripService) {
        this.tripService = tripService;
    }
    //사용자가 요청을 보내면 아레 메소드를 호출해줄게
    //어떤 요청? 소괄호안에 적어주어요
    @RequestMapping(value="/products" ,method = RequestMethod.GET)
    public String getProducts() {
        return tripService.getProduct();
    }

    // 쿼리로 숙소명 받아서 저장하기
    //addproduct로 해주자. POST로 만들때는 products 로
    @RequestMapping(value = "/addproduct", method = RequestMethod.GET)
    public String setProduct(@RequestParam("name") String name) {
        String productName = tripService.setProduct(name);
        return productName + "상품 생성 성공!";
    }

    @RequestMapping(value="/products/{id}",method = RequestMethod.GET)
    public String getProductById(@PathVariable("id") String id) {
        return tripService.getProductById(id);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public String setProductByPost(@RequestBody Accomodation accomodation) {
        String productName = tripService.setProduct(accomodation);
        return productName + "상품 생성 성공!";
    }
}
