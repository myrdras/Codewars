import java.lang.StringBuilder;
public class Stop_gninnipS_My_sdroW{
	public static void main(String[] args) {
		System.out.println(spinWords("Hey fellow warriors"));
	}
	public static String spinWords(String sentence) {
		String[] arr = sentence.split(" ");
		int i = 0;
		for(String aword : arr){
			if (aword.length()>=5) arr[i]= new StringBuilder(aword).reverse().toString();
			i++;
		}
		return String.join(" ",arr);
	}
}