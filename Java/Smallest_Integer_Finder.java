import java.util.Arrays;

public class Smallest_Integer_Finder{
	public static void main(String[] args) {
		int b[]={34, 15, 88, 2};
		System.out.println(findSmallestInt(b));
	}
	public static int findSmallestInt(int[] args) {
		Arrays.sort(args);
		int n = args[0];
		return n;
	}
}