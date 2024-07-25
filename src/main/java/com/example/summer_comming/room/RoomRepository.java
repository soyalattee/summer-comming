package com.example.summer_comming.room;

import com.example.summer_comming.accommodation.Accommodation;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

@Component
public class RoomRepository {
    private Map<Integer, Room> roomTable = new HashMap<>();
    private Integer idx;

    public RoomRepository() {
        idx = 0;
    }
//    unchecked Exception.: 런타임시점에 예외가 발생하는 경우
    public Room selectRoomById(int id) {
        Room foundRoom = roomTable.get(id);
        if(foundRoom == null) {
//            RoomNotFoundException 이라는 예외처리 객체를 만들어줄 수 있다.
            throw new NoSuchElementException("방이 없습니다.");
        }
            return foundRoom;
    }

    public List<Room> saveRooms(List<Room> rooms) {
        for (Room room : rooms) {
            roomTable.put(idx++, room);
        }
//        TODO: 이거 저장한 객체?
        return rooms;
    }

    public Room saveRoom(Room room) {
        roomTable.put(idx++, room);
        return roomTable.get(idx-1);
    }
}
