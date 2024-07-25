package com.example.summer_comming.accommodation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AccommodationController {
    private final AccommodationService accommodationService;

    @Autowired
    public AccommodationController(AccommodationService tripService) {
        this.accommodationService = tripService;
    }

    @RequestMapping(value="/products" ,method = RequestMethod.GET)
    public String getAccommodationName() {
        return accommodationService.getAccommodation();
    }

    @RequestMapping(value="/products/{id}",method = RequestMethod.GET)
    public String getAccommodationName(@PathVariable("id") String id) throws Exception {
        return accommodationService.getProductById(id);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity addAccommodation(@RequestBody Accommodation accomodation) {
        Accommodation savedAccommodation = accommodationService.addAccommodation(accomodation);

        if( savedAccommodation != null){
            return new ResponseEntity<>(savedAccommodation, HttpStatus.CREATED);
        }else{
            return new ResponseEntity<>("실패..", HttpStatus.BAD_REQUEST);
        }
    }

//    해당 예외가 발생하면 여기서 처리할게!
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException e) {
        System.out.println("에러 커밍"+e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
