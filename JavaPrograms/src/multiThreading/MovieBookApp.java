package multiThreading;

public class MovieBookApp extends Thread{
	static BookTheaterSeat b;
	int seats;
	public void run() {
		b.bookSeats(seats);
	}
	
	public static void main(String[] args) {
		b = new BookTheaterSeat();
		
		MovieBookApp sam = new MovieBookApp();
		sam.seats =7;
		sam.start();
		
		MovieBookApp tom = new MovieBookApp();
		tom.seats = 6;
		tom.start();
	}
}
