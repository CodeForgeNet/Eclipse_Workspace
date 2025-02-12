package com.ObjectClass;

public class Employee {
int empId;
	
	public Employee(int empId) {
		this.empId = empId;
	}
	
	@Override
	public boolean equals(Object obj) { // Object obj = new Employee()
		Employee e =(Employee)obj;
		return this.empId == e.empId;
	}

}
