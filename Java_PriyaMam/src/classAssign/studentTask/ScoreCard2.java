package classAssign.studentTask;

public class ScoreCard2 {
	
	String sub1Name2;
	String sub2Name2;
	String sub3Name2;
	private float sub1Marks2;
	private float sub2Marks2;
	private float sub3Marks2;
	
	public float getTotal2() {
		return sub1Marks2+sub2Marks2+sub3Marks2;
	}
	
	public float getPercent2() {
		return (getTotal2()/300)*100;
	}
	
	
	public ScoreCard2(String sub1Name2, String sub2Name2, String sub3Name2, float sub1Marks2, float sub2Marks2, float sub3Marks2) {
		this.sub1Name2=sub1Name2;
		this.sub2Name2=sub2Name2;
		this.sub3Name2=sub3Name2;
		this.sub1Marks2=sub1Marks2;
		this.sub2Marks2=sub2Marks2;
		this.sub3Marks2=sub3Marks2;
	}
	
	

	public void displayScore2() {
		
		System.out.println("\n\n📑 Student Marks 2 :- ");
		System.out.println(sub1Name2 + " = "+sub1Marks2);
		System.out.println(sub2Name2 + " = "+sub2Marks2);
		System.out.println(sub3Name2 + " = "+sub3Marks2);
		System.out.println("\nTotal marks :- "+getTotal2());
		System.out.println("Student Percentage :- "+getPercent2());
		
	}
	
	
//	@Override
//    public String toString() {
//        return "ScoreCard2{" +
//                "sub1Name2='" + sub1Name2 + '\'' +
//                ", sub2Name2='" + sub2Name2 + '\'' +
//                ", sub3Name2='" + sub3Name2 + '\'' +
//                ", sub1Marks2=" + sub1Marks2 +
//                ", sub2Marks2=" + sub2Marks2 +
//                ", sub3Marks2=" + sub3Marks2 +
//                '}';
//    }
	

}
