package com.Constructor;

public class Book {
	String title;
	String author;
	float price;
	
	public Book() {
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public Book(String title, String author, float price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println("Author: "+b1.author+"\t"+"Title: "+b1.title+"\t"+"Price: "+b1.price);
		
		Book b2 = new Book("xyz","karan");
		System.out.println("Author: "+b2.author+"\t"+"Title: "+b2.title);
		
		Book b3 = new Book("abc","arjun",123.25f);
		System.out.println("Author: "+b3.author+"\t"+"Title: "+b3.title+"\t"+"Price: "+b3.price);
	}
}
