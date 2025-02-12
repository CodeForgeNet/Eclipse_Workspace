package numberBasedProgram;

import java.util.Scanner;

// WAJP to take an integer input and replace all 0's by 1 in a number.

public class Replace0to1 {
	
	public static int replaceDig(int n) {
		
		if(n==0) {
			return 1;
		}else {
		
		int result =0;
		int tenmul = 1;
		while(n>0) {
			int rem = n%10;
			if(rem==0) {
				result = tenmul*1+result;
				
			}else {
				result = tenmul*rem+result;
			}
			n/=10;
			tenmul*=10;
		}
		
		return result;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int dig = sc.nextInt();
		int replace = replaceDig(dig);
		System.out.println(replace);
		
		sc.close();
		
	}

}
