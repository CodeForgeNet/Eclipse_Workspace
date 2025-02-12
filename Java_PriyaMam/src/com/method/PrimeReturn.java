package com.method;

import java.util.Scanner;

public class PrimeReturn {
	
	public static boolean prime(int a) {
		if(a<=1) {
			return false;
		}else if (a!=2 && a%2==0) {
			return false;
		}else {
			for (int i=2; i<=a; i++) {
				if (a%i==0) {
					return false;
				}
				}
			return true;
			
			}
		}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter num:- ");
		int num = scanner.nextInt();
		
		prime(num);
		System.out.println(prime(num));
		
		
		scanner.close();
	}

}
