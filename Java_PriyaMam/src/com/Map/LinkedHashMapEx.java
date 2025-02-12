package com.Map;

import java.util.*;


public class LinkedHashMapEx {
	public static void main(String[] args) {
		
//		NOTES : if key is same then the value gets update , not viceversa.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(mp.containsKey(ch)) {
				int count = mp.get(ch);
				mp.put(ch,count+1);				
			}else {
				mp.put(ch,1);				
			}
			
		}
		
//		System.out.println(mp);
		
		 for (char chr : mp.keySet()) {
	            int count = mp.get(chr);
	            if (count > 1) {
	                System.out.println(chr + " : " + count);
	            }
	        }
		
		
		sc.close();
	}
}
