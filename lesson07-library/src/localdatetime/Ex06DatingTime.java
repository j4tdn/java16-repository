package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex06DatingTime {
	private static final String PATTERN = "dd/MM/yyyy";
	private static final String pattern = "HH:mm:ss";
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 18, 10,10);
		LocalDateTime end = LocalDateTime.now();
		
		if(end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must be less than EndDay");
		}
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
		
	}
	

}
