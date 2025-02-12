package com.Exception;

public class MulitpleHandling_inCatch {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
			int n = Integer.parseInt("XYZ");
		}catch(NullPointerException | NumberFormatException e) {
			System.out.println("Caught Exception : "+ e);
			System.out.println("-------");
			System.out.println("Caught Exception : "+ e.getMessage());
		}
	}
}
