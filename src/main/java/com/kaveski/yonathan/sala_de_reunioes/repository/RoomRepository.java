package com.kaveski.yonathan.sala_de_reunioes.repository;

import com.kaveski.yonathan.sala_de_reunioes.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
}
