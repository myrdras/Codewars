public class Arithmetic_Function{
	public static void main(String[] args) {
		System.out.println(arithmetic(8, 2, "subtract")); 
	}
	public static int arithmetic(int a, int b, String operator) {
		int c = 0;
		switch(operator){
		case "add": c = a+b;
			break;
		case "subtract": c = a-b;
			break;
		case "multiply": c = a*b;
			break;
		case "divide": c = a/b;
			break;
		}
		return c;
	}
}