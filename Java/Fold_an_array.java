public class Fold_an_array{
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 3, 4, 5 };
		input = foldArray(input, 1);
		for (int s : input) {
			System.out.println(s);
		}
	}
	public static int[] foldArray(int[] array, int runs) {
		for (int r=0; r<runs; r++) {
			int al = array.length-1;
			int[] a = new int[al/2+1];
			for (int i=0; i<al/2.0; i++) {
				a[i] = array[i] + array[al-i];
			}
			if (al%2==0) 
				a[a.length-1] = array[a.length-1];
			array = a;
		}
		return array;
	}
}