package com.elliotknuth;

public class Item {
	private static int numOfItems = 0;
	private int id;
	private String name;
	private double price;
	
	private Item() {}
	
	public Item(String name, double price) {
		id = numOfItems++;
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}
}
