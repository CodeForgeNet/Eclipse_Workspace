package numberBasedProgram;

import java.util.Scanner;

public class BaseK {
	
	public static void conversion(int n, int k) {
		String res = ""; int a = n;
		while(n>0) {
			int rem = n%k;
			if(rem>=0 && rem<=9) {
				res = rem +res;
			}else {
				res = (char)(rem+87)+res;
			}
			
			n/=k;
		}
		System.out.println("The number "+a+" in base "+k+" value is : "+res);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		System.out.println("Enter base : ");
		int k = sc.nextInt();
		conversion(n,k);
	}
}
