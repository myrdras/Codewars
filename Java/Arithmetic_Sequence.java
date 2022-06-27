public class Arithmetic_Sequence{
	public static void main(String[] args) {
		System.out.println(nthterm(0, 55, 1)); 
	}
	public static int nthterm(int first, int n, int c) {
		for (int i=0; i<n; i++) {
			first = first + c;
		}
		return first;
	}
}