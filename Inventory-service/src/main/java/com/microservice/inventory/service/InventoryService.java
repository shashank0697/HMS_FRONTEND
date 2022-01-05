package com.microservice.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microservice.inventory.entity.Inventory;
@Service
public interface InventoryService {
	
	void addInventory(Inventory inv);
	
	List<Inventory> getAllInventory();
	
	Optional<Inventory> getInventoryById(int invId);
	
	void updateInventory(int invId,Inventory inv);
	
	void deleteInvenotry(int invId);
	
}
