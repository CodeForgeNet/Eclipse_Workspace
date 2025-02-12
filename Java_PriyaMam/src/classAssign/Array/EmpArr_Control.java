package classAssign.Array;

import java.util.Scanner;


public class EmpArr_Control {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in);
		
		System.out.print("Enter no. of Employee : ");
		int n = sc.nextInt();
		
		EmployeeArr[] arrs = new EmployeeArr[n];
		
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter " + (i+1) +" Employee Name : ");
			String name = sc.next();
			
			System.out.print("Enter " + (i+1) +" Employee Id : ");
			int id = sc.nextInt();
			
			System.out.print("Enter " + (i+1) +" Employee Age : ");
			byte age = sc.nextByte();
			
			System.out.print("Enter " + (i+1) +" Employee Salary : ");
			double sal = sc.nextDouble();
			
			System.out.print("Enter " + (i+1) +" Employee Mobile No. : ");
			long mob = sc.nextLong();
			
			arrs[i]= new EmployeeArr(name, id, age, sal, mob);
			
			
		}
		
		
		for(int i=0; i<n; i++) {
		    System.out.println("\n"+(i+1)+". Employee :- "  +arrs[i]);
		}
		
		
		
		
		
		
		sc.close();

	}

}
