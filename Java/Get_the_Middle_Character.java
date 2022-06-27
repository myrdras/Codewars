public class Get_the_Middle_Character{
	public static void main(String[] args) {
		System.out.println("middle"); 
	}
	public static String getMiddle(String word) {
		int len= (word.length()%2==1) ? word.length()/2 : (word.length()/2)-1;
		return word= word.length()%2==1 ? Character.toString(word.charAt(len))
			: Character.toString(word.charAt(len))+Character.toString(word.charAt(len+1));
	}
}