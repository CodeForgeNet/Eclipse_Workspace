package bitwise;

import java.util.Scanner;

public class lft_rt_and_rt_lft {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		
//		while(n>0) {
//			System.out.println(n%10);
//			n= n/10;
//		}
		
		
//		2nd ques. 
		
		int count  = 0;
		int a = n;
		
		while(n>0) {
			count++;
			n/=10;
		}
		
		while(count>0) {
			int digit = (int)(a/Math.pow(10, count-1))%10;
			count--;
			System.out.println(digit);
		}
		
		sc.close();

	}

}
