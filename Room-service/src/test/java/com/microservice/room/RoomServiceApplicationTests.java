package com.microservice.room;

import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.microservice.room.entity.Room;
import com.microservice.room.repository.RoomRepository;
import com.microservice.room.service.RoomService;

@RunWith(SpringRunner.class)
@SpringBootTest
class RoomServiceApplicationTests {

	@Autowired
	private RoomService roomService;
	@MockBean
	private RoomRepository roomRepository;

	@Test
	public void addRoomTest() {
		Room room=new Room(80821001,"Single Room",1500,true);
		roomService.addRoom(room);
		verify(roomRepository,times(1)).save(room);
	}
	
	@Test
	public void getAllRoomTest() {
		when(roomRepository.findAll()).thenReturn(Stream
				.of(new Room(80821001,"Single Room",1500,true),new Room(80821002,"Double Room",3000,false))
				.collect(Collectors.toList()));
		assertEquals(2,roomService.getAllRoom().size());
	}
	
	@Test
	public void updateRoomTest() {
		long rNum =80821001;
		Room room =new Room(80821001,"Single Room",1500,true);
		roomService.updateRoom(rNum, room);
		verify(roomRepository, times(1)).save(room);
	}
	
	@Test
	public void deleteRoomTest() {
		long rNum =80821001;
		roomService.deleteRoom(rNum);
		verify(roomRepository, times(1)).deleteById(rNum);
	}
	
	@Test
	public void getAvailableRoomTest() {
		boolean available=true;
		when(roomRepository.findByRoomAvailable(available)).thenReturn(Stream
				.of(new Room(80821001,"Single Room",1500,true))
				.collect(Collectors.toList()));
		assertEquals(1,roomService.getAvailableRoom(available).size());
	}
}
