package com.BasicsCal;

import java.util.Scanner;

public class SumOfDig_inNum {

	public static void main(String[] args) {
//		Q. WAJP sum of digits in number.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int dig = num %10;
			sum +=dig;
			num /=10;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
