package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		// period: localDate
		// Duration: LocalTime
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 18, 10, 10);
		LocalDateTime end = LocalDateTime.now();
		if (end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than EndDay");

		}
		// years, months, days, hours, minutes, seconds
		LocalDate endDate = end.toLocalDate();
		LocalDateTime endTime = end.toLocalTime();
		Period p = Period.between(startTime, endTime);
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("toString-->"
		+ period.getYears()+"years\n"
		+ period.getMonths()+"months\n"
		+ period.getDays()+"days");
	
		
	
		
		
	}
}
