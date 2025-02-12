package numberBasedProgram;

import java.util.Scanner;

/*
 "3ac" => ?
 "4h3" => not a valid hex no.
()base16 = ()base10
 */


public class Hexadeci_to_decimal {
	
	public static void getDecimal(String s) {
		int dec = 0; int mul = 1;
		for(int i=s.length()-1;i>=0; i--) {
			char p = s.charAt(i);
			if(p>='0' && p<='9') {
				dec = dec+(p-48)*mul;
			}else if(p>='A' && p<='F') {
				dec = dec+(p-55)*mul;
			}else if(p>='a' && p<='f') {
				dec = dec+(p-87)*mul;
			}else {
				System.out.println("not a valid hexadecimal");
				return;
				
			}
			
			mul*=16;
		}
		System.out.println(dec);
		
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary no.");
		String s = sc.next();
		getDecimal(s);
		sc.close();
	}
}
