package com.set;

import java.util.*;

public class LinkedHashset_ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>(); 
		
		System.out.println("Enter total num you want to enter: ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int n = sc.nextInt();
			s1.add(n);
		}
		
		System.out.println(s1);
		
		//1st way
		System.out.println("\nUsing Itertor");
	    Iterator<Integer> lit = s1.iterator();
	    for(int i=0; i<s1.size();i++ ) {
	    		System.out.println(lit.hasNext());
	    }
		
		
		
		//2nd way
		System.out.println("----for each ----");
		for(Integer i : s1) {
			System.out.println(i);
		}
		
		
		
		//3rd way
		
		System.out.println("Arraylist to iterator ");
		List<Integer> liT = new ArrayList<Integer>(s1);
		ListIterator<Integer> li = liT.listIterator();
		
		for(int i=0; i<liT.size(); i++) {
			System.out.println(li.hasNext());
		}
		
		
		sc.close();
	}
}
