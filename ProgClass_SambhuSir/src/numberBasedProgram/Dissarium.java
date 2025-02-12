package numberBasedProgram;

import java.util.Scanner;

public class Dissarium {
	
//	WAJP to take user input and print whether the number is dissarium number or not.
	
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
		if(dissarium(num)) {
			System.out.println("it is dissarium");
		}else {
			System.out.println("It is not dissarium");
		}
		
		sc.close();
	}

}
