package com.Constructor;

public class HasA {
	public static void main(String[] args) {
		Engine engine = new Engine();
		engine.start();
	}
	
}

class Engine {
	void start() {
		System.out.println("Engine started");
	}
}
