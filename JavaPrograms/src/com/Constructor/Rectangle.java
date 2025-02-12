package com.Constructor;

// Copy Constructor.

public class Rectangle {
	int l;
	int w;
	
	public Rectangle(int l, int w) {
		this.l = l;
		this.w = w;
	}
	
	public Rectangle(Rectangle rectangle) {
		this.l = rectangle.l;
		this.w = rectangle.w;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(12,24);
		System.out.println(r1.l+", "+r1.w);
		
		Rectangle r2 = new Rectangle(r1);
		System.out.println(r2.l+", "+r2.w);
	}
	
}
