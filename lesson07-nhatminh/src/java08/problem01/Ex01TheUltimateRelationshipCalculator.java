package java08.problem01;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2002, 2, 7, 19, 01, 00);
		LocalDateTime endBrokeup = LocalDateTime.of(2021, 12, 31, 19, 00, 59);
		LocalDateTime endNotBrokenUp = LocalDateTime.now();

		String temp = start.getDayOfWeek().name();
		System.out.println("Fisrt day is: " + temp);

		timeDiff(start, endBrokeup);
		timeDiff(start, endNotBrokenUp);
	}

	private static void timeDiff(LocalDateTime start, LocalDateTime end) {
		if (end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than EndDay");
		}

		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			LocalDateTime temp = LocalDateTime.of(start.toLocalDate(), start.toLocalTime());
			period = Period.between(temp.toLocalDate().plusDays(1), end.toLocalDate());
		}
		System.out.println("Time diff: \n\t" + period.getYears() + " years\n\t" + period.getMonths() + " months\n\t"
				+ period.getDays() + " days\n\t" + duration.toHoursPart() + " hours\n\t" + duration.toMinutesPart()
				+ " minutes\n\t" + duration.toSecondsPart() + " seconds");
	}
}
