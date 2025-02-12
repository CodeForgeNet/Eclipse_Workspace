package numberBasedProgram;

import java.util.Scanner;

public class Fascinating {
	
	public static boolean isFascinating(int n) {
		int multi1 = n*2;
		int multi2 = n*3;
		String combine = n+""+multi1+""+multi2;
		
//		my method : 
		int count =0;
		for(int i=0; i<combine.length(); i++) {
			char rem = combine.charAt(i);
			
			for(int j=1; j<=9; j++) {
				if(rem ==(char)j) {
					count++;
					
				}
			}
			
			if(count==0 || count >1) {
				return false;
			}
			
		}
		
		return true;
		
//		method 1 by sir.
		
//		for(char ch='1'; ch<='9'; ch++) {
//			int count =0;
//			for(int i=0; i<combine.length(); i++) {
//				if(ch==combine.charAt(i)) {
//					count++;
//				}
//			}
//			if(count==0 || count>1) {
//				return false;
//			}
//		}
//		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		if(isFascinating(num)) {
			System.out.println("It is Fascinating ");
		}else {
			System.out.println("It is not Fascinating no.");
		}
	}

}
