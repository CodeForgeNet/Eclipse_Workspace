package com.set;

import java.util.*;

public class UniqueNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		System.out.println("Enter total num you want to enter: ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int n = sc.nextInt();
			if(!s1.add(n)) {
				System.out.println("duplicate is : "+n);
			}
		}
		
		//Unique number
			System.out.println("\nlist : "+s1);
			System.out.println("Total unique no. "+s1.size());
		
		
		sc.close();
	}

}
