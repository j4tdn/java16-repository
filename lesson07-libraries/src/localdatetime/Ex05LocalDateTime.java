package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now" + now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("formatted:" + df.format(now));
		LocalDate date = now .toLocalDate();
		
	}

}
