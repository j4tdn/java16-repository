package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex04LocalTimeDuration {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(23, 45, 11);
		
		Duration duration = Duration.between(start, end);
		System.out.println("duration: " + duration); // duration: PT3H36M17.7332139S
		System.out.println("toString --> \n"
				+ duration.toHoursPart() + " hour\n"
				+ duration.toMinutesPart() + " minute\n"
				+ duration.toSecondsPart() + " seconds");
	}
}
