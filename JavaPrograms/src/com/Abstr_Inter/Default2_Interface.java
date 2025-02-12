package com.Abstr_Inter;

public class Default2_Interface implements Intf1, Intf2 {
	public void met() {
		Intf1.super.met();
	}
	public static void main(String[] args) {
		Default2_Interface obj = new Default2_Interface();
		obj.met();
	}
}

interface Intf1 {
	default void met() {
		System.out.println("Interface1 methods");
	}
}

interface Intf2 {
	default void met() {
		System.out.println("Interface2 methods");
	}
}