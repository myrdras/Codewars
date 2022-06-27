import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Dubstep{
	public static void main(String[] args) {
		System.out.println(reverseWords("WUBWUBABCWUB"));
	}
	public static String SongDecoder (String song) {
		String[] array = song.replace("WUB"," ").trim().split(" ");
		return Stream.of(array)
			.filter(s -> s != null && !s.isEmpty())
			.collect(Collectors.joining(" "));
	}
}