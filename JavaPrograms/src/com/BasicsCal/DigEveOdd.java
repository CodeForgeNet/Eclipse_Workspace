package com.BasicsCal;

public class DigEveOdd {

	public static void main(String[] args) {
		int n = 23456;
		int evenCount = 0; 
		int oddCount = 0;
		while(n!=0) {
			int r = n%10;
			if(r%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			n = n/10;
			
		}
		System.out.println(evenCount);
		System.out.println(oddCount);

	}

}
