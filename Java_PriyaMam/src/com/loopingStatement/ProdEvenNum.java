package com.loopingStatement;

import java.util.Scanner;

public class ProdEvenNum {

	public static void main(String[] args) {
//		Q. WAJP to read the range from user and print product of even numbers present b/w the range.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number :- ");
		int firstNum = scanner.nextInt();
		
		System.out.print("Enter second number:- ");
		int secNum = scanner.nextInt();
		
		
		int prod = 1;
		while(firstNum<=secNum) {
			if(firstNum%2==0) {
				prod = prod*firstNum;
			}
			firstNum++;
		}
		System.out.println(prod);
		
		scanner.close();

	}

}
