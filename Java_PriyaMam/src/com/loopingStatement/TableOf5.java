package com.loopingStatement;

public class TableOf5 {

	public static void main(String[] args) {
		int a=1;
		int prod =5;
		
		while(a<=10) {
			int product = prod*a;
			System.out.println(prod+" x "+a+" = "+product);
			a++;
		}

	}

}
