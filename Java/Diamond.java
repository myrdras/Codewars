public class Diamond{
	public static void main(String[] args) {
		System.out.println(print(5)); 
	}
	public static String print(int n) {
		if (n%2==0 || n<0) return null;
		String d = "";
		int c1=1, c2=0;
		for (int i=0; i<n; i++) {
			for (int x=n/2-c2; x>0; x--) {
				d+= " ";
			}
			c2= i<n/2 ? c2+1 : c2-1;
			for (int a=0; a<c1; a++) {
				d+= "*";
			}
			c1= i<n/2 ? c1+2 : c1-2;
			d+="\n";
		}
		return d;
	}
}