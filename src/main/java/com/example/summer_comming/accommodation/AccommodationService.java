package com.example.summer_comming.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AccommodationService {

    private final AccommodationRepository accommodationRepository;

    @Autowired
    public AccommodationService(AccommodationRepository tripRepository) {
        this.accommodationRepository = tripRepository;
    }

    public String getAccommodation(){
        return accommodationRepository.getProduct();
    }

    public Accommodation addAccommodation(Accommodation accommodation) {
        return accommodationRepository.saveProduct(accommodation);
    }
    public String addAccommodation(Accommodation[] accommodations) {

        return accommodationRepository.saveProduct(accommodations);
    }

    public String getProductById(String id) throws Exception {
        //포장지
        Optional<Accommodation> accommodation2 = Optional.ofNullable(accommodationRepository.selectProductById(Long.valueOf(id)));
        Accommodation accommodation = accommodationRepository.selectProductById(Long.valueOf(id));
        if(accommodation != null){
            return accommodation.getName();
        }else{
            throw new Exception("cannot find accommodation");
        }


    }
}
