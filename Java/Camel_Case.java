import java.lang.StringBuilder;
public class Camel_Case{
	public static void main(String[] args) {
		System.out.println(toCamelCase("the_Stealth_Warrior")); 
	}
	public static String toCamelCase(String s) {
        if (s=="") return s;
        String[] arr = s.split("[_-]");
        StringBuilder sb=new StringBuilder();
        for (String up : arr) {
            String camel = up.substring(0, 1).toUpperCase() + up.substring(1);
            sb.append(camel);
        }
        sb.replace(0, 1, Character.toString(s.charAt(0)));
        return sb.toString();
	}
}