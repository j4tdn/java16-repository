package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		
		LocalDateTime start = LocalDateTime.of(2022, 2, 22, 22, 22, 22);
		LocalDateTime end = LocalDateTime.now();
		
		if (end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than EndDay");
		}
		
		LocalDate stDate = start.toLocalDate();
		LocalTime stTime = start.toLocalTime();
		
		LocalDate eDate = end.toLocalDate();
		LocalTime eTime = end.toLocalTime();
		
		Period period = Period.between(stDate, eDate);
		Duration duration = Duration.between(stTime, eTime);
		
		if ( duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("DATING TIME: \n" 
				+ period.getYears() + " year\n"
				+ period.getMonths() + " month\n"
				+ period.getDays() + " days\n"
				+ duration.toHoursPart() + " hour\n"
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds");
	}
}
