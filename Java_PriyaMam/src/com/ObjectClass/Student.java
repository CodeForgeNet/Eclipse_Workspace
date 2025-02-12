package com.ObjectClass;

public class Student { // extends Object
	String name;
	int id;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		
		return "{" + name +"," + id + "}";
	}
}
