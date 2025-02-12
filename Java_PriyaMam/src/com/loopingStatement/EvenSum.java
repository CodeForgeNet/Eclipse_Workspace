package com.loopingStatement;

public class EvenSum {

	public static void main(String[] args) {
		int a= 15;
		int sum = 0;
		while(a<=40) {
			if(a%2==0) {
				sum = sum+a;
			}
			a++;
			System.out.println(sum);
		}

	}

}
