public class Highest_Scoring_Word{
	public static void main(String[] args) {
		System.out.println(high("man i need a taxi up to ubud"));//taxi 
	}
	public static String high(String s) {
		String alp = " abcdefghijklmnopqrstuvwxyz";
		String highest = "";
		int score = 0;
		String[] WORDS = s.split(" ");
		for (String word : WORDS) {
			int points = 0;
			for (char c : word.toCharArray()) {
				points += alp.indexOf(c);
			}
			if (points > score) {
				score = points;
				highest = word;
			}
		}
		return highest;
	}
}