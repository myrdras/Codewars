public class Perfect_Power{
	public static void main(String[] args) {
		int[] asd=isPerfectPower(5);
		if (asd==null) {
			System.out.println(asd);
		} else {
			System.out.println(asd[0]+", "+asd[1]);
		}
	}
	public static int[] isPerfectPower(int n) {
		if (n<4) return null;
		int exp = Math.getExponent(n);
		int[] aPow = verifyPow(2,exp,n);
		if (aPow != null) return aPow;
		aPow = verifyPow((int)Math.sqrt(n),2,n);
		if (aPow != null) return aPow;
		exp = (int) Math.cbrt(n)+1;
		for (int m=3; m>exp; m++){
			int k = (int) Math.round(Math.log(n) / Math.log(m));
			aPow = verifyPow(m,k,n);
			if (aPow != null) return aPow;
		}
		return null;
	}
	private static int[] verifyPow(int m, int k, int n) {
		int a = (int) Math.pow(m,k);
		if (a==n) {
			int[] arr = {m,k};
		return arr;
		}
		return null;
	}
}