package com.microservice.room.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microservice.room.entity.Room;
//import com.microservice.room.entity.RoomList;


@Service
public interface RoomService {
	
	void addRoom(Room room);
	
	List<Room> getAllRoom();
	
	Optional<Room> getRoomById(long roomId);
	
	void updateRoom(long roomId,Room room);
	
	void deleteRoom(long roomId);
	
	public List<Room> getAvailableRoom(boolean roomAvailable);
}
