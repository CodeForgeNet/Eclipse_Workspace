package com.BasicsCal;

import java.util.Scanner;

public class DivBy7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		if (num%7==0) {
			System.out.println(num+" is divisible by 7 ");
		} else {
			System.out.println(num+"is not divisible by 7");
		}
		sc.close();
	}

}
