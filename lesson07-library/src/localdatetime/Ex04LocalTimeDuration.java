package localdatetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex04LocalTimeDuration {
	public static void main(String[] args) {
		LocalTime start = LocalTime.of(10, 10, 10);
		LocalTime end = LocalTime.of(23, 20, 50);
		
		Duration duration = Duration.between(start, end);
		
		System.out.println(duration);
		System.out.println("toString: --> \n" + duration.toHoursPart() + " hours \n"+ duration.toMinutesPart() + " minutes \n" + duration.toSecondsPart() + " seconds \n");
		
	}
}
