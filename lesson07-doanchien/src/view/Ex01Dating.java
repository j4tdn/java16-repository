package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex01Dating {
	public static void main(String[] args) {
		
		LocalDateTime startDay = LocalDateTime.of(2020, 10, 10, 10, 10, 10);
		LocalDateTime endDay = LocalDateTime.now();
		
		if(endDay.isBefore(startDay)) {
			throw new IllegalArgumentException("Start must less than End");
		}
		
	}
	private static void datingCal(LocalDateTime start, LocalDateTime end) {
		LocalDate startDate = start.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		
		LocalDate endDate = end.toLocalDate();
		LocalTime endTime = end.toLocalTime();
		
		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(startTime, endTime);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("toString--> \n"
				+ period.getYears()        + " years\n"
				+ period.getMonths()       + " months\n"
				+ period.getDays()         + " days\n"
				+ duration.toHours()       + " hours\n"
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds");
		
	}
}
