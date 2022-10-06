package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		// Period : LocalDate
		// Duration: LocalTime
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 18, 10);
		LocalDateTime end = LocalDateTime.now();
		
		if(end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than End Day !!!");
			
		}
		
		// years, month, days, hours, minutes,
		LocalDate startDate = start.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		
		LocalDate endDate = end.toLocalDate();
		LocalTime endTime = end.toLocalTime();
		
		Period pr = Period.between(startDate, endDate);
		Duration dr = Duration.between(startTime, endTime);
		
		if(dr.isNegative()) {// if(startTime > endTime)
			dr = dr.plusDays(1);
			pr = pr.minusDays(1);
			//c.add(Calendar.DAY_OF_MONTH,1)
		}
		
		System.out.println("toString --> " 
				+ pr.getYears() + "year\n"
				+ pr.getMonths() + "month\n"
				+ pr.getDays() + "day\n"
				+ dr.toHoursPart() + "hours\n"
				+ dr.toMinutesPart() + "minutes\n"
				+ dr.toSecondsPart() + "seconds\n"	);
		
	}
}
