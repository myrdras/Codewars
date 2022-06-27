public class Bit_Counting{
	public static void main(String[] args) {
		System.out.println(countBits(1234)); //5
	}
	public static int countBits(int n) {
		int c = 0;
		while(n != 0) {
			c += n%2;
			n = n/2;
		}
		return c;
	}
}