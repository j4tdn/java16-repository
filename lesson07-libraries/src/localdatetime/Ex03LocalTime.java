package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalTime {
	private static final String  PATTERN1 = "hh:mm:ss a";

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("now:" +now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN1);
		String txnow = df.format(now);
		System.out.println("now:" +txnow);

	}


}
