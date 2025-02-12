package com.loopingStatement;

import java.util.Scanner;

public class PrimeBWrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your first number:- ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter Your first number:- ");
		int n2 = sc.nextInt();
		
		
		for( ;n1<=n2; n1++) {
			int count = 0;
			
			
			for(int i=2; i<=n1/2; i++) {				
				if (n1 % i ==0) {
				count++;
				break; 
				
				}
			}
			if(count==0) {
				System.out.println(n1);
			}
			
			
		}
		
		
		sc.close();
	}

}
