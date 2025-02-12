package com.Abstr_Inter;

public class Interf_Methods implements Vehicle{
	public void speed() {
		System.out.println("Interface methods");
	}
}
interface Vehicle{
	void speed();
}