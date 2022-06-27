public class Extract_file_name{
	public static void main(String[] args) {
		System.out.println(extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")); 
	}
	public static String extractFileName(String dirtyFileName) {
		return dirtyFileName.replaceAll("^\\d+_|\\.\\w+$", "");
	}
}