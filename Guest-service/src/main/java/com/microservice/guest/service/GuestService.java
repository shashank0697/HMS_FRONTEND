package com.microservice.guest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microservice.guest.entity.Guest;

@Service
public interface GuestService {

	void addGuest(Guest guest);

	List<Guest> getAllGuest();

	Optional<Guest> getGuestById(long guestId);

	void updateGuest(long guestId, Guest guest);

	void deleteGuest(long guestId);

}
