public class nth_Series_Sum{
	public static void main(String[] args) {
		System.out.println(seriesSum(5)); //1.57
	}
	public static String seriesSum(int n) {
		int i = 1;
		double res = 0;
		while (n > 0) {
			n--;
			res += (double) 1 / i;
			i += 3;
		}
		return (res > 1) ? String.format("%.2f", res)
			: ((res == 0) ? "0.00" : "1.00");
	}
}