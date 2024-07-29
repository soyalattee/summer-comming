package com.example.summer_comming.room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 껍데기다. 오버라이드 되는애를 호출함
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
