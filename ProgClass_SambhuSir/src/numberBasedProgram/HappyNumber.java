package numberBasedProgram;

import java.util.Scanner;

public class HappyNumber {
	
	public static boolean isHappy(int n) {
		 while(n>9) {
			 int sum=0;
			 while(n>0) {
				 int rem = n%10;
				 sum+=(rem*rem);
				 n/=10;
			 }
			 n=sum;
		 }
		 
		 return n==1 || n==7;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		
		if(isHappy(num)) {
			System.out.println("It is happy number");
		}else {
			System.out.println("Not a happy number");
		}
		
		
		
		sc.close();
	}

}
