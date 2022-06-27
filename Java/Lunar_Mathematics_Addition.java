public class Lunar_Mathematics_Addition{
	public static void main(String[] args) {
		System.out.println(add(99,11085));//11099
	}
	public static long add(long n1, long n2) {
		long res = 0;
		int p = 1;
		while (n1>0 || n2>0) {
			res+= n1%10>n2%10 ? (n1%10)*p : (n2%10)*p;
			n1 /= 10;
			n2 /= 10;
			p *= 10;
		}
		return res;
	}
}