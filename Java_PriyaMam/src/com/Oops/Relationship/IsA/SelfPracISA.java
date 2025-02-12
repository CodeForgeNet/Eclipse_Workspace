package com.Oops.Relationship.IsA;

public class SelfPracISA {
	
	public static void main(String[] args) {
		
		p objP = new c();
		objP.m10();
		
		c objC = (c)objP;
		objC.m10();
		
		
	}

}


class p{
	int i=10;
	
	void m10() {
		System.out.println(i);
	}
	
}

class c extends p{
	int j= 20;
	
	void m10() {
		System.out.println(j);
	}
}

