package classAssign.Array;

import java.util.Scanner;
//	 1Q. write a java program to store 5 students marks.

//	2Q. write a java program to store 6 students name in a array with the help of user input as well as display the array elements in a single line seperated by comma.

//	2 Ans :-

public class ArrayQue {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[6];
		for(int index = 0; index<name.length;index++) {
			System.out.print("Enter element at "+index+"index : ");
			name[index] = sc.next();
		}
		
		System.out.println("Display : ");
		for(int index = 0; index<name.length; index++) {
			System.out.print(name[index]);
			if (index < name.length - 1) {
				System.out.print(", ");
			}
			
		}
	
		sc.close();
	}

}
