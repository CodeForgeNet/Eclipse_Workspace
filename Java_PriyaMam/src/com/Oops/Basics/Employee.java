package com.Oops.Basics;

public class Employee {
	
	static String compName;
	String empName;
	int empId;
	
	public Employee() {
		
	}
	
	public void setObjectStates(String empName, int empId) {
		this.empName=empName;
		this.empId=empId;
		
	}
	
	public void display() {
		System.out.println("Employee Name:- " +empName);
		System.out.println("Employee Id:- " +empId);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println("Employee name -  "+ emp1.empName);
		System.out.println("Employee Id - "+ emp1.empId);
		
//		Initialise the object states with the help of reference variable.
		emp1.empName = "Karan";
		emp1.empId= 345;
		
		System.out.println("Emp1 name :- "+ emp1.empName);
		System.out.println("Emp1 id - "+ emp1.empId);
		
		Employee emp2 = new Employee();
		emp2.display();
		
//		Initialise the object states with the help of method
		emp2.setObjectStates("Arjun", 987);
		emp2.display();
		
		
		
		
		

	}

}
