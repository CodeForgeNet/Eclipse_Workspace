package string;

//Q1. print the biggest numeric value in string
//Q2. print the sum of all numeric digit
//Q3. print if the sum of all numeric digits is prime no. of not?


public class StringQues {
	public static void main(String[] args) {
		
//	Ans1.
	String  s1 = "a4bc38cab6";
	int sum = 0;
	for(int i=0; i<s1.length(); i++) {
		if(s1.charAt(i)>='O' && s1.charAt(i)<=57) {
			sum=sum+s1.charAt(i)-48;
			
		}
		System.out.println("sum is: "+sum);
	}

	}
}
