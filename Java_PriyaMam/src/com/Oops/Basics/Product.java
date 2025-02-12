package com.Oops.Basics;

public class Product {
	String brandName;
	int pId;
	double pPrice;
	
//	Constructor chaining
	
	public Product() {

	}
	public Product(String brandName) {
		this();
		this.brandName = brandName;
	}
	public Product(String brandName, int pId) {
		this(brandName);
		this.pId = pId;
	}
	public Product(String brandName, int pId, double pPrice) {
		this(brandName, pId);
		this.pPrice = pPrice;
	}
	public static void main(String[] args) {
		Product obj = new Product("apple",101,65000);
	}

}
