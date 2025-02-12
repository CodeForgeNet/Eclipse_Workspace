package classAssign.String;

import java.util.Scanner;

public class LastIndexOf {
	
	public static int lastIndexof(String st, char ch) {
		for(int i=st.length()-1; i>=0; i--) {
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
		
		System.out.println("Last Index of '"+ch+"' in '"+str+"' is : "+lastIndexof(str, ch));
	
		sc.close();
	}

}
