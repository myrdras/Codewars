public class Your_order_please{
	public static void main(String[] args) {
		System.out.println(order("is2 Thi1s T4est 3a"));
	}
	public static String order(String words) {
		String[] arr = words.split(" ");
		String[] res = arr.clone();
    	int n = 1;
    	for (int i=0; i<arr.length; i++) {
    		if (arr[i].indexOf(String.valueOf(n)) > -1) {
    			res[n-1] = arr[i];
    			n++;
    			i=-1;
    		}
    	}
		return String.join(" ",res);
	}
}