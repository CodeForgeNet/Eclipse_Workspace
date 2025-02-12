package classAssign.String;

import java.util.Scanner;

public class IndexOf {
	public static int indexof(String st, char ch) {
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string : ");
		String str = sc.next();
		
		System.out.print("Enter character : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("Index of '"+ch+"' in '"+str+"' is : "+indexof(str, ch));
	
		sc.close();
	}

}
