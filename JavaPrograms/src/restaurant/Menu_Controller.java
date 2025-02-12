package restaurant;

import java.util.LinkedList;
import java.util.List;


public class Menu_Controller {

	public static void main(String[] args) {
		List<Menu> lkd = new LinkedList<Menu>();
		
		lkd.add(new Menu("A","something to eat D1",55.99,"Dessert"));
		lkd.add(new Menu("B","something to eat D2",99.99,"Dessert"));
		lkd.add(new Menu("C","something to eat D3",35.99,"Dessert"));
		
		lkd.add(new Menu("D","something to eat A1",65.99,"appetizer"));
		lkd.add(new Menu("E","something to eat A2",95.99,"appetizer"));
		lkd.add(new Menu("F","something to eat A3",66.99,"appetizer"));
		
		lkd.add(new Menu("G","something to eat M1",299.99,"main course"));
		lkd.add(new Menu("H","something to eat M2",699.99,"main course"));
		lkd.add(new Menu("I","something to eat M3",399.99,"main course"));
		
		
		

	}

}
