package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex04LocalTimeDuration {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(23, 4, 30);
		Duration duration = Duration.between(start, end);
		System.out.println(duration);
		System.out.println("=> " + duration.toHours() + " hours " + duration.toMinutesPart() + " minutes " + duration.toSecondsPart() + " seconds");
	}
}
