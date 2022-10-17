import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Ex01 {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2003, Month.MARCH, 23, 14, 14, 14);
		LocalDateTime now = LocalDateTime.now();
		
		if(now.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less then EndDay");
		}
		
		LocalDate startDay = start.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		
		LocalDate endDay = now.toLocalDate();
		LocalTime endTime = now.toLocalTime();
		
		Period period = Period.between(startDay, endDay);
		Duration duration = Duration.between(startTime, endTime);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("The Ultimate Relationship Calculator \n" 
				+ period.getYears() + " years\n" 
				+ period.getMonths() + " months\n"
				+ period.getDays() + " days\n"
				+ duration.toHoursPart() + " hours\n" 
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds\n");
	}
}