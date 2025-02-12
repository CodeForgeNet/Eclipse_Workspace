package com.loopingStatement;

import java.util.Scanner;

public class EachDigRasiPow {

	public static void main(String[] args) {
//		Q. WAJP to find out sum of each each digit raise to the power digit itself.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:- ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("Invalid");
		}else {
			int sum = 0;
			for(;num>0;num/=10) {
				int power = 1;
				int dig = num%10;
				for(int i=1;i<=dig;i++) {
					power = power * dig;
					}
				sum +=power;
				
			}
			System.out.println(sum);

		}
		
		
		
		sc.close();
	}

}
