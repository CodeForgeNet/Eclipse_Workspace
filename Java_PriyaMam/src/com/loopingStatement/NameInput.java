package com.loopingStatement;

import java.util.Scanner;

public class NameInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name="";
		for(int i=0; i<=4;i++) {
			System.out.println("Enter name:- ");
			String s = sc.nextLine();
			
			name =name + s +"\n";
		}
		System.out.println(name);
		
		sc.close();
	}

}
