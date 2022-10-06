package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

public class Ex04LocalTimeDuration {
	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(23, 59);
		
		Duration durian = Duration.between(start, end);
		System.out.println(durian);
		System.out.println("tostring --> \n" 
		+ durian.toHours() + "hours\n"
		+ durian.toMinutesPart() + "minutes\n"
		+ durian.toSecondsPart() + "seconds\n");
	
		
	}

}
