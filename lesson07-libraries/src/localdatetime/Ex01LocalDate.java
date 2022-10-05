package localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDate {
	private static final String PATTERN = "dd/MM/yyyy E";

	public static void main(String[] args) {
		// date, month, year, ...

		LocalDate now = LocalDate.now();
		System.out.println("now: " + now);

		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		String text = df.format(now);
		System.out.println("formatted date: " + text);
	}
}
