package numberBasedProgram;

import java.util.Scanner;

public class Pascal_Tri_pattern {
	
	public static void getPascal(int m) {
		
		for(int n =0; n<m; n++) {
			
		for(int x=0; x<n; x++) {
			int comb =1;
			for(int i=0; i<x; i++) {
				comb =comb*(n-i-1)/(i+1);
			}
			System.out.print(comb+" ");
		}
		System.out.println();
		}
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter n : ");
			int n = sc.nextInt();
			
			getPascal(n);
			
			sc.close();
		}

}

// result is right but pattern you have to correct !!
