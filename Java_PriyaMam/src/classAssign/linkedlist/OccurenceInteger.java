package classAssign.linkedlist;

import java.util.*;

public class OccurenceInteger {

	public static void main(String[] args) {
		
		List<Integer> lkl = new LinkedList<Integer>();
		
		lkl.add(23);
		lkl.add(34);
		lkl.add(34);
		lkl.add(12);
		lkl.add(67);
		lkl.add(45);
		lkl.add(67);
		
//		for(int i=0; i<lkl.size(); i++) {
//			System.out.print(lkl.get(i));
//			if(i!=lkl.size()-1) {
//				System.out.print(", ");
//			}
//		}
		
		
			for(int i=0; i<lkl.size(); i++) {
				int count=0;
				for(int j=0; j<lkl.size(); j++) {
					if(lkl.get(i)==lkl.get(j)) {
						count++;
					}
				}
				System.out.println(lkl.get(i)+" is "+count);
		}
		
		
		
		
		

	}

}
