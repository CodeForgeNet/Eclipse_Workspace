package com.Method;

//Override of non-static method

class Pt {
	void show()
	{
		System.out.println("Parent");
	}
}

//Parent inherit in Child class
class Child extends Pt {

	// override show() of Parent
	void show()
	{
		System.out.println("Child");
	}
}

class GFG {
	public static void main(String[] args)
	{
		Pt p = new Pt();
		// calling Parent's show()
		p.show();

		Pt c = new Child();
		// calling Child's show()
		c.show();
	}
}
