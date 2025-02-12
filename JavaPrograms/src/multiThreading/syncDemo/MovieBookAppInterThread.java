package multiThreading.syncDemo;


class TotalEarnings extends Thread{
	int total = 0;
	public void run() {
		synchronized (this) {
			
		for(int i=1; i<=10; i++) {
			total+=100;
		}
		this.notify();
		}
	}
}

public class MovieBookAppInterThread {
	public static void main(String[] args) throws InterruptedException{
		TotalEarnings te = new TotalEarnings();
		te.start();
//		System.out.println("Total Earnings : "+te.total);
		
		
//		Here we achieve synchronization but first we have to provide synchronized block in TotalEarnings Class to the FOR loop in run().
		synchronized (te) {
			te.wait();
			System.out.println("Total Earnings : "+te.total+ " Rs");  //we can write here or outside of this block.
		}
		
	}
}
