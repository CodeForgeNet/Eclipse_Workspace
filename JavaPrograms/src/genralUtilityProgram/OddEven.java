package genralUtilityProgram;

import java.util.Scanner;

public class OddEven {
	
	public static void checkOddEven(int n) {
		if(n%2==0) {
			System.out.println(n+" is Even");
		}else {
			System.out.println(n+" is Odd");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		checkOddEven(n);
		sc.close();
	}

}
