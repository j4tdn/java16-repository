package localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Ex01LocalDate {
	private static final String PATTERN = "E dd/MM/yyyy";
	
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("now : " + now);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		String text = dtf.format(now);
		System.out.println("Formatted date: " + text);
		
		
		
	}

}
