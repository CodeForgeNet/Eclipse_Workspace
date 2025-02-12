package com.loopingStatement;

public class OddNumFrom {

	public static void main(String[] args) {
//		06. WAJP to print odd numbers from 50 to 25.
		int a = 50;
		while(a>=25) {
			if(a%2==1) {
				System.out.println(a);
			}
			a--;
		}

	}

}
