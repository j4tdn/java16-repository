package localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDate {
	private static final String PATTERN = "dd/MM/yyy HH:mm:ss";

	public static void main(String[] args) {
		// day, month, year -> LocalDate
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + now);

		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		String text = df.format(now);
		System.out.println("formated now: " + text);
	}
}
