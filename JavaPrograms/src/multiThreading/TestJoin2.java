package multiThreading;

public class TestJoin2 extends Thread{
	static Thread mainThread;
	
	public void run() {
		try {
			
			mainThread.join();
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("child thread : " + i); 
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException{
		
		mainThread = Thread.currentThread();
		TestJoin2 tj = new TestJoin2();
		tj.start();
		
		try {
			for(int i=1; i<=5; i++) {
				System.out.println("main thread : "+i);
				Thread.sleep(1000);
//				tj.interrupt();  //Interrupt exception throw cause it interrupt sleep method in run().
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
