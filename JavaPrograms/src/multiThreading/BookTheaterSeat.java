package multiThreading;

public class BookTheaterSeat {

	int total_seats = 10;

// Synchronization using Synchronized method : just add synchronized keyword to that method.
//	synchronized void bookSeats(int seats) {
//		if(total_seats >= seats) {
//			System.out.println(seats+" Seats booked successfully");
//			total_seats -=seats;
//			System.out.println("left seats : "+total_seats);
//		}else {
//			System.out.println("Seats cannot be booked");
//			System.out.println("left seats : "+total_seats);
//		}
//	}
	
	
	
	

//	Synchronization using synchronized block : 
	void bookSeats(int seats) {
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		synchronized (this) {
			if (total_seats >= seats) {
				System.out.println(seats + " Seats booked successfully");
				total_seats -= seats;
				System.out.println("left seats : " + total_seats);
			} else {
				System.out.println("Seats cannot be booked");
				System.out.println("left seats : " + total_seats);
			}
		}
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
		System.out.println("hi : "+Thread.currentThread().getName());
	}
	

}
