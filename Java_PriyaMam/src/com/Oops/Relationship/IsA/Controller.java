package com.Oops.Relationship.IsA;

// This is seperate class from other to understand parent and child relations.

public class Controller {

	public static void main(String[] args) {

		A obj1 = new A(); // i m1()

		B obj2 = new B(); // j m2() ==> i, m1()

		System.out.println(obj2.j);

		obj2.m2();

		System.out.println(obj2.i);
		obj2.m1();
		// System.out.println(obj2.k);
	}
}
class A {
	int i = 90;

	void m1() {
		System.out.println("A class m1 method");
	}

	private int k = 10;

}

//B is  sub class  and A super class
// B wants to inherit the data or properties of A class
class B extends A {
	int j = 2;

	void m2() {
		System.out.println("B class m2 method");
	}

}
