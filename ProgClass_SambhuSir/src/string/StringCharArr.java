package string;

public class StringCharArr {
	public static void main(String[] args) {

		String s1 = "mohan and sohan";

// Run a loop on string in forward direction.
		
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
// Run a loop on string in forward direction.

		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
	}
}


