package com.Exception;

public class ClassCast_Exc {
	public static void main(String[] args) {
		Object obj = new Integer(0);
		try {
			System.out.println((String)obj);
		}catch(ClassCastException e) {
			System.out.println("Class cast exception occurred");
		}
	}
}
