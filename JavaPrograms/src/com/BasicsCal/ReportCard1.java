package com.BasicsCal;

import java.util.Scanner;

public class ReportCard1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);


		System.out.print("Enter Your name :- ");
		String name = sc.nextLine();

		System.out.print("Enter your age :- ");
		int age = sc.nextInt();

		System.out.print("Enter your mobile no. :- ");
		long mob = sc.nextLong();

		sc.nextLine();

		System.out.print("Enter your 1st subject name :- ");
		String sub1 = sc.nextLine();
		
		System.out.print("Enter your 2nd subject name :- ");
		String sub2 = sc.nextLine();
		
		System.out.print("Enter your 3rd subject name :- ");
		String sub3 = sc.nextLine();
		
		System.out.print("Enter your 4th subject name :- ");
		String sub4 = sc.nextLine();
		
		
		
		System.out.print(sub1+" Marks :- " );
		float sub1M = sc.nextFloat();
		
		System.out.print(sub2+" Marks :- " );
		float sub2M = sc.nextFloat();
		
		System.out.print(sub3+" Marks :- " );
		float sub3M = sc.nextFloat();

		System.out.print(sub4+" Marks :- " );
		float sub4M = sc.nextFloat();

		int totalMarks = 400;
		float obtainedMarks = sub1M+sub2M+sub3M+sub1M;
		float percent = obtainedMarks/totalMarks*100;
		String result = percent < 33 ? "Fail" : "Pass";

		
		

		System.out.println("\n\n----------\tStudent Marksheet \t----------");

		System.out.println("\nName :- "+name);
		System.out.println("Age :- "+age);
		System.out.println("Mob no. :- "+mob);
		
		System.out.println("\n------\tSubject Marks \t------");
		System.out.println(sub1 +" :- "+sub1M);
		System.out.println(sub2 +" :- "+sub2M);
		System.out.println(sub3 +" :- "+sub3M);
		System.out.println(sub4 +" :- "+sub4M);
		
		System.out.println("\nTotal Marks :- "+totalMarks);
		System.out.println("Obtained Marks :- "+obtainedMarks);
		System.out.println("Percentage :- "+percent);
		System.out.println(result);
		
		
		sc.close();

	}

}
