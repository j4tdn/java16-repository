package localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDate {
	private static final String PATTER = "dd/MM/yyyy";
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("Now: " + now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTER);
		String text =df.format(now);
		System.out.println("Formatted date: " + text);
	}
}
