package com.nestedClass;

//Write a Java program to create a class called House with a method calculateArea(). Inside this method, define a local class Room with a method getArea() that calculates and returns the area of the room (length * width). Instantiate the Room class and call the getArea() method from within calculateArea().

public class House {
	public void calculateArea() {
		int l = 12, w= 15;
		class Room{
			public int getArea() {
				return l*w;
			}
		}
		Room rm = new Room();
		System.out.println(rm.getArea());
	}
	
	public static void main(String[] args) {
		House hs = new House();
		hs.calculateArea();
	}
	
}
