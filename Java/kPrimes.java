import java.util.*;
import java.util.stream.*;
public class kPrimes{
	public static void main(String[] args) {
		long[] input = new long[0];
		input = countKprimes(3, 0, 100);
		for (long s : input) {
			System.out.println(s);
		}
	}
	public static long[] countKprimes(int k, long start, long end) {
		List<Long> nums = new ArrayList<Long>();
		for (long n = start; n <= end; n++) {
			if (n < 2) n = 2;
			if (isKprime(k, n) > 0)
				nums.add(n);
		}
		return nums.stream().mapToLong(l -> l).toArray();
	}
	public static int puzzle(int s) {
		long[] a = countKprimes(1, 0, s);
		long[] b = countKprimes(3, 0, s);
		long[] c = countKprimes(7, 0, s);
		List<Long> sol = new ArrayList<Long>();
		int la = a.length, lb = b.length, lc = c.length;
		for (int i = 0; i < la; ++i) {
			for (int j = 0; j < lb; ++j) {
				max: for (int m = 0; m < lc; ++m) {
					long res = a[i] + b[j] + c[m];
					if ((int)res > s) break max;
					sol.add(res);
				}
			}
		}
		return (int) sol.stream()
							.filter(z -> z == s)
							.count();
	}
	public static long isKprime(int k, long n) {
		long f = n;
		List<Long> factors = new ArrayList<Long>();
		while (f % 2 == 0) {
			factors.add(2L);
			f /= 2;
		}
		for (long i = 3; i <= Math.sqrt(f); i += 2) {
			while (f % i == 0) {
				factors.add(i);
				f /= i;
			}
		}
		if (f > 2) factors.add(f);
		return (factors.size() == k) ? n : 0;
		/*BigInteger x = new BigInteger("2");
		long totalFactors = 1;
		while (x.multiply(x).compareTo(number) <= 0) {
			int power = 0;
			while (number.mod(x).equals(BigInteger.ZERO)) {
				power++;
				number = number.divide(x);
			}
			totalFactors *= (power + 1);
			x = x.add(BigInteger.ONE);
		}
		if (!number.equals(BigInteger.ONE)) {
			totalFactors *= 2;
		}
		return totalFactors;*/
	}
}