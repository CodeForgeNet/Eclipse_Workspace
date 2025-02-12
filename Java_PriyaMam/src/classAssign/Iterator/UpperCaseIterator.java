package classAssign.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class UpperCaseIterator {
	
	public static char chardis(char li) {
		
		if(li>='a' && li<='z') {
			li-=32;
			return li;
		}
		return li;
	}
	
	public static void main(String[] args) {
		ArrayList<Character> arl = new ArrayList<Character>();
		
		arl.add('a');
		arl.add('f');
		arl.add('s');
		arl.add('h');
		arl.add('t');
		arl.add('w');
		arl.add('q');
		
		ListIterator<Character> lit = arl.listIterator();
		
		while(lit.hasNext()) {
			char ch = lit.next();
			
			
			if(chardis(ch)>='A' || chardis(ch)<='Z') {
				System.out.println(chardis(ch));
				
			}
			
			
		}
		
	}

}
