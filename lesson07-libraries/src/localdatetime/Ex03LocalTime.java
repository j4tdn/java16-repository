package localdatetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalTime {
	private static final String PATTER = "hh:mm:ss a";
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Now: " + now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTER);
		System.out.println("Formatted: " + df.format(now));

	}

}
