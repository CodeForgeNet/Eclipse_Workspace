package multiThreading;

public class Testt implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable thread.");
	}
	public static void main(String[] args) {
		Testt t = new Testt();
		Thread th = new Thread(t);
		th.run();
	}
}
