package com.microservice.inventory.entity;

import javax.validation.constraints.Positive;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "InventoryList")
public class Inventory {
	@Id
	private int inventoryId;
	private String inventoryType;
	private String inventoryName;
	@Positive
	private int inventoryStock;
	
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getInventoryType() {
		return inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	public String getInventoryName() {
		return inventoryName;
	}
	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}
	public int getInventoryStock() {
		return inventoryStock;
	}
	public void setInventoryStock(int inventoryStock) {
		this.inventoryStock = inventoryStock;
	}
	
	public Inventory(int inventoryId, String inventoryType, String inventoryName,@Positive int inventoryStock) {
		super();
		this.inventoryId = inventoryId;
		this.inventoryType = inventoryType;
		this.inventoryName = inventoryName;
		this.inventoryStock = inventoryStock;
	}
	public Inventory() {
		
	}	
	
}
