package com.loopingStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Here user input number stored in SUM.
		System.out.print("Enter first Num:- ");
		float sum = sc.nextFloat();
		
//		char declaration is outside of do while loop for loop condition checking.
		char sign;
		
		do {		

			System.out.print("Enter sign:- ");
			sign = sc.next().charAt(0);
			
//			if sign is not equal to '=' then perform this task.
			if (sign!='=') {
				
				System.out.print("Enter number: ");
                float num = sc.nextFloat();
			
                if (sign=='+') {
					sum+=num;
				}else if(sign=='-'){				
					sum-=num;
				}else if (sign=='*') {
					sum*=num;
				} else if (sign=='/') {
                		if (num != 0) {
                    		sum/=num;
                		} else {
                    		System.out.println("Cannot divide by zero");                    		
                		}
				}
//          if sign is equal to '=' then it prints 'exit'
			}else {
                System.out.println("\nExit");             
            }
			
			
		} while (sign!='=');
		System.out.println("Result of calculation :- "+sum);
		
		
		sc.close();
	}

}
