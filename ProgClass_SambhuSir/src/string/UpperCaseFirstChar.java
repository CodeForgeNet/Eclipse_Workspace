package string;

// 	WAJP to convert the first character of each word of a string into upper case.
// ex : mohan Is here since 10am, o/p: Mohan Is Here Since 10am.

public class UpperCaseFirstChar {
	public static String convertUpperCase(String s1) {
		String result = " ";
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if((i==0 && ch!=' ' || s1.charAt(i-1)==' ' && ch!=' ') && (ch>=97 && ch<=124)) {
				result = result +(char)(ch-32);
			}else {
				result = result+ch;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String s = "mohan Is here since 10am ";
		String ss = convertUpperCase(s);
		System.out.println(ss);
	}
}
