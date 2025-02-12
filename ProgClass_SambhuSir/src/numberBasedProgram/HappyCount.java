package numberBasedProgram;

import java.util.Scanner;

public class HappyCount {

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
		System.out.println("Enter num1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int n2 = sc.nextInt();
		
		int hcount = 0;
		
		for(int i=n1; i<=n2; i++) {
			if(isHappy(i)) {
				System.out.println(i+" It is happy number");
				hcount++;
			}
		}
		System.out.println("Total happy no. is : "+hcount);
	}
}
