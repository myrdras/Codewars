public class Fibonacci{
	public static void main(String[] args) {
		System.out.println(fib(5)); 
	}
	public static long fib (int n){
		long n1=0,n2=1,n3=0;
		if (n==1) return 1;
		while (n>1) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			n--;
		}
		return n3;
	}
}