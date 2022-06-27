public class Word_a10n_abbreviation{
	public static void main(String[] args) {
		System.out.println(abbreviate("internationalization"));//i18n
	}
	public static String abbreviate(String string) {
		String[] words = string.split("[^a-zA-Z]");
		StringBuilder sb = new StringBuilder(string);
		int i = 0;
		for (String w : words) {
			int wl = w.length();
			if (wl>=4) {
				String aw = w.charAt(0)+String.valueOf(wl-2)+w.charAt(wl-1);
				sb.replace(i,i+wl,aw);
				i+= (wl>11) ? 5 : 4;
			} else { i+= wl+1; }
		}
		return sb.toString();
	}
}