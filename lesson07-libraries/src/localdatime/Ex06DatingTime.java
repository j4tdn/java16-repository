package localdatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2021, 2, 14, 21, 00, 00);
		LocalDateTime end = LocalDateTime.of(2022, 7, 24, 16, 00, 00);

		if (end.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must less than EndDay");
		}
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();

		Period periodDate = Period.between(startDate, endDate);
		Duration durationTime = Duration.between(startTime, endTime);

		if (durationTime.isNegative()) {
			durationTime = durationTime.plusDays(1);
			periodDate = periodDate.minusDays(1);
		}

		System.out.println("toString --> \n" + periodDate.getYears() + "year\n" + periodDate.getMonths() + "month\n"
				+ periodDate.getDays() + "days\n" + durationTime.toHoursPart() + "hours\n "
				+ durationTime.toMinutesPart() + "minutes\n " + durationTime.toSecondsPart() + "seconds");

	}
	// years, months, days, hours, minutes,seconds

}
