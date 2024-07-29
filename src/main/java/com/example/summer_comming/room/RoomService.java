package com.example.summer_comming.room;

import com.example.summer_comming.accommodation.Accommodation;
import com.example.summer_comming.accommodation.AccommodationRepository;
import com.example.summer_comming.accommodation.AccommodationService;
import com.example.summer_comming.room.dto.RoomRegisterReq;
import com.example.summer_comming.room.dto.RoomRegisterRes;
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

    @Autowired
    public RoomService(RoomRepository roomRepository, AccommodationRepository accommodationRepository) {
//       JPA는 컨테이너에서 타입으로 객체를 찾는다. 스프링은 스프링빈을 타입으로 찾는다.
        this.roomRepository = roomRepository;
        this.accommodationRepository =  accommodationRepository;
    }
    public Room getRoom(int id) throws SQLException {
        return roomRepository.getReferenceById((long) id);
    }

    public RoomRegisterRes addRoom(RoomRegisterReq roomReq) {
        Room room = roomRepository.save(roomReq.toEntity());
//        roomRepository.addRoom();
        return new RoomRegisterRes(room.getType(),room.getPrice());
    }
}
