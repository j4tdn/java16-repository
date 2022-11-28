package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 8, 11, 23, 10, 10);
		LocalDateTime now = LocalDateTime.now();

		if (now.isBefore(start)) {
			throw new IllegalArgumentException("StartDay must les than Now Day !!!");
		}

		// years,months,days,hours,minutes,seconds

		LocalDate startDate = start.toLocalDate();
		LocalTime startTime = start.toLocalTime();

		LocalDate nowDate = now.toLocalDate();
		LocalTime nowTime = now.toLocalTime();

		Period pr = Period.between(startDate, nowDate);
		Duration dr = Duration.between(startTime, nowTime);

		if (dr.isNegative()) {
			dr = dr.plusDays(1);
			pr = pr.minusDays(1);
		}

		System.out.println("toString --> \n" + pr.getYears() + " years\n" + pr.getMonths() + " month\n" + pr.getDays()
				+ " days\n" + dr.toHoursPart() + " hours\n" + dr.toMinutesPart() + " minutes\n" + dr.toSecondsPart()
				+ " seconds");
	}
}
