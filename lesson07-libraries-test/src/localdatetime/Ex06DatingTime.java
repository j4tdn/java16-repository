package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex06DatingTime {
	
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 23, 10, 10);
		LocalDateTime end = LocalDateTime.now();
		
		if(end.isBefore(end)) {
			throw new IllegalArgumentException("StartDay must less than EndDay");
		}
		
		
	    Period period = Period.between(start.toLocalDate(), end.toLocalDate());
	    Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
	    System.out.println(period);
	    System.out.println(duration);
	    if(duration.isNegative()) {
	    	duration = duration.plusDays(1);
	    	period = period.minusDays(1);
	    }
	    System.out.println("formatted \n"  
	    +period.getYears()       +" years \n"
	    +period.getMonths()      +" month \n"
	    +period.getDays()        +" day \n"
	    +duration.toHoursPart()  +" hours \n"
	    +duration.toMinutesPart()+" minutes \n"
	    +duration.toSecondsPart()+" seconds \n"
	   );
	}

}
