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

    public String setProduct(String name) {
        return tripRepository.saveProduct(name);
    }
    public String setProduct(Trip trip) {
        return tripRepository.saveProduct(trip);
    }

    public String getProductById(String id) {
        return tripRepository.selectProductById(Integer.parseInt(id));

    }
}
