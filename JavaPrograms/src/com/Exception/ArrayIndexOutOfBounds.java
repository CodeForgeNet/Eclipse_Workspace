package com.Exception;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			System.out.println(a[5]);			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is small or big");
		}
	}
}
