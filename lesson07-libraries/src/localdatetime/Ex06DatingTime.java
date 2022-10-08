package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		// Period: LocalDate
		// Duration: LocalTime
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 18, 10, 10);
		LocalDateTime end = LocalDateTime.now();

		if (end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than EndDay !!!");
		}
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();

		Period period = Period.between(startDate, endDate);

		System.out.println("toString --> " + period.getDays() + " days\n" + period.getMonths() + " month\n"
				+ period.getYears() + " years");

		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();

		Duration duration = Duration.between(startTime, endTime);

		if (duration.isNegative()) { // if(startTime > endTime)
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}

		System.out.println("toString --> " + duration.toHoursPart() + " hours\n" + duration.toMillisPart()
				+ " minutes\n" + duration.toSecondsPart() + " seconds");

	}

}
