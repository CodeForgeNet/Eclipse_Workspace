package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no. of students : ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("enter names : ");
			String name = sc.next();
			arr.add(name);
		}
		
		int sign;
		
		do {
			System.out.println("Enter 1 for names , \n Enter 2 for even index, \n Enter 3 for length is 5, \n Enter 4 for first char consonant ");
			sign = sc.nextInt();
			
			
			if(sign==1) {
				
//			01. display names one by one.
			for(int i=0; i<n; i++) {
				System.out.println(arr.get(i)); 
			}
			}else if(sign==2) {
//			02. even index.
				for(int i=0; i<n; i++) {
					if(i%2==0) {
						System.out.println(arr.get(i)); 
					}
				}
			}else if(sign==3) {
//				03. length is 5
				for(int i=0; i<n; i++) {
					int len = arr.size();
					if(len==5) {
						System.out.println(arr.get(i)); 
					}
				}
			}else if(sign==4) {
//				04. first char consonant
				for(int i=0; i<n; i++) {
					String st = (String) arr.get(i);
					st.toLowerCase();
					if(st.charAt(0)!='a' || st.charAt(0)!='e' || st.charAt(0)!='i' || st.charAt(0)!='o' || st.charAt(0)!='u') {
						System.out.println(arr.get(i)); 
					}
				}
			}
			
		}while(sign!=0);

		sc.close();
		
	}
	
	

}
