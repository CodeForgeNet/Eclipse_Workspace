package classAssign.sorting;

//public class Menu implements Comparable<Menu>{
public class Menu {

	String name;
	int age;

	public Menu(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int compareTo(Menu o) {
//		return this.age - o.age;
//	}
	

	@Override
	public String toString() {
		return "[" + "name : " + this.name + " Age : " + this.age + "]";
	}


}
