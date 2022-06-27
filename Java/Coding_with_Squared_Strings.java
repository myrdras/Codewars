import java.util.Arrays;
public class Coding_with_Squared_Strings{
	public static void main(String[] args) {
		System.out.println(code("This is a test"));
		System.out.println(decode(code("This is a test")));
	}
	public static String code(String s) {
		int n = 0;
		while ( n*n < s.length() )
			n++;
		while ( n*n > s.length() )
			s+= '\013';
		String[] cSplit = s.split("(?<=\\G.{"+n+"})");
		String[] cArr = new String[n];
		Arrays.fill(cArr, "");
		for(String sWord : cSplit){
			int i = 0;
			for (char c : sWord.toCharArray()) {
				cArr[i] += c;
				i++;
			}
		}
		int i = 0;
		for (String arrWord : cArr ) {
			cArr[i] = new StringBuilder(arrWord).reverse().toString();
			i++;
		}
		return String.join("\n",cArr);
	}
	public static String decode(String s) {
		String[] dSplit = s.split("\n");
		String[] dArr = new String[dSplit.length];
		Arrays.fill(dArr, "");
		int i = 0;
		for (String arrWord : dSplit ) {
			dSplit[i] = new StringBuilder(arrWord).reverse().toString();
			i++;
		}
		for(String sWord : dSplit){
			int j = 0;
			for (char c : sWord.toCharArray()) {
				dArr[j] += c;
				j++;
			}
		}
		return String.join("",dArr).trim();
	}
}