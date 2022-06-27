import java.util.*;
public class Count_smiley_faces{
	public static void main(String[] args) {
		List<String> a =  new ArrayList<String>();
		//a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
		//a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
		a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
		System.out.println(countSmileys(a));
	}
	public static int countSmileys(List<String> arr) {
		int ans = 0;
		for (String s : arr) {
			if (s.length()<4)
				if (s.matches("^[:;][-~][)D]|^[:;][)D]")) ans++;
		}
		return ans;
	}
}