package com.example.summer_comming.trip;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Component
public class TripRepository {
    private Map<Integer, Accomodation> tripTable = new HashMap<>();
    private Integer idx;

    TripRepository() {
        idx = 0;
    }

    public String getProduct(){
        return tripTable.values().toString();
    }

    public Accomodation saveProduct(Accomodation accomodation){
        tripTable.put(idx++, accomodation);
        return tripTable.get(idx-1);
    }

    public Accomodation selectProductById(int id) {
        return tripTable.get(id);
    }
//    private void init(){
//        Integer idx = 0;
//        tripTable.put(idx++, "파라다이스");
//        tripTable.put(idx++, "아난티코브");
//        tripTable.put(idx++, "한화리조트");
//    }
}
