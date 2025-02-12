package com.loopingStatement;

import java.util.Scanner;

public class OddSumDigInNum {

	public static void main(String[] args) {
//		Q. WAJP to find out sum of odd digits present in a number.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number:- ");
		int num = sc.nextInt();
		
		
		
		if (num<=0) {
			System.out.println("Invalid: Please provide positive number");
		}else {
			int sum = 0;
			for(;num>0; num/=10) {
				int dig = num%10;
				if(dig%2!=0) {
					sum +=dig;
				}
				
			}
			System.out.println(sum);
		}
		
		
		sc.close();
	}

}
