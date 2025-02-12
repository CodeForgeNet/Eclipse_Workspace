package string;

public class SplitMethod3 {
	public static void main(String[] args) {
		String s1 = "ab@cd3e$def!aa@p#eef";
		String [] k = s1.split("^[@$!#]");
		for(String p:k) {
			System.out.println(p);
		}
	}
}
