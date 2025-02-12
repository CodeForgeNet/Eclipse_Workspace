package classAssign.studentTask;

public class ScoreCard1 {
	String sub1Name1;
	String sub2Name1;
	String sub3Name1;
	private float sub1Marks1;
	private float sub2Marks1;
	private float sub3Marks1;
	
	public float getTotal1() {
		return sub1Marks1+sub2Marks1+sub3Marks1;
	}
	
	public float getPercent1() {
		return (getTotal1()/300)*100;
	}
	
	
	public ScoreCard1(String sub1Name1, String sub2Name1, String sub3Name1, float sub1Marks1, float sub2Marks1, float sub3Marks1) {
		this.sub1Name1=sub1Name1;
		this.sub2Name1=sub2Name1;
		this.sub3Name1=sub3Name1;
		this.sub1Marks1=sub1Marks1;
		this.sub2Marks1=sub2Marks1;
		this.sub3Marks1=sub3Marks1;
	}
	
	

	public void displayScore1() {
		
		System.out.println("\n\n📑 Student Marks 1:- ");
		System.out.println(sub1Name1 + " = "+sub1Marks1);
		System.out.println(sub2Name1 + " = "+sub2Marks1);
		System.out.println(sub3Name1 + " = "+sub3Marks1);
		System.out.println("\nTotal marks :- "+getTotal1());
		System.out.println("Student Percentage :- "+getPercent1());
		
	}
	
	
//	@Override
//    public String toString() {
//        return "ScoreCard1 :- " +
//                "sub1Name1='" + sub1Name1 + '\'' +
//                ", sub2Name1='" + sub2Name1 + '\'' +
//                ", sub3Name1='" + sub3Name1 + '\'' +
//                ", sub1Marks1=" + sub1Marks1 +
//                ", sub2Marks1=" + sub2Marks1 +
//                ", sub3Marks1=" + sub3Marks1 +
//                '}';
//    }

}
