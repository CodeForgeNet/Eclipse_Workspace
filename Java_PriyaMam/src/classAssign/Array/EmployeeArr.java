package classAssign.Array;

//Q. write a java program to store n number of employees in an array each and every employee will have name, employee id , age, salary, mobno. Task => To display all the employee detail seperated by comma one by one.


public class EmployeeArr {

	String name;
	int id;
	byte age;
	double sal;
	long mob;
	
	public EmployeeArr(String name, int id, byte age, double sal, long mob) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.sal=sal;
		this.mob=mob;
	}

	 
    @Override
    public String toString() {
        return " " + name + ", " + id + ", " + age + ", " + sal + ", " + mob;
    }
    
    
	
}
	



