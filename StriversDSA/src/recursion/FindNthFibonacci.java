package recursion;

import java.util.Scanner;

// 	TC => O(n^2)

public class FindNthFibonacci {
	
	public static int FibonN(int n) {
		if(n <=1) return n;
		
		return FibonN(n-1)+FibonN(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbere : ");
		int num = sc.nextInt();
		System.out.println(FibonN(num));

	}

}
