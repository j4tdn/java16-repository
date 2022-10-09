package localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Ex06DateingTime {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 23, 10, 10);
		LocalDateTime now = LocalDateTime.now();
		
		if(start.isAfter(now)) {
			throw new IllegalArgumentException("Start day must be less than now");
		}
		
		Period period = Period.between(start.toLocalDate(), now.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), now.toLocalTime());
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("Dating time: --> \n" + period.getYears() + " years \n"
												 + period.getMonths() + " months \n"
												 + period.getDays() + " days \n"
												 + duration.toHoursPart() + " hours \n"
												 + duration.toMinutesPart() + " minutes \n"
												 + duration.toSecondsPart() + " seconds");

	}
	
	

}
