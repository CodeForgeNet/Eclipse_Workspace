package com.BasicsCal;

import java.util.Scanner;

public class PosNegZe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scanner.nextInt();
		if (num>0) 
		{
			System.out.println(num+" is Positive");
		} 
		else if(num<0) 
		{
			System.out.println(num+ " is negative");
		}
		else {
			System.out.println(num+" is zero");
		}
		scanner.close();

	}

}
