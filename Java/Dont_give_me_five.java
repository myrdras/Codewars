import java.util.stream.IntStream;
public class Dont_give_me_five{
	public static void main(String[] args) {
		System.out.println(dontGiveMeFive(4,17)); 
	}
	public static int dontGiveMeFive(int start, int end) {
		return (int)IntStream.rangeClosed(start,end)
			.filter(n->!String.valueOf(n).contains("5"))
			.count();
	}
}