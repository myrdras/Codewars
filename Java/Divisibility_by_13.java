public class Divisibility_by_13{
	public static void main(String[] args) {
		System.out.println(thirt(1234567));//87
	}
	public static long thirt(long n) {
		long div[]={1,10,9,12,3,4};
		long c = n;
		long res = 0;
		do {
			n = c;
			int len = String.valueOf(n).length();
			res = 0;
			for (int k=0; k<len; k++) {
				res+= k>5 ? div[(k%6)]*(c % 10)
					: div[k]*(c % 10);
				c /= 10;
			}
			c = res;
		} while (n!=res);
		return res;
	}
}