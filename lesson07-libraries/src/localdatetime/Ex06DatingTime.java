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
			throw new IllegalArgumentException("StartDay must less than Endday");
		}
		
		//y/m/d/h/m/s
		LocalDate startDate = start.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		
		LocalDate endDate = end.toLocalDate();
		LocalTime endTime = end.toLocalTime();
		
		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(startTime, endTime);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
			//c.add(Calender.DAY_OF_MONTH, 1)
		}
		
		System.out.println("toString--> \n"
				+ period.getYears() + " years\n"
				+ period.getMonths() + " months\n"
				+ period.getDays() + " days\n"
				+ duration.toHours() + " hours\n"
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds");
		
	}
}
