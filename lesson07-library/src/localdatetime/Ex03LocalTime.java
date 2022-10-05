package localdatetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalTime {
	private static final String PATTERN = "hh:mm:ss a";
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("now:" + now);
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		String text = df.format(now);
		System.out.println(text);
	}

}
