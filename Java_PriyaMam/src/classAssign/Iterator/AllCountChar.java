package classAssign.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class AllCountChar {
	
	static int vCtUpper = 0;
	static int cCtUpper = 0;
	static int vCtLower = 0;
	static int cCtLower = 0;
	static int dCt = 0;
	static int spaceCt= 0;
	
	public static void disp(char li) {
		
		if(li>='a' && li<='z') {
			if(li=='a' || li=='e' || li=='i' || li=='o' || li=='u') {
				vCtLower++;
				
			}else {
				cCtLower++;
				
			}
			
		}else if(li>='A' && li<='Z') {
			if(li=='A' || li=='E' || li=='I' || li=='O' || li=='U') {
				vCtUpper++;
				
			}else {
				cCtUpper++;
				
			}
		}else if(li==' ') {
			spaceCt++;
			
		}else if(li>='0' && li<='9') {
			dCt++;
			
		}
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Character> arl = new ArrayList<Character>();
		arl.add('e');
		arl.add(' ');
		arl.add('i');
		arl.add('j');
		arl.add('e');
		arl.add('4');
		arl.add(' ');
		arl.add('7');
		arl.add('D');
		arl.add('4');
		arl.add('S');
		arl.add('4');
		
		ListIterator<Character> lit = arl.listIterator();
		
		while(lit.hasNext()) {
			char ch = lit.next();
			disp(ch);
			
		}
		
		System.out.println("LowerCase Vowels : "+vCtLower);
		System.out.println("LowerCase Consonant : "+cCtLower);
		System.out.println("UpperCase Vowels : "+vCtUpper);
		System.out.println("UpperCase Consonant : "+cCtUpper);
		System.out.println("Total Digits : "+dCt);
		System.out.println("Total Spaces : "+spaceCt);
		
		
	}

}
