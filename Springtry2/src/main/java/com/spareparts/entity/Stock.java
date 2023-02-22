package com.spareparts.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(name = "stock_name", nullable = false)
	public String stock_name;
	
	@Column(name = "stock_type")
	public String stock_type;
	
	@Column(name = "price")
	public float price;
	
	@Column(name = "quantity")
	public int quantity;
	
	@Column(name = "manufacturer_details")
	public String manufacturer_details;
	
	public Stock() {
		
	}
	
	
	public Stock(String stock_name, String stock_type, float price, int quantity, String manufacturer_details) {
		super();
		this.stock_name = stock_name;
		this.stock_type = stock_type;
		this.price = price;
		this.quantity = quantity;
		this.manufacturer_details = manufacturer_details;
	}
	public Long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (long) id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public String getStock_type() {
		return stock_type;
	}
	public void setStock_type(String stock_type) {
		this.stock_type = stock_type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getManufacturer_details() {
		return manufacturer_details;
	}
	public void setManufacturer_details(String manufacturer_details) {
		this.manufacturer_details = manufacturer_details;
	}
	
	 
	
}
