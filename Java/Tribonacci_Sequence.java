import java.util.Arrays;
public class Tribonacci_Sequence{
	public static void main(String[] args) {
		double[] a ={1,1,1};
		System.out.println(Arrays.toString(tribonacci(a, 10))); 
	}
	public static double[] tribonacci(double[] s, int n) {
		double[] res = Arrays.copyOf(s, n);
		int i = 0;
		while (n>n-s.length) {
			res[i+3]=res[i]+res[i+1]+res[i+2];
			i++;
			n--;
		}
		return res;
	}
}