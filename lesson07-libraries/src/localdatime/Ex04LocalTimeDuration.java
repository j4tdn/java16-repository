package localdatime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex04LocalTimeDuration {

	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(22, 22, 55);

		Duration duration = Duration.between(start, end);
		System.out.println("duration: " + duration);
		System.out.println("String --> " + duration.toHoursPart() + "hours\n " + duration.toMinutesPart() + "minutes\n "
				+ duration.toSecondsPart() + "seconds\n");
	}

}
