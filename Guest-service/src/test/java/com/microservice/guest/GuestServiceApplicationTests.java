package com.microservice.guest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.microservice.guest.entity.Guest;
import com.microservice.guest.repository.GuestRepository;
import com.microservice.guest.service.GuestService;

@RunWith(SpringRunner.class)
@SpringBootTest
class GuestServiceApplicationTests {
	
	@Autowired
	private GuestService guestService;
	
	@MockBean
	private GuestRepository guestRepository;
	
	@Test
	public void addGuestTest() {
		Guest guest=new Guest(8083100001l,"Rohan",1122334455,"rohan@gmail.com","Male","Dombivli");
		guestService.addGuest(guest);
		verify(guestRepository,times(1)).save(guest);
	}
	
	@Test
	public void getAllGuestTest() {
		when(guestRepository.findAll()).thenReturn(Stream
				.of(new Guest(8083100001l,"Rohan",1122334455,"rohan@gmail.com","Male","Dombivli"),
					new Guest(8083100002l,"Vegeta",667788990,"vegeta@gmail.com","Male","Namek"))
				.collect(Collectors.toList()));
		assertEquals(2,guestService.getAllGuest().size());
	}
	@Test
	public void updateGuestTest() {
		long gId=8083100001l;
		Guest guest=new Guest(8083100001l,"Rohan",1122334455,"rohan@gmail.com","Male","Dombivli");
		guestService.updateGuest(gId, guest);
		verify(guestRepository,times(1)).save(guest);
	}
	@Test
	public void deleteGuestTest() {
		long gId=8083100001l;
		guestService.deleteGuest(gId);
		verify(guestRepository,times(1)).deleteById(gId);
	}
	
}
