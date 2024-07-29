package com.example.summer_comming.room;

import com.example.summer_comming.exception.RoomNotFoundException;
import com.example.summer_comming.room.dto.RoomRegisterReq;
import com.example.summer_comming.room.dto.RoomRegisterRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        System.out.println("RoomController");
        this.roomService = roomService;
    }

    @RequestMapping(value ="/rooms/{id}",method = RequestMethod.GET)
    public ResponseEntity<Room> getRoom(@PathVariable int id) throws SQLException {
        return ResponseEntity.ok(roomService.getRoom(id));
    }

    @RequestMapping(value ="/rooms")
    public ResponseEntity<RoomRegisterRes> addRoom(@RequestBody RoomRegisterReq room){
        RoomRegisterRes res = roomService.addRoom(room);
         return ResponseEntity.ok(res);
    }
}
