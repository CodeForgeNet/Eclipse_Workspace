package com.method;

import java.util.Scanner;


public class SumNumEqual {
	
	public static int sum(int num) {
		int sum =0;
		int fact =1;
		int i=1;
		for(;num>0;num/=10) {
			for(; i<=num; i++) {		
			}
			fact *=i;
		}
		sum+=fact;
		return sum;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int num = scanner.nextInt();
		
		System.out.print(sum(num));
		
	}

}
