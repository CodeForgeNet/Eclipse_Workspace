package numberBasedProgram;

import java.math.*;

public class BigInt {
	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("60");
		BigInteger b2 = new BigInteger("50");
		
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(b1.mod(b2));
		System.out.println(b1.max(b2));
		System.out.println(b1.min(b2));
		
	}

}
