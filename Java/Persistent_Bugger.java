public class Persistent_Bugger{
	public static void main(String[] args) {
		System.out.println(persistence(39));//3 
	}//because 3*9 = 27, 2*7 = 14, 1*4=4
	public static int persistence(long n) {
		long v = 1, m = n;
		int p = 0;
		while (n>9) {
			v = 1;
			m = n;
			while (m>0) {
				v *= (m%10);
				m /= 10;
			}
			n = v;
			p++;
		}
		return p;
	}
}