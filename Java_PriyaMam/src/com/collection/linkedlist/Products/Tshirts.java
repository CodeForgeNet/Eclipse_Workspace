package com.collection.linkedlist.Products;

public class Tshirts extends Clothing{
	

	public Tshirts(String name, int id, double price, int quantity, String brand, String type, String color) {
		super(name, id, price, quantity, brand, type,color);
	}
	
	
	
	@Override
	public String toString() {
		return "[ "+"Name:"+getName()+" , Id:"+getId()+" , Price:"+getPrice()+" , Quantity:"+getQuantity()+" , Brand:"+getBrand()+" , Type:"+getType()+" , Color:"+getColor() +" ]" ;
	}


	
	
}
