public class Buddy_Pairs{
	public static void main(String[] args) {
		System.out.println(buddy(381, 4318)); //(1050 1925)
	}
    //Divisors of 48 are: 1, 2, 3, 4, 6, 8, 12, 16, 24 --> sum: 76 = 75 + 1
    //Divisors of 75 are: 1, 3, 5, 15, 25 --> sum: 49 = 48 + 1
	public static String buddy(long start, long limit) {
		do {
			long n = 1;
			long m = 1;
			long s = 0;
			long f = 0;
			long max = (long)Math.sqrt(start);
			for (int i = 2; i <= max; i++) {
				if (start % i == 0) {
					m += i;
					long r = start/i;
					if (r!=i) m+=r;
					if (s==0) {
						n=i;
						f = r;
						s++;
					}
				}
			}
			s = 1;
			m -= 1;
			long maxM = (long)Math.sqrt(m);
			for (int j=2; j<=maxM; j++) {
				if (m % j == 0) {
					s += j;
					long r = m/j;
					if (r!=j) s+=r;
				}
			}
			n*=f;
			if ( (s-1==n) && (n>=start) && (n<m) ) {
				return "("+String.valueOf(n)+" "+String.valueOf(m)+")";
			}
			start++;
		} while (start<=limit);
		return "Nothing";
	}
}