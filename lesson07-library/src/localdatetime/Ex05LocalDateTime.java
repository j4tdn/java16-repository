package localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTime {
	
	private static final String PATTERN = "E dd/MM/yyyy , HH:mm:ss";
	
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		String text = dtf.format(now);
		System.out.println("Formatted date: " + text);
		
		
	}
}
