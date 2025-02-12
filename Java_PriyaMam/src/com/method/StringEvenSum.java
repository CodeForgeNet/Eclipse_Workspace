package com.method;

import java.util.Scanner;

public class StringEvenSum {
	
	public static int sum(String string) {
		int total =0;
		for(int i=0; i<string.length(); i++) {
			char ch= string.charAt(i);
			int num = ch- '0';
			if(num>=0 && num<=9) {
				if(num%2==0) {
					total+=num;
				}
			}else {
				return -1;
			}
		}
		return total;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter alphanumeric string:- ");
		String string = sc.next(); 
		
		if(sum(string)<0) {
			System.out.println("There is no Even number in String");
		}else {
			System.out.println(sum(string));
		}

		
		
		sc.close();
	}

}
