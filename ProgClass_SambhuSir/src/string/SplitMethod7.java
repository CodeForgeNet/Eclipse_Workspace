package string;

// Split("\\d")

public class SplitMethod7 {
	public static void main(String[] args) {
		String s1 = "7234p34ce88ac876e";
		String [] k = s1.split("\\D+");
		for(String p:k) {
			System.out.println(p);
		}
	}
}
