import java.util.Arrays;
public class Mumbling{
	public static void main(String[] args) {
		System.out.println(accum("cwAt")); 
	}
	public static String accum(String s) {
		int i = 0;
		String[] letters = new String[s.length()];
		for (char c : s.toCharArray()) {
			char[] repeat = new char[i];
			Arrays.fill(repeat, Character.toLowerCase(c));
			letters[i] = String.valueOf(Character.toUpperCase(c));
			letters[i] += new String(repeat);
			i++;
		}
		return String.join("-",letters);
	}
}