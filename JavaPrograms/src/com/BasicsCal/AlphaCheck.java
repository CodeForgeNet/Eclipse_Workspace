package com.BasicsCal;

import java.util.Scanner;

public class AlphaCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your character:- ");
		
		// This one is also done by ASCII value i.e; A=65,Z=90,a=97,z=122;
		
		char inp = scanner.next().charAt(0);
		
		if (inp >= 'a' && inp <= 'z' || inp >= 'A' && inp <='Z' ) {
			System.out.println("Alphabet");
		}else {
			System.out.println("Not Alphabet");
		}
		
		scanner.close();

	}

}
