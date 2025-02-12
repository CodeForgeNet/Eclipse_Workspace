package classAssign.studentTask;


public class Stud1 {
	String name;
	long mobno;
	int id;
	ScoreCard1 stud1ScoreCard;
	
	public Stud1(String name, long mobno, int id, ScoreCard1 stuScoreCard) {
		this.name=name;
		this.mobno=mobno;
		this.id=id;
		this.stud1ScoreCard=stuScoreCard;
	}
	
	public void displayStud() {
		System.out.println("\n\n⚙️Student Details:- ");
		System.out.println("️Student Name :- " +name);
		System.out.println("Student Contact :- "+mobno);
		System.out.println("Student Age :- "+id);
		stud1ScoreCard.displayScore1();
	}
	
	 

}
