package com.microservice.room.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservice.room.entity.Room;
@Repository
public interface RoomRepository extends MongoRepository<Room,Long>{
	
	public List<Room> findByRoomAvailable(boolean roomAvailable);
}
