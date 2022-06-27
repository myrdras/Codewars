import java.util.List;
import java.util.ArrayList;
public class Escape_the_maze{
	public static void main(String[] args) {
		char[][] d = {
			"###########".toCharArray(),
			"#>        #".toCharArray(),
			"######### #".toCharArray()
		};
		System.out.println(escape(d));
	}
	public static List<Character> escape(char[][] maze) {
		List<Character> res=new ArrayList<Character>();
		res.add(char.indexOf('e'));
		return res;
	}
	private static int[] search(char[][] arry, char start) {
		int[] result={0,0};

		int j=0;

		int numberOfArrays=arry.length;

		if(numberOfArrays<=0)
			return result;

		for(int i=0; i<arry.length;i++) {
			j=maze.indexOf('e');
			j=Arrays.binarySearch(arry[i], start);
			if(j>-1) {
				result.width=i;
				result.height=j;
				break;
			}
		}

		return result;
	}
}