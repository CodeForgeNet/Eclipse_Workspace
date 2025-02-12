package com.BasicsCal;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
//		Q. WAJP to check whether a number is Palindrome or not.(after reverse that number is same as real one like; 888,101, 525 etc.)
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		int num = sc.nextInt();
		
		int reversedNum = 0;
		int realNum = num;
		if(num<0) {
			System.out.println("Invalid : Negative number can never be Palindrome .");
		}else if (num<99) {
			System.out.println("Invalid : Single digit can never be Palindrome ");
		}else if (num>=99) {
			while(num!=0) {
				int dig = num%10;
				reversedNum = reversedNum * 10 + dig;
				num/=10;
			}
			if (realNum==reversedNum) {
				System.out.println("It is a Palindrome");
			}else {
				System.out.println("It is not a Palindrome");
			}
		}
		
		
		sc.close();
	}

}
