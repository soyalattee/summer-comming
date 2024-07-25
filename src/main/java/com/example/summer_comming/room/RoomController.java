package com.example.summer_comming.room;

import com.example.summer_comming.exception.RoomNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        System.out.println("RoomController");
        this.roomService = roomService;
    }

    @RequestMapping(value ="/rooms/{id}",method = RequestMethod.GET)
    public Room getRoom(@PathVariable int id){
        return roomService.getRoom(id);
    }

    @RequestMapping(value ="/rooms", method = RequestMethod.POST)
    public Room addRoom(@RequestBody Room room){
        Room roomRes = roomService.addRoom(room);
//        acommodationService -> accoomodationRepository

        System.out.println(roomRes);
        return roomRes;
//        return new ResponseEntity<>(roomRes, HttpStatus.CREATED);
    }
}
