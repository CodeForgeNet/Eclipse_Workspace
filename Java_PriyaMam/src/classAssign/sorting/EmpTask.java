package classAssign.sorting;

import java.util.*;

public class EmpTask {

	public static void main(String[] args) {
		ArrayList<Employee> arl = new ArrayList<Employee>();
		
		arl.add(new Employee("Shiwang",34,987654321,1998));
		arl.add(new Employee("Tushar",44,985651234,1995));
		arl.add(new Employee("Karan",24,878987672,1898));
		arl.add(new Employee("Honey",26,778765633,2000));
		arl.add(new Employee("Mohan",32,674567578,2005));
		
		
		Collections.sort(arl);
		
		System.out.println(arl);
		

	}
	
	

}
