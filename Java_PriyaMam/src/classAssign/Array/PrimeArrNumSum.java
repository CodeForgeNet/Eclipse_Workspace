package classAssign.Array;

import java.util.Scanner;

public class PrimeArrNumSum {
	
	public static boolean checkPrime(int a) {
		if(a<=1) {
			return false;
		}else if (a!=2 && a%2==0) {
			return false;
		}else {
			for (int i=2; i<=a; i++) {
				if (a%i==0) {
					return false;
				}
				}
			return true;
			
			}
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum=0;
		for(int i=0; i<num.length; i++) {
			System.out.print("Enter "+(i+1)+" num : ");
			num[i]=sc.nextInt();
			
			if(checkPrime(num[i])==true) {
				sum+=num[i];
			}
			
		}
		System.out.println(sum);
		
		
	}


}
