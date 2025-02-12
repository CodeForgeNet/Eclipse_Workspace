package com.Exception;

public class NullPointer {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		}catch(ClassCastException e){
			System.out.println("Class Cast Exception hai");
		}
		catch(NullPointerException e) {
			System.out.println("Exception : Value is null ");
		}
	}
}
