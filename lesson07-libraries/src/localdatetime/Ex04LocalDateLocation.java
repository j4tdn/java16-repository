package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex04LocalDateLocation {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(22, 22, 50);
		
		Duration duration = Duration.between(start, end);
		System.out.println("Duration: " +duration);
		
		System.out.println("toString --> \n"
				+ duration.toHours() + " hours\n"
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds");
	}
}
