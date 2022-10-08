package lesson07;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;

public class Bai1 {
	public static void main(String[] args) {
		Calendar DayOfMonth = Calendar.getInstance();
		DayOfMonth.set(2022,Calendar.AUGUST, 4);
		
		LocalDateTime start = LocalDateTime.of(2020, 8, 4, 18, 10, 10);
		LocalDateTime end = LocalDateTime.now();
		
		
		
		if(end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than End Day !!!");

		}
		
		LocalDate startDate = start.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		
		
		
		LocalDate endDate = end.toLocalDate();
		LocalTime endTime = end.toLocalTime();
		
		Period pr = Period.between(startDate, endDate);
		Duration dr = Duration.between(startTime, endTime);
		
		if(dr.isNegative()) {
			dr = dr.plusDays(1);
			pr = pr.minusDays(1);
			
		}
		System.out.println("DAYS: " + DayOfMonth.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("toString -->"
				+ pr.getYears() + "YEARS\n"
				+ pr.getMonths() + "MONTH\n"
				+ pr.getDays()+ "DAYS\n"
				+ dr.toHoursPart()+"HOURS\n"
				+ dr.toMinutesPart()+"MINUTES\n"
				+ dr.toMinutesPart()+"SECONDS\n");
		
		
	}
}
