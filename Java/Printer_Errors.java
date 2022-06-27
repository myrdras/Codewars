public class Printer_Errors{
	public static void main(String[] args) {
		System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")); 
	}//"3/56"
	public static String printerError(String s) {
		int len = s.length();
		int count = len - s.replaceAll("[n-z]","").length();
		return count+"/"+len;
	}
}