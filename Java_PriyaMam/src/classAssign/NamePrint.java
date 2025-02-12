package classAssign;

import java.util.Scanner;

public class NamePrint {
	
	public static void printName(String name) {
		
		int len = name.length();
		int index = 0;
		for(int i=1;i<=len; i++) {
			for(int j=1; j<=i; j++) {
				if(index<len ) {
					System.out.print(name.charAt(index)+" ");
					
				}else {
					System.out.print("* ");
				}
				index++;
			}
			System.out.println();
			if(index>=name.length()) {
				break;
			}
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name:- ");
		String name = sc.nextLine();
		
		printName(name);
		
		
		sc.close();
	}
}
