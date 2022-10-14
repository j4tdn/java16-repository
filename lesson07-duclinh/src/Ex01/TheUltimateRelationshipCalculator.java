package Ex01;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TheUltimateRelationshipCalculator {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
	// Period: LocalDate
	// Duration: LocalTime

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2022, 2, 23, 23, 9, 10);
		LocalDateTime end = LocalDateTime.of(2022, 4, 12, 20, 10, 34);

		if (end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than EndDay !!!");
		}

		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (duration.isNegative()) { // if (startTime > endTime)
			duration = duration.plusDays(1);
			period = period.minusDays(1);
			// c.add(Calendar.DAY_OF_MONTH, 1)
		}
		System.out.println("Time  --> \n" 
		        + period.getYears()        + " years "
				+ period.getMonths()       + " months "
				+ period.getDays()         + " days\n "
				+ duration.toHoursPart()   + " hours"
				+ duration.toMinutesPart() + " minutes "
				+ duration.toSecondsPart() + " seconds");
	}
}
