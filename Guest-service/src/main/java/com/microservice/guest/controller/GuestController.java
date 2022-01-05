package com.microservice.guest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.guest.entity.Guest;
import com.microservice.guest.service.GuestService;

import io.swagger.annotations.ApiOperation;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/guest")
public class GuestController {
	
	@Autowired
	private GuestService guestService;
	
	@PostMapping("/add")
	@ApiOperation(value = "Adding Guest Details")
	public String addGuest(@RequestBody Guest guest) {
		this.guestService.addGuest(guest);
		return "Guest added with guestId "+guest.getGuestId();
	}
	
	@GetMapping("/get")
	@ApiOperation(value = "Views all Guest Details")
	public List<Guest> getAllGuest(){
		return this.guestService.getAllGuest();
	}
	
	@GetMapping("/get/{gId}")
	@ApiOperation(value = "Views Specific Guest Details using ID")
	public Optional<Guest> getGuestById(@PathVariable long gId){
		return this.guestService.getGuestById(gId);
	}
	
	@PutMapping("/update/{gId}")
	@ApiOperation(value = "Upadtes the Guest Details of given ID")
	public String updateGuest(@RequestBody Guest guest,@PathVariable long gId) {
		this.guestService.updateGuest(gId, guest);
		return "Guest updated with guestId "+gId;
	}
	
	@DeleteMapping("/delete/{gId}")
	@ApiOperation(value = "Deletes the Guest Details of given ID")
	public String deleteGuest(@PathVariable long gId) {
		this.guestService.deleteGuest(gId);
		return "Guest deleted with guestId"+gId;
	}
}
