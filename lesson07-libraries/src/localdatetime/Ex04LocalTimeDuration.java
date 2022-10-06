package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class Ex04LocalTimeDuration {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(22, 22, 22);
		
		Duration duration = Duration.between(start, end);
		System.out.println("dr: " + duration);
		System.out.println("toString: " 
						+ duration.toHoursPart() + "hours\n"
						+ duration.toMinutesPart() + "minutes\n"
						+ duration.toSecondsPart() + "seconds\n"	);
		
	}
}
