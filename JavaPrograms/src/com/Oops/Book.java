package com.Oops;

public class Book {
	
	private String title;
	private String author;
	private int numPages;
	
	public Book(String title, String author, int numPages) {
		this.title=title;
		this.author=author;
		this.numPages=numPages;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getNumPages() {
		return numPages;
	}
	
	
	public void setTitle(String title) {
		this.title=title;
	}
	

}
