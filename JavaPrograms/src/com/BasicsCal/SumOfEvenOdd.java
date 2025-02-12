package com.BasicsCal;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number to find its every single digit is \"Even\" or \"Odd\" : ");
		int num = scanner.nextInt();
		
		while (num!=0){
			int dig = num%10;
			if (dig%2==0){
				System.out.println(dig+" is Even");
			}else {
				System.out.println(dig+" is odd");
			}
			num = num/10;
			
		}
		scanner.close();

	}

}
