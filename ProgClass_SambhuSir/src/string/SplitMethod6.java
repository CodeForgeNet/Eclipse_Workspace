package string;

import java.util.Scanner;

//Q. For the given string add all the numeric digit found in  a string .if multiple string that should be consider as one number. 
public class SplitMethod6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String s1 = sc.nextLine();
		System.out.println("sum of numeric digit is: "+getSum(s1));
		sc.close();
	}
	
	public static int getSum(String s1) {
		String [] k = s1.split("[a-zA-Z");
		int sum =0;
		for(String p:k) {
			
			if(!p.isBlank()) {
				sum = sum+Integer.valueOf(p);
			}
			
		}
		return sum;
	}
}
