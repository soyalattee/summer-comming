package com.example.summer_comming.room;

import com.example.summer_comming.accommodation.Accommodation;
import com.example.summer_comming.accommodation.AccommodationRepository;
import com.example.summer_comming.accommodation.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoomService {
    RoomRepository roomRepository;
    AccommodationRepository accommodationRepository;
    @Autowired
    public RoomService(RoomRepository roomRepository, AccommodationRepository accommodationRepository) {
        this.roomRepository = roomRepository;
        this.accommodationRepository =  accommodationRepository;
    }
    public Room getRoom(int id) {
        return roomRepository.selectRoomById(id);
    }

    public List<Room> addRooms(List<Room> rooms) {
        return roomRepository.saveRooms(rooms);
    }

    public Room addRoomToAccommodation(Long accommodationId, Room room) {
        Accommodation accommodation = accommodationRepository.selectProductById(accommodationId);
        room.setAccommodationId(accommodationId);
        return roomRepository.saveRoom(room);
    }

    public Room addRoom(Room room) {
        //숙소id가 적절한지 체크한다.
        return roomRepository.saveRoom(room);
    }
}
