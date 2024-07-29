package com.example.summer_comming.room;

import com.example.summer_comming.accommodation.Accommodation;
import com.example.summer_comming.accommodation.AccommodationRepository;
import com.example.summer_comming.accommodation.AccommodationService;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Transactional
@Component
public class RoomService {
    RoomRepository roomRepository;
    AccommodationRepository accommodationRepository;
    EntityManager entityManager;

    @Autowired
    public RoomService(RoomRepository roomRepository, AccommodationRepository accommodationRepository, EntityManager entityManager) {
        this.roomRepository = roomRepository;
        this.accommodationRepository =  accommodationRepository;
        this.entityManager = entityManager;
    }
    public Room getRoom(int id) throws SQLException {
        return entityManager.find(Room.class, id);
    }

    public String addRoom(Room room) {

            return "success";
    }
}
