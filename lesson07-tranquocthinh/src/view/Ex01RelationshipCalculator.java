package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex01RelationshipCalculator {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 18, 10, 10);
		LocalDateTime now = LocalDateTime.now();

		if (now.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less nowDay");
		}

		LocalDate startDate = start.toLocalDate();
		LocalDate nowDate = now.toLocalDate();

		LocalTime startTime = start.toLocalTime();
		LocalTime nowTime = now.toLocalTime();

		Period period = Period.between(startDate, nowDate);
		Duration duration = Duration.between(startTime, nowTime);

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println("Thời gian hẹn hò của 2 người đến thời điểm hiện tại là: ");
		System.out.println(period.getYears() + " years " + period.getMonths() + " month " + period.getDays() + " days "
				+ duration.toHoursPart() + " hours " + duration.toMillisPart() + " minutes " + duration.toSecondsPart()
				+ " seconds ");
	}
}
