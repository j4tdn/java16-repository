package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTime {
	private static final String PATTERN = "dd/MM/yyyy'T'HH:mm:ss";
	public static void main(String[] args) {
		// LocalDate + LocalTime = LocalDateTime
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: "+ now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		System.out.println("formatted: " + df.format(now));
		
		// converter
		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		System.out.println("date: " + date);
		System.out.println("time: " + time);
		
		//date --> datetime
		System.out.println(date.atTime(time));
	}

}
