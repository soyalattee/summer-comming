package com.example.summer_comming.accommodation;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AccommodationRepository {
    private Map<Integer, Accommodation> accommodationTable = new HashMap<>();
    private Integer idx;

    AccommodationRepository() {
        idx = 0;
    }

    public String getProduct(){
        return accommodationTable.values().toString();
    }

    public Accommodation saveProduct(Accommodation accommodation){
        accommodationTable.put(idx++, accommodation);
        return accommodationTable.get(idx-1);
    }

    public String saveProduct(Accommodation[] accommodations){
        for(Accommodation accommodation : accommodations){
            accommodationTable.put(idx++, accommodation);
        }

        return accommodationTable.get(idx-1).getName();
    }

    public Accommodation selectProductById(Long id) {

        Accommodation accommodation = accommodationTable.get(id);

        return accommodationTable.get(id);
    }
//    private void init(){
//        Integer idx = 0;
//        tripTable.put(idx++, "파라다이스");
//        tripTable.put(idx++, "아난티코브");
//        tripTable.put(idx++, "한화리조트");
//    }
}
