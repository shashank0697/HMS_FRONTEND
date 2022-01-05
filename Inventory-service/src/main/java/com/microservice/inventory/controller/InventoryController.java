package com.microservice.inventory.controller;

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

import com.microservice.inventory.entity.Inventory;
import com.microservice.inventory.service.InventoryService;

import io.swagger.annotations.ApiOperation;
@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/inventory")
public class InventoryController {
	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/add")
	@ApiOperation(value = "Adding Inventory")
	public String addInventory(@RequestBody Inventory inventory) {
		try {
			this.inventoryService.addInventory(inventory);
			return "Added inventory with id "+ inventory.getInventoryId();
		} catch (Exception e) {
			System.out.println(e);
			return "Use Valid Input";
		}
	}
	@GetMapping("/get")
	@ApiOperation(value = "Views all Inventory")
	public List<Inventory> getAllInventory(){
		return this.inventoryService.getAllInventory();
	}
	@GetMapping("/get/{invId}")
	@ApiOperation(value = "Views Specific Inventory using ID")
	public Optional<Inventory> getInventoryById(@PathVariable int invId) {
		return this.inventoryService.getInventoryById(invId);
	}
	@PutMapping("/update/{invId}")
	@ApiOperation(value = "Upadtes the Inventory of given ID")
	public String updateInventory(@RequestBody Inventory inventory,@PathVariable int invId) {
		this.inventoryService.updateInventory(invId, inventory);
		return "Updated inventory with id "+invId;
	}
	@DeleteMapping("/delete/{invId}")
	@ApiOperation(value = "Deletes the Inventory of given ID")
	public String deleteInventory(@PathVariable int invId) {
		this.inventoryService.deleteInvenotry(invId);
		return "Deleted inventory with id "+invId;
	}
}
