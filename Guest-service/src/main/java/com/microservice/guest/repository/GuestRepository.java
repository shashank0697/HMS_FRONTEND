package com.microservice.guest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.guest.entity.Guest;

@Repository
public interface GuestRepository extends MongoRepository<Guest, Long>{

}
