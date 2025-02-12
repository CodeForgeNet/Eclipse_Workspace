package multiThreading;

public class Try {
	public static void main(String[] args) {
		System.out.println("Hello");
//		System.out.println("Original thread name : "+Thread.currentThread().getName());
		
		Thread.currentThread().setName("karan");
//		System.out.println("Rename thread name : "+Thread.currentThread().getName());
		
		System.out.println(10/0);
	}

}
