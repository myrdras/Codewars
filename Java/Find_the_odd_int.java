import java.util.*; //para hashset
import java.util.stream.Collectors;
/*import java.util.HashMap; //para hashmap
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;*/
public class Find_the_odd_int{
	public static void main(String[] args) {
		int[] input = new int[] { 1,1,2,-2,5,2,4,4,-1,-2,5 };
		System.out.println(findIt(input)); 
	}
	public static int findIt(int[] a) {
		List<Integer> arr = Arrays.stream(a).boxed().collect(Collectors.toList());
		Set<Integer> st = new HashSet<Integer>(arr);
		for (Integer s : st)
			if (Collections.frequency(arr, s)%2==1)
				return s;
		return 0;
		/*// hashmap to store the frequency of element 
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
  
		for (int i : a) {
			Integer j = hm.get(i);
			hm.put(i, (j == null) ? 1 : j + 1);
		}
  
		// displaying the occurrence of elements in the arraylist 
		for (Map.Entry<Integer,Integer> val : hm.entrySet()) {
			if (val.getValue()%2==1) {
				return val.getKey();
			}
		}
		return 0;*/
	}
}