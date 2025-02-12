package classAssign.studentTask;

public class Stud2 {
	
	String name;
	long mobno;
	int id;
	ScoreCard2 stud2ScoreCard;
	
	public Stud2(String name, long mobno, int id, ScoreCard2 studScoreCard) {
		this.name=name;
		this.mobno=mobno;
		this.id=id;
		this.stud2ScoreCard=studScoreCard;
	}
	
	public void displayStud() {
		System.out.println("\n\n⚙️Student Details:- ");
		System.out.println("️Student Name :- " +name);
		System.out.println("Student Contact :- "+mobno);
		System.out.println("Student Age :- "+id);
		stud2ScoreCard.displayScore2();
	}

}
