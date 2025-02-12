package com.Oops.Relationship.HasA;

public class ScoreCard {
	String sub1Name;
	String sub2Name;
	String sub3Name;
	private float sub1Marks;
	private float sub2Marks;
	private float sub3Marks;
	
	public float getTotal() {
		return sub1Marks+sub2Marks+sub3Marks;
	}
	
	public float getAvg() {
		return getTotal()/3;
	}
	
	public float getPercent() {
		return (getTotal()/300)*100;
	}
	
	public ScoreCard(String sub1Name, String sub2Name, String sub3Name, float sub1Marks, float sub2Marks, float sub3Marks) {
		this.sub1Name=sub1Name;
		this.sub2Name=sub2Name;
		this.sub3Name=sub3Name;
		this.sub1Marks=sub1Marks;
		this.sub2Marks=sub2Marks;
		this.sub3Marks=sub3Marks;
	}
	
	
	
	public void displayScore() {
		
		System.out.println("\n\n📑 Student Marks :- ");
		System.out.println(sub1Name + " = "+sub1Marks);
		System.out.println(sub2Name + " = "+sub2Marks);
		System.out.println(sub3Name + " = "+sub3Marks);
		System.out.println("\nTotal marks :- "+getTotal());
		System.out.println("Student Average :- "+getAvg());
		System.out.println("Student Percentage:- "+getPercent());
		
		
	}
	
	
	

}
