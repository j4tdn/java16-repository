package localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2002, 7, 5, 23, 30, 0);
		LocalDateTime end = LocalDateTime.now();

		if (end.isBefore(start)) {
			throw new IllegalArgumentException("Start day must be before end day");
		}

		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());
		if (duration.isNegative()) {
			period = period.minusDays(1);
			duration = duration.plusDays(1);
		}
		System.out.println("=> " + period.getYears() + " years " + period.getMonths() + 
				" months " + period.getDays() + " days " + duration.toHours() + " hours " +
				duration.toMinutesPart() + " minutes " + duration.toSecondsPart() + " seconds");

	}
}
