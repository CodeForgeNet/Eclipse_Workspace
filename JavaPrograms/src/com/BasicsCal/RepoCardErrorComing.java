package com.BasicsCal;

import java.util.Scanner;

public class RepoCardErrorComing {

	public static void main(String[] args) {
		// Error Coming

		Scanner sc = new Scanner (System.in);


		System.out.print("Enter Your name :- ");
		String name = sc.nextLine();

		System.out.print("Enter your age :- ");
		int age = sc.nextInt();
		
		System.out.print("Enter your mobile no. :- ");
		long mob = sc.nextLong();
		
		
		System.out.println("Enter your subject name :- ");
		String sub1 = sc.nextLine();
		sc.nextLine();
		System.out.println(sub1+" Marks :- " );
		int sub1M = sc.nextInt();


		System.out.println("Enter your subject name :- ");
		String sub2 = sc.nextLine();
		sc.nextLine();
		System.out.println(sub2+" Marks :- " );
		int sub2M = sc.nextInt();


		System.out.println("Enter your subject name :- ");
		String sub3 = sc.nextLine();
		sc.nextLine();
		System.out.println(sub3+" Marks :- " );
		int sub3M = sc.nextInt();


		System.out.println("Enter your subject name :- ");
		String sub4 = sc.nextLine();
		sc.nextLine();
		System.out.println(sub4+" Marks :- " );
		int sub4M = sc.nextInt();




		System.out.println("--------\tStudent Marksheet\t--------");

		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age);
		System.out.println("Mob no. :- "+mob);
		System.out.println("------\tSubject Marks\t------");
		System.out.println(sub1 +" :-"+sub1M);
		System.out.println(sub2 +" :-"+sub2M);
		System.out.println(sub3 +" :-"+sub3M);
		System.out.println(sub4 +" :-"+sub4M);
		
		sc.close();

	}

}
