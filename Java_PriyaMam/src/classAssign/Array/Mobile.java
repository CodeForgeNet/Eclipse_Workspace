package classAssign.Array;

// wajp to store 5 mobile objects in an array and perform the following task.
// task1 : display the product details whose id is even.
//task2: display the product name that starts with a vowel.
// task3 : find out the highest price product .
// task4 : display the lowest price product 

public class Mobile {
	
	String brand;
	byte id;
	float price;
	
	public Mobile(String brand, byte id, float price) {
		this.brand=brand;
		this.id=id;
		this.price=price;
		
	}
	
	@Override
	public String toString() {
		return "[" + brand + ", "+ id +", "+price+ "]";
	}
	
	

}
