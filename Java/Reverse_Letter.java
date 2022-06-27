import java.lang.StringBuilder;

public class Reverse_Letter{
	public static void main(String[] args) {
		System.out.println(reverseLetter("ultr53o?n"));
	}
	public static String reverseLetter(final String str) {
		char ch[]=original.toCharArray();
		String rev = new StringBuilder(str).reverse();
		return rev.replaceAll("[^a-z]", "");
	}
}