package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		//period :localdate
		//duration ; localtime
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 20, 10);
		LocalDateTime end = LocalDateTime.now();
		if (end.isBefore(start)) {
			throw new IllegalArgumentException("start must less than end ");
			
		}
		LocalDate startday = start.toLocalDate();
		LocalDate endday = end.toLocalDate();
		
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();
		
		Period period = Period.between(startday, endday);
		Duration dura = Duration.between(startTime, endTime);
		
		if(dura.isNegative()) {
			dura = dura.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("toString --> \n"
				+period.getYears() + "y \n"
				+period.getMonths() + "m \n"
				+period.getDays() + "d \n"
				+dura.toHoursPart() + "hours \n"
				+dura.toMinutesPart() + "minutes \n"
				+dura.toSecondsPart() + "secon \n");
	}

}
