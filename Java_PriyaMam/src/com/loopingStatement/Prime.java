package com.loopingStatement;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		int num = sc.nextInt();
		
		int count = 0;
		
//		Best approach
		
		if(num<=1) {
			System.out.println(num+" is not a prime number");
		}else if (num!=2 && num%2==0) {
			System.out.println(num+ " is not a prime number");
		}else {
			
		
		
		
//		for(int i=1; i<=num; i++) {
//			
//			if (num % i ==0) {
//			count++;
//			
//			}
//		}
//		if(count==2) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("Not prime");
//		}
		
		
		// Another method
			
		for(int i=2; i<=num/2; i++) {
//			
			if (num % i ==0) {
			count++;
			break;
			
			}
		}
		if(count==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
		
		
		
		}
		
		
		
		
		sc.close();
	}

}
