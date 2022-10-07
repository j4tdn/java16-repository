package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex04LocalTimeDuration {
	public static void main(String[] args) {
		// start, end
		// Duration.between
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(23, 12, 12);
		Duration duration = Duration.between(start, end);
		System.out.println("Duration: " + duration);
		System.out.println("ToString --> \n" + duration.toHoursPart() + " hours\n" + duration.toMinutesPart()
				+ " minutes\n" + duration.toSecondsPart() + " seconds");
	}
}
