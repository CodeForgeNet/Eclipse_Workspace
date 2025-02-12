package bitwise;

public class swap_two_var {
	
//	Swap number .

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
//		1st method
		
//		int c = a;
//		a=b;
//		b=c;
		
		
//		2nd method
		
		b = a+b;
		a = b-a;
		b = b-a;
		
		
		
		System.out.println(a);
		System.out.println(b);
		

	}

}
