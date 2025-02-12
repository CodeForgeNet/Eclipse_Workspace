package com.BasicsCal;

import java.util.Scanner;

public class StGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your avg marks: ");
		float avg = scanner.nextFloat();
		
		if (avg>75) {
			System.out.println("A Grade");
		}
		else if (avg>50 && avg<65) {
			System.out.println("B Grade");
		}
		else if (avg<50) {
			System.out.println("C Grade");
		}
		else {
			System.out.println("Fail");
		}
		scanner.close();

	}

}
