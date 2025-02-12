package com.loopingStatement;

import java.util.Scanner;

public class ShapeMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		
		do {
		
		System.out.println("------Shape Menu------");
		System.out.println("Enter 1 for circle \nEnter 2 for Square \nEnter 3 for Rectangle :- ");
		System.out.println("Press 0 press exit");
		System.out.println("Press Any number for continue");
		
		n= sc.nextInt();
		
		
		
		if(n==1) {
			System.out.println("You have selected Circle\n");
			System.out.println("------Circle Menu------\n");
			System.out.print("Enter \'1\' for finding Area of circle & \n \'2\' for finding Diameter of circle:- ");
			int a = sc.nextInt();
			
			if(a==1) {
				System.out.println("\nYou have selected area:- \n");
				
				System.out.print("\tEnter radius :- ");
				float rad = sc.nextFloat();
				
				float pi = 3.14f;
				float area = pi*rad*rad;
				System.out.println("The area of circle is : "+area+"\n\n");
				
			}else if (a==2) {
				System.out.println("\nYou have selected diameter:- ");
				System.out.print("Enter radius :- ");
				float rad = sc.nextFloat();
			
				float dia = rad*rad;
				System.out.println("The Diameter of circle is : "+dia);
			}else {
				System.out.println("You selected none");
			}
			
			
			
			
		}else if (n==2) {
			System.out.println("\nYou have selected Square");
			System.out.println("------Square Menu------");
			System.out.println("Enter \'1\' for finding Area of Square & \n \'2\' for finding Peremeter of Square:- ");
			
			int b = sc.nextInt();
			if(b==1) {
				System.out.println("You have selected area:- ");
				
				System.out.print("Enter side of square :- ");
				float side = sc.nextFloat();
				float area = side * side;
				
				System.out.println("Area of square is :- "+ area+"\n");
				
				
			}else if (b==2) {
				System.out.println("\nYou have selected Perimeter");
				
				System.out.print("Enter side of square :- ");
				float side = sc.nextFloat();
				float perim = 4*side;
				
				System.out.println("Perimeter of square is :- "+perim +"\n");
				
			}else {
				System.out.println("You selected none");
			}
			
			
			
			
			
		}else if (n==3) {
			System.out.println("\nYou have selected Rectangle");
			System.out.println("------Square Menu------");
			System.out.print("Enter \'1\' for finding Area of Rectangle &\n \'2\' for finding Peremeter of Rectangle:- ");
			
			int c=sc.nextInt();
			if(c==1) {
				System.out.println("You have selected Area\n");
				
				System.out.print("Enter smallest side of rectangle :- ");
				float smSide=sc.nextFloat();
				System.out.print("Enter largest side of rectangle :- ");
				float lrgSide=sc.nextFloat();
				
				float area = smSide*lrgSide;
				
				System.out.println("Area of Perimeter is : "+area+"\n");
				
			}else if (c==2) {
				System.out.println("\nYou have selected Perimeter");
				
				System.out.print("Enter smallest side of rectangle :- ");
				float smSide=sc.nextFloat();
				System.out.print("Enter largest side of rectangle :- ");
				float lrgSide=sc.nextFloat();
				
				float perim = 2*(smSide+lrgSide);
				
				System.out.println("Perimeter of Rectangle is : "+perim+"\n");
				
			}
			
			
			
		}else {
			System.out.println("Exit");
		}
		
		
		
		
		}while(n!=0);
		
		sc.close();

	}

}
