package multiThreading.syncDemo;


class BookTheaterSeat{
	static int total_seats = 20;
	
//	In MovieBookApp we created two object and each got 20 seats. so, we have to provide static synchronized to have 20 seats total for all the objects i created. And make the variable static also.
	static synchronized void bookSeats(int seats) {
		if(total_seats >=seats) {
			System.out.println(seats+" seats book successfully");
			total_seats = total_seats - seats;
			System.out.println("Seats left : "+total_seats);
		}else {
			System.out.println(seats+" seats  cannot be booked");
			System.out.println("seats left : "+total_seats);
		}
	}
}


class MyThread1 extends Thread {
	BookTheaterSeat b;
	int seats ;
	MyThread1(BookTheaterSeat b , int seats){
		this.b = b;
		this.seats = seats;
	}
	
	public void run () {
		b.bookSeats(seats);
	}
	
}


class MyThread2 extends Thread {
	BookTheaterSeat b;
	int seats ;
	MyThread2(BookTheaterSeat b , int seats){
		this.b = b;
		this.seats = seats;
	}
	
	public void run () {
		b.bookSeats(seats);
	}
	
}



public class MovieBookApp {
	public static void main(String[] args) {
		
		BookTheaterSeat b1 = new BookTheaterSeat();
		MyThread1 t1 = new MyThread1 (b1,7);
		t1.start();
		MyThread2 t2 = new MyThread2(b1,6);
		t2.start();
		
		
		BookTheaterSeat b2 = new BookTheaterSeat();
		MyThread1 t3 = new MyThread1(b2,5);
		t3.start();
		MyThread2 t4 = new MyThread2(b2,4);
		t4.start();
		
	}
}



