package com.BasicsCal;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		int numb = sc.nextInt();
		
		int num = numb;
		int sum = 0;
		int count = 0;
		
//		for counting total digit.
		while(num!=0) {
			num /=10;
			count++;
		}
		
//		for sum and square.
		while(num!=0) {
			int dig = num % 10;
			sum += Math.pow(dig, count);
			num/=10;
		}
		
		if (sum == numb) {
			System.out.println(numb + " is an Armstrong number");
		}else {
			System.out.println(numb + " is not an Armstrong number");			
		}
		sc.close();
	}

}
