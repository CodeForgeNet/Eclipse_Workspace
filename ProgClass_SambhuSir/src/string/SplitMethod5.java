package string;

public class SplitMethod5 {
	public static void main(String[] args) {
		String s1 = "a3bc438m7d";
		String[] k = s1.split("[^0-9]+");
		for(String p:k) {
			System.out.println(p);
		}
	}
}
