package com.ObjectClass;

public class EmployeeController {
public static void main(String[] args) {
		
		Employee emp1 = new Employee(103);
		Employee emp2 = new Employee(143);
		Employee emp3 = new Employee(103);
		
		
		System.out.println(emp1 == emp2); // false
		System.out.println(emp2 == emp3); // false
		System.out.println(emp1 == emp3); // false
						// == compares the addresses
		
		System.out.println("--------------------------");
		
		System.out.println(emp1.equals(emp2)); // false
		System.out.println(emp2.equals(emp3)); // false
		System.out.println(emp1.equals(emp3)); // true
		
		// equals method in object class also comapres the address
		// if we want to compare the content thenwe should override equals method in child class
		
		
		
		
	}
}
