package classAssign.studentTaskMain;

public class Student {

	String name;
	int age;
	long mobno;
	int id;
	ScoreCard studScore;

	public Student(String name, int age, long mobno, int id, ScoreCard studScore) {
		this.name = name;
		this.age = age;
		this.mobno = mobno;
		this.id = id;
		this.studScore = studScore;
	}

	public void displayStud() {
		System.out.println("\n\n⚙️Student Details:- ");
		System.out.println("️Student Name :- " + name);
		System.out.println("Student Contact :- " + mobno);
		System.out.println("Student Age :- " + id);
	}

	public void displayStud(boolean includeScores) {
		System.out.println("\n\n⚙️Student Details:- ");
		System.out.println("️Student Name :- " + name);
		System.out.println("Student Contact :- " + mobno);
		System.out.println("Student Age :- " + id);
		studScore.displayScore();
	}

	public void displayStud(boolean includeAge, boolean includeScores) {
		System.out.println("\n\n⚙️Student Details:- ");
		System.out.println("️Student Name :- " + name);
		System.out.println("Student Age :- " + age);
		System.out.println("Student Contact :- " + mobno);
		System.out.println("Student Age :- " + id);
		studScore.displayScore();
	}

}
