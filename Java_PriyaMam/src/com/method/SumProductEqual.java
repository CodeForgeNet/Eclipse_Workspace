package com.method;

import java.util.Scanner;

public class SumProductEqual {
	
	public static boolean eachDig(int num) {
		int sum = 0;
		int prod = 1;
		for(;num>0;num/=10) {
			sum+=num;
			prod*=num;
		}
		if (sum==num) {
			return true;
		}
			return false;
		
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		eachDig(num);
	}

}
