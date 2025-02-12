package com.BasicsCal;

public class DigCount {

	public static void main(String[] args) {
		int n = 2345, count = 0;
		while(n>0) {
			
			++count;
			
			n = n/10;
		}
		System.out.println(count);

	}

}
