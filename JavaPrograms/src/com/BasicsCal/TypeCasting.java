package com.BasicsCal;

public class TypeCasting {

	public static void main(String[] args) {
		byte a = 5;
		short b;
		int c;
		long d;
		float e;
		double f;
		
		System.out.println("\n\t\t\t\t\t\tWidening ");
		
		b = a;
		System.out.println("\n\t\t\t\t\tThe value of b = a is : "+b);
		
		c = a;
		System.out.println("\n\t\t\t\t\tThe value of c = a is : "+c);
		
		d = a;
		System.out.println("\n\t\t\t\t\tThe value of d = a is : "+d);
		
		e = a;
		System.out.println("\n\t\t\t\t\tThe value of e = a is : "+e);
		
		f = a;
		System.out.println("\n\t\t\t\t\tThe value of f = a is : "+f);
		

		
		
		System.out.println("\n\n\n\n\t\t\t\t\t\tNarrowing ");
		
		a = (byte)b;
		System.out.println("\n\t\t\t\t\tThe value of a = (byte)b is : "+a);
		
		b = (short)c;
		System.out.println("\n\t\t\t\t\tThe value of b = (short)c is : "+b);
		
		c = (int)d;
		System.out.println("\n\t\t\t\t\tThe value of c = (int)d is : "+c);
		
		d = (long)e;
		System.out.println("\n\t\t\t\t\tThe value of d = (long)e is : "+d);
		
		e = (float)d;
		System.out.println("\n\t\t\t\t\tThe value of e = (float)d is : "+e);
		
		f = (double)a;
		System.out.println("\n\t\t\t\t\tThe value of f = (double)a is : "+f);
		
		
		
		
		
	}

}
