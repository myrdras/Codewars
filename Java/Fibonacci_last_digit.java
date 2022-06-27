public class Fibonacci_last_digit{
	public static void main(String[] args) {
		System.out.println(getFibNumb(15)); 
	}
	public static int getFibNumb(int n) {
		int n1=0,n2=1,n3=0;
		while (n>1) {
			n3=(n1+n2)%10;
			n1=n2;
			n2=n3;
			n--;
		}
		return n3;
	}
}