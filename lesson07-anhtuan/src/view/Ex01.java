package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex01 {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 10, 5, 22, 25, 6);
		System.out.println("Day of week: " + start.getDayOfWeek());
		LocalDateTime now = LocalDateTime.now();
		if(now.isBefore(start)) {
			throw new IllegalArgumentException("start be less than now");
		}
		LocalDate startDate = start.toLocalDate();
		LocalDate nowDate = now.toLocalDate();
		
		LocalTime startTime = start.toLocalTime();
		LocalTime nowTime = now.toLocalTime();
		
		Duration duration = Duration.between(startTime, nowTime);
		Period period = Period.between(startDate, nowDate);
		
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println("Date time: " + period.getYears()+" years " + period.getMonths()+" month "+ period.getDays()+" days"
		+"\n"+ duration.toHoursPart()+":" + duration.toMinutesPart()+":" + duration.toSecondsPart());
	}

}
