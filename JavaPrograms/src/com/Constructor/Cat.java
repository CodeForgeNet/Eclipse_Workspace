package com.Constructor;

public class Cat {
	String name;
	int age;
	public Cat() {
		this.name = "unknown";
		this.age = 0;
	}
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
//		Cat c = new Cat();
//		System.out.println("Cat name : "+c.name);
//		System.out.println("Cat age : "+c.age);
		
		
		
		Cat c1 = new Cat("xyz",5);
		Cat c2 = new Cat("abc",6);
		
		System.out.println("Cat name : "+c1.name+", "+"Cat age : "+c1.age);
		System.out.println("Cat name : "+c2.name+", "+"Cat age : "+c2.age);

	}

}
