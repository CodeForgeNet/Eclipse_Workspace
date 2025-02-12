package com.Oops.Basics;

public class Employees {
	
	static String compName;
	String empName;
	int empId;
	
	public Employees() {
		
	}
	
	public Employees (String empName, int empId) {
		this.empName= empName;
		this.empId=empId;
	}
	
	public void display() {
		System.out.println("Employee Name:- " +empName);
		System.out.println("Employee Id:- " +empId);
	}
	
//	Non static method to initialise object states.
	public void setObjectStates(String empName, int empId) {
		this.empName=empName;
		this.empId=empId;
	}
	

	public static void main(String[] args) {
	
		System.out.println("1st Way");
		Employees emp1 = new Employees();
		System.out.println("Emp Name:- "+ emp1.empName);
		System.out.println("Emp Id:- "+ emp1.empId);
		
//		initialise the object states with the help of reference variable.
		emp1.empName = "Arjun";
		emp1.empId = 1023;
		System.out.println("Emp name :- "+ emp1.empName);
		System.out.println("Emp Id :- "+ emp1.empId);
		
		System.out.println("2nd ways");
		Employees emp2 = new Employees();
		emp2.display();
		
//		Initialise the object states with help of method
		emp2.setObjectStates("Karan", 374);
		emp2.display();
		
		System.out.println("3rd way");
//		Initialise the object states with help of constructor.
		Employees emp3= new Employees("Obito",34677);
		emp3.display();
		

	}

}
