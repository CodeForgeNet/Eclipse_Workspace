package com.Abstr_Inter;

import java.util.*;

public class CompratorOverride {
	public static void main(String[] args) {
		List<Menu> li = new ArrayList<Menu>();
		
		li.add(new Menu(1));
		li.add(new Menu(12));
		li.add(new Menu(14));
		li.add(new Menu(51));
		li.add(new Menu(21));
		
		
		Comparator<Menu> cmp = new Comparator<Menu>() {
			public int compare(Menu o1, Menu o2) {
				return o1.age - o2.age;
			}
		};
		
		Collections.sort(li,cmp);
		System.out.println(li);
		
	}
}

class Menu{
	int age;
	public Menu(int age) {
		this.age = age;
	}
	
	public String toString() {
		return " Age : "+ this.age+" ";
	}
}