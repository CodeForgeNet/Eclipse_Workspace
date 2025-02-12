package com.BasicsCal;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
//		Q. WAJP to check if a number is prime or not.
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number:- ");
		int numb = sc.nextInt();
		int count = 0;
		for(int i=1; i<=numb; i++) {
			if (numb%i==0) {
				count++;
			}
			if (count==2) {
				System.out.println(numb+ " is prime number");
			}else {
				System.out.println(numb+" is not a prime number");
			}
		}
		
		sc.close();
	}

}
