package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 18, 10, 10);
		LocalDateTime end = LocalDateTime.now();
		
		if(end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than EndDay");
		}
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();
		
		Duration duration = Duration.between(startTime, endTime);
		Period period = Period.between(startDate, endDate);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("toString --> " 
				+ period.getYears() 	   + " years\n"
				+ period.getMonths() 	   + " months\n" 
				+ period.getDays() 		   + " days\n"
				+ duration.toHoursPart()   + " hours\n"
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds\n" );
	}

}
