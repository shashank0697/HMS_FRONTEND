package com.microservice.inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.inventory.entity.Inventory;

@Repository
public interface InventoryRepository  extends MongoRepository<Inventory, Integer>{

}
