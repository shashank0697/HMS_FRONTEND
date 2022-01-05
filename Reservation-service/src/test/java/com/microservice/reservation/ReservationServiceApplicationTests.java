package com.microservice.reservation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.microservice.reservation.entity.Reservation;
import com.microservice.reservation.repository.ReservationRepository;
import com.microservice.reservation.service.ReservationService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ReservationServiceApplicationTests {
	
	@Autowired
	private ReservationService reservationService;
	
	@MockBean
	private ReservationRepository reservationRepository;
	
	@Test
	public void addReservationTest() {
		Reservation reservation=new Reservation(8084100001l,80821001l,8083100001l,"2021-05-10","2021-05-12",2,6000);
		when(reservationRepository.save(reservation)).thenReturn(reservation);
		String s1=reservationService.addReservation(reservation);
		String s2="Room Number 80821001 reserved for Guest 8083100001";
		//assertEquals(50,reservationService.addReservation(reservation).length());
		assertEquals(s1,s2);
	}
}
