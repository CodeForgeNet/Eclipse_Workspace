package string;

import java.util.Scanner;

//WAJP to take a string input and remove all the duplicate characters and store in another string.

//Note : jab v integer ki jarurat hogi then it char conver into ASCII value.

public class DupliCharStore {

//	public static void removeDuplicate(String s1) {
//		int[] x = new int[256];
//		for (int i = 0; i < s1.length(); i++) {
//			x[s1.charAt(i)]++;
//		}
//
//		for (int i = 0; i < x.length; i++) {
//			if (x[i] > 0) {
//				System.out.print((char)i);
////				System.out.println((char) i + " is " + x[i] + " Times");
//			}
//		}
//
//	}

//	Print unique 
//	public static void removeDuplicate(String s1) {
//		int[] x = new int[256];
//		for (int i = 0; i < s1.length(); i++) {
//			x[s1.charAt(i)]++;
//		}
//
//		for (int i = 0; i < x.length; i++) {	
//			if (x[i] ==1) {
//				System.out.print((char)i);
//			}
//		}
//
//	}
	
	
//	2nd way
	public static void removeDuplicate(String s1) {
		String res="";
		for(int i=0;i<s1.length();i++) {
			String k=s1.charAt(i)+"";
			if(!res.contains(k)) {
				res = res+k;
			}
		}
		System.out.println(res);

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = sc.nextLine();
		removeDuplicate(s1);
		
		sc.close();
	}

}
