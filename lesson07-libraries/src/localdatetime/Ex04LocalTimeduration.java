package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Ex04LocalTimeduration {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(22, 22, 50);
		Duration dura = Duration.between(start, end);
		System.out.println("duration :" + dura);
		System.out.println("toString --> \n"
				+dura.toHoursPart() + "hours \n"
				+dura.toMinutesPart() + "minutes \n"
				+dura.toSecondsPart() + "secon \n");
	}
}
