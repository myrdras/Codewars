public class Total_Points{
	public static void main(String[] args) {//30
		String[] gg = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
		System.out.println(points(gg)); 
	}
	public static int points(String[] games) {
		int p = 0;
		for (String str : games) {
			int x = Character.getNumericValue(str.charAt(0));
			int y = Character.getNumericValue(str.charAt(2));
			if (x>y) p+=3;
			if (x<y) p+=0;
			if (x==y) p+=1;
		}
		return p;
	}
}