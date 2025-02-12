package com.List;

import java.util.*;

public class Iterate_Vector {
	public static void main(String[] args) {
		
	Vector<String> vt = new Vector<String>();
	vt.add("elem1");
	vt.add("elem2");
	vt.add("elem3");
	
	
	//Iterate
	Iterator<String> it = vt.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	//Push & Pop
	Stack<String> sta = new Stack<String>();
	for(String p:vt) {
		sta.push(p);
	}
	System.out.println(sta);
	System.out.println(sta.pop());
	
	}
}
