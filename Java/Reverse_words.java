public class Reverse_words{
	public static void main(String[] args) {
		System.out.println(reverseWords("Es Nene muy hermoso"));}
	public static String reverseWords(final String original) {
		char ch[]=original.toCharArray();
    	String rev="";
    	String word="";
    	for(int i=ch.length-1;i>=0;i--){
    		if (ch[i]==' ') {
    			if (rev=="") {
    				if ((ch.length-1)==i) {
    					rev=" ";
    				}else{
    					rev=word;
    				}
    			}else{
    				rev=word+" "+rev;
    			}
    			word="";
    		}else if (i==0) {
    			word+=ch[i];
    			if (rev=="") {
    				rev=word;
    			}else{
    				rev=word+" "+rev;
    			}
    		}else{
    			word+=ch[i];
    		}
		}
		return rev;
	}
}