package com.BasicsCal;

import java.util.Scanner;

public class Input3Type {

	public static void main(String[] args) {
//		int a = 42;
//		double b = 3.415;
//		String c = "Welcome to HackerRank's Java Tutorial"
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a integer :- ");
		int a= sc.nextInt();
		
		System.out.print("Enter a decimal digit :- ");
		double b = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Enter a String :- ");
		String c = sc.nextLine();
		
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
		sc.close();
	}

}
