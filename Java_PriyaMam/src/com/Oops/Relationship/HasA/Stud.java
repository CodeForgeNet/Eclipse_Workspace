package com.Oops.Relationship.HasA;

public class Stud {
	String name;
	long mobno;
	int age;
	Addr studAddr;
	ScoreCard studScoreCard;
	
	public Stud(String name, long mobno, int age, Addr studAddr, ScoreCard stuScoreCard) {
		this.name=name;
		this.mobno=mobno;
		this.age=age;
		this.studAddr=studAddr;
		this.studScoreCard=stuScoreCard;
	}
	
	public void displayStud() {
		System.out.println("\n\n⚙️Student Details:- ");
		System.out.println("️Student Name :- " +name);
		System.out.println("Student Contact :- "+mobno);
		System.out.println("Student Age :- "+age);
		studAddr.displayAddr();
		studScoreCard.displayScore();
	}
	

}
