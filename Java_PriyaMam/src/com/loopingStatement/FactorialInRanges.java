package com.loopingStatement;

import java.util.Iterator;
import java.util.Scanner;

public class FactorialInRanges {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter starting range:- ");
		int start = sc.nextInt();
		
		System.out.println("Enter ending range:- ");
		int end = sc.nextInt();
		
		if (start<1) {
			System.out.println("Invalid : starting value can not be negative");
		}else if (end<=start){
			System.out.println("Invalid : starting value can not be negative");
		}else {
			for(;start<=end;) {
				int fact = 1;
				for(int i=1;i<=start;i++) {
					fact *=i;
				}
				System.out.println(fact);
			}
			
		}
		sc.close();

	}

}
