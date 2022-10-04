package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTime {
	public static void main(String[] args) {
		// LocalDtae + LocalTime = LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + now);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("formatted: " + df.format(now));

		// converter

		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		System.out.println("date: " + date);
		System.out.println("time: " + time);
		
		LocalDateTime ldt =  date.atTime(time);
		System.out.println(ldt);

	}
}
