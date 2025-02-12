package classAssign.Array;

public class Student {
	String name;
	int rollno;
	byte age;
	String grade;
	float totalMarks;
	
	public Student(String name, int rollno,byte age, String grade, float totalMarks) {
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.grade=grade;
		this.totalMarks=totalMarks;
	}
	
	@Override
	public String toString() {
		
		return "[ "+name+", "+rollno+", "+age+", "+grade+ ", "+totalMarks+ " ]" ;
	}

}
