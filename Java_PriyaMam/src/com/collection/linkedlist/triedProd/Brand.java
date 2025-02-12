package com.collection.linkedlist.triedProd;

import java.util.LinkedList;

public class Brand {
	String name;
	LinkedList<Tshirts> tshirts;
	
	public Brand(String name) {
		this.name=name;
		this.tshirts = new LinkedList<>();
	}
	
	public void addTshirts(Tshirts tshirts) {
		this.tshirts.add(tshirts);
	}
	
	public void printTshirtsType() {
		for(int i=0; i<this.tshirts.size(); i++) {
			Tshirts tshirt = this.tshirts.get(i);
			System.out.println(tshirt.getType()); 
		}
		
	}
	
	public void printTshirtsId() {
		for(int i=0; i<this.tshirts.size(); i++) {
			Tshirts tshirt = this.tshirts.get(i);
			System.out.println(tshirt.getId()); 
		}
	}
	
	public void printTshirtsPrice() {
		for(int i=0; i<this.tshirts.size(); i++) {
			Tshirts tshirt = this.tshirts.get(i);
			System.out.println(tshirt.getPrice()); 
		}
		
	}

	
}
