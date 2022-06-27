public class Exes_and_Ohs{
	public static void main(String[] args) {
		System.out.println(getXO("xxxXooOo")); 
	}
	public static boolean getXO (String str) {
		int xs = str.replaceAll("[^xX]", "").length();
		int os = str.replaceAll("[^oO]", "").length();
		return xs==os;
	}
}