package com.microservice.room.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Rooms")
public class Room {
	@Id
	@NotNull(message="Room ID cannnot be null")
	@Size(min=8,message="Room ID should be minimum 8 digits")
	private long roomId;
	@NotNull(message="Room type be null")
	@Size(min=11,message="Room type be minimum 11 digits")
	private String roomType;
	@NotNull(message="Room rent cannnot be null")
	@Size(min=4,message="Room rent should be minimum 4 digits")
	private double roomRent;
	@NotNull(message="Room avaialble cannnot be null")
	@Size(min=5,message="Room available should be minimum 5 digits and should be either 'True' or 'False'")
	private boolean roomAvailable;
	
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomRent() {
		return roomRent;
	}
	public void setRoomRent(double roomRent) {
		this.roomRent = roomRent;
	}
	public boolean isRoomAvailable() {
		return roomAvailable;
	}
	public void setRoomAvailable(boolean roomAvailable) {
		this.roomAvailable = roomAvailable;
	}

	public Room(@NotNull(message="Room ID cannnot be null")@Size(min=8,message="Room ID should be minimum 8 digits")long roomId,
			@NotNull(message="Room type be null")@Size(min=11,message="Room type be minimum 11 digits")String roomType,
			@NotNull(message="Room rent cannnot be null")@Size(min=4,message="Room rent should be minimum 4 digits")double roomRent,
			@NotNull(message="Room avaialble cannnot be null")@Size(min=5,message="Room available should be minimum 5 digits and should be either 'True' or 'False'")boolean roomAvailable) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomRent = roomRent;
		this.roomAvailable = roomAvailable;
	}
	public Room() {
	
	}
	
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomType=" + roomType + ", roomRent=" + roomRent
				+ ", roomAvailable=" + roomAvailable + "]";
	}
	
}
