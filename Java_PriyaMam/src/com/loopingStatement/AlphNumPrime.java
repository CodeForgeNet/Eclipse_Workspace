package com.loopingStatement;

import java.util.Scanner;

public class AlphNumPrime {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				System.out.print("Enter alphnumeric value :- ");
				String str = sc.nextLine();
				
				for(int i=0; i<str.length(); i++) {
					int ch = str.charAt(i);
					
					if(ch>='0' && ch<='9') {
						ch = ch -'0';
						
						if(ch<=1) {
							System.out.println("Not a prime number :- "+ch);
						
						}else if(ch!=2 && ch%2==0){
							System.out.println("Not a prime number :- "+ch);
						}else {
							int count = 1;
							for(int j=2; j<=ch; j++) {
								count++;
								System.out.println(j);
								break;
							}
							if(count==2) {
								System.out.println("It is a Prime Number :- "+ch);
							}else {
								System.out.println("Not a Prime number :- "+ch);
							}
						}
						
				}
			
				
				sc.close();
			}


	}

}
