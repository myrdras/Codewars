public class Vasya_Clerk{
	public static void main(String[] args) {
		int[] p={25, 25, 25, 25, 50, 100, 50};
		System.out.println(Tickets(p)); 
	}
	public static String Tickets(int[] peopleInLine) {
		int in25 = 0, in50 = 0;
		for (int cash : peopleInLine) {
			if (cash==25) in25++;
			if (cash==50) {
				in25--;
				in50++;
			}
			if (cash==100) {
				if (in50>0) {
					in50--;
					in25--;
				}else {
					in25-=3;
				}
			}
			if (0>in25) return "NO";
		}
		return "YES";
	}
}