package classAssign.studentTaskMain;

import java.util.Scanner;

public class StudentControl {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your Name 1:- ");
		String sName1 = sc.nextLine();

		System.out.print("Enter Your age 1:- ");
		int age1 = sc.nextInt();

		System.out.print("Enter Mob no 1:- ");
		long mob1 = sc.nextLong();

		System.out.println("Enter Your Id 1 :- ");
		int id1 = sc.nextInt();

		System.out.print("Enter 1st Sub Name 1:- ");
		String sub1 = sc.next();

		System.out.print("Enter 2nd Sub Name 1:- ");
		String sub2 = sc.next();

		System.out.print("Enter 3rd Sub Name 1:- ");
		String sub3 = sc.next();

		System.out.print("Enter 1st Sub Marks 1:- ");
		float subM1 = sc.nextFloat();

		System.out.print("Enter 2nd Sub Marks 1:- ");
		float subM2 = sc.nextFloat();

		System.out.print("Enter 3rd Sub Marks 1:- ");
		float subM3 = sc.nextFloat();

//		------

		System.out.print("Enter Your Name 2:- ");
		String sName2 = sc.nextLine();
		sc.next();

		System.out.print("Enter Your age 2:- ");
		int age2 = sc.nextInt();

		System.out.print("Enter Mob no 2:- ");
		long mob2 = sc.nextLong();

		System.out.println("Enter Your Id 2 :- ");
		int id2 = sc.nextInt();

		System.out.print("Enter 1st Sub Name 2:- ");
		String sub1_2 = sc.next();

		System.out.print("Enter 2nd Sub Name 2:- ");
		String sub2_2 = sc.next();

		System.out.print("Enter 3rd Sub Name 2:- ");
		String sub3_2 = sc.next();

		System.out.print("Enter 1st Sub Marks 2:- ");
		float subM1_2 = sc.nextFloat();

		System.out.print("Enter 2nd Sub Marks 2:- ");
		float subM2_2 = sc.nextFloat();

		System.out.print("Enter 3rd Sub Marks 2:- ");
		float subM3_2 = sc.nextFloat();

//		--------

		System.out.print("Enter Your Name 3:- ");
		String sName3 = sc.nextLine();
		sc.next();

		System.out.print("Enter Your age 3:- ");
		int age3 = sc.nextInt();

		System.out.print("Enter Mob no 3:- ");
		long mob3 = sc.nextLong();

		System.out.println("Enter Your Id 3 :- ");
		int id3 = sc.nextInt();

		System.out.print("Enter 1st Sub Name 3:- ");
		String sub1_3 = sc.next();

		System.out.print("Enter 2nd Sub Name 3:- ");
		String sub2_3 = sc.next();

		System.out.print("Enter 3rd Sub Name 3:- ");
		String sub3_3 = sc.next();

		System.out.print("Enter 1st Sub Marks 3:- ");
		float subM1_3 = sc.nextFloat();

		System.out.print("Enter 2nd Sub Marks 3:- ");
		float subM2_3 = sc.nextFloat();

		System.out.print("Enter 3rd Sub Marks 3:- ");
		float subM3_3 = sc.nextFloat();

		sc.nextLine();

//		------------*-------------- 

		ScoreCard objCard1 = new ScoreCard(sub1, sub2, sub3, subM1, subM2, subM3);
		ScoreCard objCard2 = new ScoreCard(sub1_2, sub2_2, sub3_2, subM1_2, subM2_2, subM3_2);
		ScoreCard objCard3 = new ScoreCard(sub1_3, sub2_3, sub3_3, subM1_3, subM2_3, subM3_3);

		Student stDetail1 = new Student(sName1, age1, mob1, id1, objCard1);
		Student stDetail2 = new Student(sName2, age2, mob2, id2, objCard2);
		Student stDetail3 = new Student(sName3, age3, mob3, id3, objCard3);

		int sign;
		do {
			System.out.println("\nEnter '1' for Student information  & '2' for Percentage & '3' for Minimum Age : ");
			System.out.println("Enter 0 for Exit");

			sign = sc.nextInt();

			if (sign == 1) {
				stDetail1.displayStud();
				stDetail2.displayStud();
				stDetail3.displayStud();

			} else if (sign == 2) {
				if (objCard1.getPercent() > objCard1.getPercent()) {
					stDetail1.displayStud(true);
				} else if (objCard2.getPercent() > objCard3.getPercent()) {
					stDetail2.displayStud(true);
				} else {
					stDetail3.displayStud(true);
				}

			} else if (sign == 3) {
				if (age1 < age2) {
					stDetail1.displayStud(true, true);
				} else if (age2 < age3) {
					stDetail2.displayStud(true, true);
				} else {
					stDetail3.displayStud(true, true);
				}
			} else {
				System.out.println("Exit");
			}

		} while (sign != 0);

		sc.close();

	}

}
