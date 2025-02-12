package classAssign.sorting;

public class Employee implements Comparable<Employee>{

	String name;
	int age;
	double mobno;
	int joining;
	
	public Employee(String name, int age, double mobno, int joining) {
		this.name = name;
		this.age = age;
		this.mobno = mobno;
		this.joining = joining;
	}
	
	@Override
	public int compareTo(Employee o) {
		
//		1st method
		/*
		if(this.joining < o.joining) {
			return 1;
		}else if(this.joining > o.joining) {
			return -1;
		}
		
		return 0;
		*/
		
		
//		2nd Method
		return o.joining-this.joining;
		
	}
	
	@Override
	public String toString() {
		return "("+name+" , "+age+" , "+mobno+" , "+joining+" )" ;
	}
	
	
	
}
