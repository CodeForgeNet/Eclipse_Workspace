package com.loopingStatement;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:-");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Even");
			if (num%10==7) {
				System.out.println("Last digit is 7");
			}
		}else {
			System.out.println("Odd");
		}
		
		sc.close();
	}

}
