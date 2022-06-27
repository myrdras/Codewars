import java.util.*;
import java.util.stream.*;
public class Integer_depth{
	public static void main(String[] args) {
		System.out.println(computeDepth(42)); 
	}
	public static int computeDepth(int n) {
		int i = 1, digits = 0;
		List<Integer> dlist = new ArrayList<Integer>();
		do {
			digits = n*i;
			for (char c : ("" + digits).toCharArray()) {
				dlist.add(Character.getNumericValue(c));
			}
			dlist = dlist.stream()
				.distinct()
				.collect(Collectors.toList());
			i++;
		} while ( dlist.size()<10 );
		return i-1;
	}
}