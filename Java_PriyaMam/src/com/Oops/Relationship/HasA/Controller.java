package com.Oops.Relationship.HasA;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj = new Address("B-4", 201301, "Noida", "UP"); // @102

		Trainer t1 = new Trainer("xyz", 565867964988l, obj);

		Student s1 = new Student("abc", 9876543232l, obj);

		s1.displayStudent();

		Trainer t2 = new Trainer("xyz", 565867964988l, new Address("B-4", 201301, "Noida", "UP"));
		
//		t2.displayInfo();
			
	}

}
