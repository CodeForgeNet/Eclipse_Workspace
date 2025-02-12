package multiThreading;

public class TestJoin extends Thread{

	public void run() {
		try {

			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread : " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException{
		
		TestJoin tj = new TestJoin();
		tj.start();
		tj.join(); // we have to throws InterruptedException
		
		try {
			for(int i=1; i<=5; i++) {
				System.out.println("main thread : "+i);
				Thread.sleep(1000);
//				tj.join();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
