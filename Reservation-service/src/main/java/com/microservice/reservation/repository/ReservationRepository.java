package com.microservice.reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.reservation.entity.Reservation;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, Long>{

}
