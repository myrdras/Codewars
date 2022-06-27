public class Valid_Phone_Number{
	public static void main(String[] args) {
		System.out.println(validPhoneNumber("(1111)555 2345")); 
	}
	public static boolean validPhoneNumber(String phoneNumber) {
		return phoneNumber.matches("^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$");
	}
}