package com.nestedClass;

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
