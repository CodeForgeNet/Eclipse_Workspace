package classAssign.sorting;

import java.util.*;

//public class MenuController {  -> (comparable)
	public class MenuController implements Comparator<Menu>{

		@Override
		public int compare(Menu o1, Menu o2) {
			return o1.age - o2.age;
		}
		
	public static void main(String[] args) {
		List<Menu>  al = new ArrayList<Menu>();
		al.add(new Menu("karan",22));
		al.add(new Menu("shiwang",21));
		al.add(new Menu("tushar",20));
		
		Comparator<Menu> cmp = new MenuController();
		
		Collections.sort(al, cmp); // Sort the list using the Comparator
		
//		Collections.sort(al);   
		System.out.println(al);

	}


}
