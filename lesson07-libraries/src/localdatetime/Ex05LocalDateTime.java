package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTime {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	public static void main(String[] args) {
		//LocalDate + LocalTime = LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Now: " +now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		System.out.println("Formatted: " + df.format(now));
		
		
		//converter 
		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		System.out.println("Date : " +date);
		System.out.println("Time : " +time);
		
		date.atTime(time);
		
		
		
	}
}
