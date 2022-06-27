import java.util.stream.IntStream;

public class Sum_of_positive{
	public static void main(String[] args) {
		int a[] = {1,-4,7,12};
		System.out.println(sum(a)); 
	}
	public static int sum(int[] arr) {
		return IntStream.of(arr).filter(n -> n >= 0).sum();
	}
}