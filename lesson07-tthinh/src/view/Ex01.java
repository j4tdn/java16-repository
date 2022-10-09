package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Ex01 {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2022, Month.SEPTEMBER, 8, 7, 12, 50);
		LocalDateTime end = LocalDateTime.now();
		
		if(end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less then EndDay");
		}
		
		LocalDate startDay = start.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		
		LocalDate endDay = end.toLocalDate();
		LocalTime endTime = end.toLocalTime();
		
		Period pr = Period.between(startDay, endDay);
		Duration du = Duration.between(startTime, endTime);
		
		if(du.isNegative()) {
			du = du.plusDays(1);
			pr = pr.minusDays(1);
		}
		
		System.out.println("toString --> \n" 
				+ pr.getYears() + "years\n" 
				+ pr.getMonths() + "months\n"
				+ pr.getDays() + "days\n"
				+ du.toHoursPart() + "hours\n" 
				+ du.toMinutesPart() + "minutes\n"
				+ du.toSecondsPart() + "seconds\n");
	}
}
