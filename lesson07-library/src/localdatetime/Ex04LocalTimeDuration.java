package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Ex04LocalTimeDuration {
	public static void main(String[] args) {
		//LocalDate : d/M/y
		//Period: Find distance from start(LocalDate) until(LocalDate)
		LocalTime start = LocalTime.now();
		LocalTime end = LocalTime.of(22,22,50);
		
		Duration duration = Duration.between(start, end);
		System.out.println(duration);//2M28D
		System.out.println("toString --> \n" + duration.toHoursPart() + "hours\n"
		        + duration.toMinutesPart() + "minutues\n" 
				+ duration.toSecondsPart()+ "seconds\n");
	}
}
