package com.Abstr_Inter;

public class Abst_Methods extends Animal{
	public void sound() {
		System.out.println("Abstract method");
	}
}

abstract class Animal{
	public abstract void sound();
}