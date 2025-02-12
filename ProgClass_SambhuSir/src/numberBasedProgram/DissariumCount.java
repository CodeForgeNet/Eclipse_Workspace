package numberBasedProgram;

import java.util.Scanner;

public class DissariumCount {
	
//	 WAJP to print and count all the dissarium number upto 1000.
	
	public static boolean dissarium(int n){
		int a = n;
		int count = getCount(n);
		int sum = 0;
		while(n>0) {
			int rem = n%10;
			sum = (int) (sum + Math.pow(rem, count));
			count--;
			n/=10;
		}
		return sum==a;
		
	}
	
	public static int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int dissCount = 0;
		
		for(int i=1; i<num; i++) {
			if(dissarium(i)) {
				System.out.println(i);
				dissCount ++;
			}
		}
		System.out.println("Total count is : "+ dissCount);
		
		sc.close();
	}

}
