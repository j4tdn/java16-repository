package Homeworks;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 10, 10, 10);
		LocalDateTime endBrokeup = LocalDateTime.of(2021, 11, 3, 19, 00, 59);
		LocalDateTime end = LocalDateTime.now();

		System.out.println("break up (Y/N)");
		String tmp = sc.nextLine();
		if (tmp.equals("Y") || tmp.equals("N")) {
			if (tmp.equals("Y")) {
				Period periodBrokeup = Period.between(start.toLocalDate(), endBrokeup.toLocalDate());
				Duration durationBrokeup = Duration.between(start.toLocalTime(), endBrokeup.toLocalTime());
				System.out.println("formatted \n" + periodBrokeup.getYears() + " years \n" + periodBrokeup.getMonths()
						+ " month \n" + periodBrokeup.getDays() + " day \n" + durationBrokeup.toHoursPart()
						+ " hours \n" + durationBrokeup.toMinutesPart() + " minutes \n"
						+ durationBrokeup.toSecondsPart() + " seconds \n");
			}

		}

		if (end.isBefore(start)) {
			throw new IllegalArgumentException("StratDay must less than Enđay");

		}
		Period period = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration duration = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (duration.isNegative()) {
			period = period.minusDays(1);
			duration = duration.plusDays(1);
		}

		if (duration.isNegative()) {//
			duration = duration.plusDays(1);
			period = period.minusDays(1);

		}

		System.out.println("formatted \n" + period.getYears() + " years \n" + period.getMonths() + " month \n"
				+ period.getDays() + " day \n" + duration.toHoursPart() + " hours \n" + duration.toMinutesPart()
				+ " minutes \n" + duration.toSecondsPart() + " seconds \n");

	}
}
