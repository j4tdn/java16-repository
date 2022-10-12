package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		//Period: LocalDate
		//Duration: LocalTime
		
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 18, 10, 10);
		LocalDateTime end = LocalDateTime.now(); //2022, 10, 03 , 20 , 26,...
		
		if(end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than EndDay");
		}
		
		// years, months , days , ours , minutes , seconds
		LocalDate startDate = start.toLocalDate();
		LocalTime startTime = start.toLocalTime(); // 23:10
		
		
		LocalDate endDate = start.toLocalDate();
		LocalTime endTime = start.toLocalTime(); //20:37
		
		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(startTime, endTime);
		
		if(duration.isNegative()) { //if(starTime > endTime)
			duration = duration.plusDays(1);
			period = period.minusDays(1);
			//c.add(calendar.DAY_OF_MONTH ,1)
		}
		
		System.out.println("toString --> \n"
				+ period.getYears() 	   + " years \n"
				+ period.getMonths()       + " months\n"
				+ period.getDays()         + " days\n"
				+ duration.toHoursPart()   + " hours\n"
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " secconds");	
	}
}
