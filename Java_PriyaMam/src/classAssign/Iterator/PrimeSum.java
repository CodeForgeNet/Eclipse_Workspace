package classAssign.Iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrimeSum {
	
	public static boolean elem( int li) {
//		prime
		for(int i=2; i<=li/2;i++) {
			if(li%i==0) {
				return false;
			}
		}
		return true;	
	
}

public static void main(String[] args) {
	ArrayList<Integer> arl = new ArrayList<Integer>();
	arl.add(2);
	arl.add(9);
	arl.add(12);
	arl.add(3);
	arl.add(56);
	arl.add(11);
	arl.add(67);
	
	ListIterator<Integer> lit = arl.listIterator();
	
	int sum =0;
	while(lit.hasNext()){
		int num = lit.next();
		if(elem(num)) {
			sum+=num;
		}
		
	}
	System.out.println("Sum of Prime number is : "+sum);
	
}

}
