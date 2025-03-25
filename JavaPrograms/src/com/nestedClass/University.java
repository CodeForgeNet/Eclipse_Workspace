package com.nestedClass;

//Write a Java program to create an outer class called University with a static nested class Department. The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members. Instantiate the Department class from the main method and call the "displayInfo()" method.

public class University {

	static class Department {

		String deptName;
		int facultyNo;

		public Department(String deptName, int facultyNo) {
			this.deptName = deptName;
			this.facultyNo = facultyNo;
		}

		public void displayInfo() {
			System.out.println("Department : " + deptName);
			System.out.println("Total faculty : " + facultyNo);
		}

	}

	public static void main(String[] args) {

		University.Department dept = new University.Department("CS", 50);
		dept.displayInfo();

	}

}
