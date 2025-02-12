package com.List;

import java.util.*;

public class Add_Display {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();
		li.add("Karan");
		li.add("Arjun");
		li.add("Krishna");
		System.out.println(li);
		// Remove
		li.remove(1);
		System.out.println(li);
		//Replace
		li.set(0, "elem1");
		System.out.println(li);
	}
}
