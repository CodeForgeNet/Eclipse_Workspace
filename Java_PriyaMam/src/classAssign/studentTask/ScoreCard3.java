package classAssign.studentTask;

public class ScoreCard3 {
	
	String sub1Name3;
	String sub2Name3;
	String sub3Name3;
	private float sub1Marks3;
	private float sub2Marks3;
	private float sub3Marks3;
	
	public float getTotal3() {
		return sub1Marks3+sub2Marks3+sub3Marks3;
	}
	
	public float getPercent3() {
		return (getTotal3()/300)*100;
	}
	
	
	public ScoreCard3(String sub1Name3, String sub2Name3, String sub3Name3, float sub1Marks3, float sub2Marks3, float sub3Marks3) {
		this.sub1Name3=sub1Name3;
		this.sub2Name3=sub2Name3;
		this.sub3Name3=sub3Name3;
		this.sub1Marks3=sub1Marks3;
		this.sub2Marks3=sub2Marks3;
		this.sub3Marks3=sub3Marks3;
	}
	
	

	public void displayScore3() {
		
		System.out.println("\n\n📑 Student Marks 3 :- ");
		System.out.println(sub1Name3 + " = "+sub1Marks3);
		System.out.println(sub2Name3 + " = "+sub2Marks3);
		System.out.println(sub3Name3 + " = "+sub3Marks3);
		System.out.println("\nTotal marks :- "+getTotal3());
		System.out.println("Student Percentage :- "+getPercent3());
		
	}
	
//	@Override
//    public String toString() {
//        return "ScoreCard3{" +
//                "sub1Name3='" + sub1Name3 + '\'' +
//                ", sub2Name3='" + sub2Name3 + '\'' +
//                ", sub3Name3='" + sub3Name3 + '\'' +
//                ", sub1Marks3=" + sub1Marks3 +
//                ", sub2Marks3=" + sub2Marks3 +
//                ", sub3Marks3=" + sub3Marks3 +
//                '}';
//    }

}
