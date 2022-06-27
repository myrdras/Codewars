public class Detect_Pangram{
	public static void main(String[] args) {
		System.out.println(check("You shall not pass!"));//false 
	}
	public static boolean check(String sentence) {
		for (char c = 'a'; c <= 'z'; c++) {
			if (!sentence.toLowerCase().contains(c + "")) return false;
		}
		return true;
	}
}