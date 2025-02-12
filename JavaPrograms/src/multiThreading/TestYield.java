package multiThreading;

public class TestYield extends Thread{
	public void run() {
		Thread.yield();
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	public static void main(String[] args) {
		TestYield ty = new TestYield();
		ty.start();
		
//		If you want main method to stop and provide chance to other threads for execution :-
//		Thread.yield(); 
		
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}
