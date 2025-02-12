package com.loopingStatement;

public class SumEvenBw {

	public static void main(String[] args) {
//		Q. WAJP to find out sum of even number present b/w 15 and 40.
		int a = 15;
		int sum = 0;
		while (a<=50) {
			if (a%2==0) {
				sum+=a;
			}
			a++;
		}
		System.out.println(sum);

	}

}
