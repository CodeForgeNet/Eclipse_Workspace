package com.method;

import java.util.Scanner;

public class PerfectNum {
	
	public static void perfect(int num) {
		int sum =0;
			for(int i=1; i<=num/2; i++) {		
				if (num % i ==0) {
				sum+=num;
				
				}
			}
			if(sum==num) {
				System.out.println("Its Perfect number");
			}else {
				System.out.println("Its not a perfect num");
			}
		}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int num = scanner.nextInt();
		
		perfect(num);
	}

}
