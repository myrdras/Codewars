import java.util.LinkedList;
public class Playing_with_digits{
	public static void main(String[] args) {
		System.out.println(digPow(89,1)); 
	}
	//a^p + b^(p+1) + c^(p+2) + d^(p+3) + ...) = n * k
	public static long digPow(int n, int p) {
		int i = n;
		LinkedList<Integer> data = new LinkedList<>();
		while (n > 0) {
 			data.push( n % 10 );
			n = n / 10;
 		}
		int n1 = 0;
		for(Integer num : data) {
			n1 += Math.pow(num, p);
			p++;
		}
		int k=n1/i;
		return k*i == n1 ? k : -1;
	}
}