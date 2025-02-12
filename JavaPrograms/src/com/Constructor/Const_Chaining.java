package com.Constructor;

public class Const_Chaining {
		private int x;
		private int y;

		// First constructor
		public Const_Chaining(int x) {
			this.x = x;
		}

		// Second constructor
		public Const_Chaining(int x, int y) {
			this(x); // calling the first constructor
			this.y = y;
		}

		public void display() {
			System.out.println("x = " + x + ", y = " + y);
		}

		public static void main(String[] args) {
			Const_Chaining test = new Const_Chaining(10, 20);
			test.display();
		}
	}
