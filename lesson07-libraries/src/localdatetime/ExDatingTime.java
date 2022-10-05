package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class ExDatingTime {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 23, 10, 10);
		LocalDateTime end = LocalDateTime.now();
		if (end.isBefore(start)) {

			throw new IllegalArgumentException("StartDay must less than EndDay");
		}
		LocalDate lda = start.toLocalDate();
		LocalDate ldb = end.toLocalDate();
		Period period = Period.between(lda, ldb);

		LocalTime ltc = start.toLocalTime();
		LocalTime ltd = end.toLocalTime();
		Duration duration = Duration.between(ltc, ltd);
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period.minusDays(1);
		}

		System.out.println("time: " + period.getYears() + " years\n" + period.getMonths() + " months\n"
				+ period.getDays() + " days\n" + duration.toHoursPart() + " hours\n" + duration.toMinutesPart()
				+ "minutes\n" + duration.toSecondsPart() + "seconds");

		// years, months, days, hours, minutes, seconds
	}
}
