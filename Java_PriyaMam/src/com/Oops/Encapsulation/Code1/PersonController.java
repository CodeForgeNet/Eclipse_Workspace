package com.Oops.Encapsulation.Code1;

import java.util.Scanner;

public class PersonController {
	public static void main(String[] args) {
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();

		System.out.println("Enter age : ");
		int age = sc.nextInt();

		System.out.println("Enter contact no : ");
		long contact = sc.nextLong();

		Person p = new Person(name, age, contact);
		/*
		 * p.pname = "rahul"; System.out.println(p.pname);
		 */
		System.out.println("Person details : ");
		System.out.println("[" + p.getPname() + "," + p.getPage()+ "," + p.getPcontact() + "]");

		do {
			System.out.println("-----Operation menu------");
			System.out.println("press 1 for Update Name");
			System.out.println("press 2 for Update age");
			System.out.println("press 3 for update Contact");
			System.out.println("press 0 for exit");
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			if (input == 1) {
				System.out.println("Enter the name u want to update : ");
				String updatedName = sc.next();
				p.setPname(updatedName);
			} else if (input == 2) {
				// task
			} else if (input == 3) {
				// task
			}
		} while (true);

		System.out.println("[" + p.getPname() + "," + p.getPage()+ "," + p.getPcontact() + "]");
		
		
		System.out.println("End of the Program");
		sc.close();
	}

}
