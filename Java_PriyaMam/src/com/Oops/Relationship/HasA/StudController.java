package com.Oops.Relationship.HasA;

import java.util.Scanner;

public class StudController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Name:- ");
		String sName= sc.nextLine();
		
		System.out.print("Enter Mob no:- ");
		long mob= sc.nextLong();
		
		System.out.print("Enter Your age:- ");
		int age = sc.nextInt();
		
		System.out.print("Enter 1st Sub Name:- ");
		String sub1=sc.next();
		
		System.out.print("Enter 2nd Sub Name:- ");
		String sub2=sc.next();
		
		System.out.print("Enter 3rd Sub Name:- ");
		String sub3=sc.next();
		
		System.out.print("Enter 1st Sub Marks:- ");
		float subM1= sc.nextFloat();
		
		System.out.print("Enter 2nd Sub Marks:- ");
		float subM2= sc.nextFloat();
		
		System.out.print("Enter 3rd Sub Marks:- ");
		float subM3= sc.nextFloat();
		
		System.out.print("Enter Your House no:- ");
		String sHno= sc.next();
		
		System.out.print("Enter Your Pincode:- ");
		int spinCode= sc.nextInt();
		
		System.out.print("Enter Your City:- ");
		String sCity= sc.next();
		
		System.out.print("Enter Your State:- ");
		String sState= sc.next();
		
		
		
		
		sc.nextLine();
		
		
//		------------*-------------- 
		
		ScoreCard objCard = new ScoreCard(sub1, sub2, sub3, subM1, subM2, subM3);
		
		Addr objAddr = new Addr(sHno, spinCode, sCity, sState);
		
		Stud stDetail = new Stud(sName, mob, age, objAddr, objCard);
		stDetail.displayStud();
		
		
		
		sc.close();
	}

}
