package com.example.summer_comming.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TripService {

    private final TripRepository tripRepository;

    @Autowired
    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public String getProduct(){
        return tripRepository.getProduct();
    }

    public String setProduct(Accomodation accomodation) {
        return tripRepository.saveProduct(accomodation).getName();
    }

    public String getProductById(String id) {
        return tripRepository.selectProductById(Integer.parseInt(id)).getName();

    }
}
