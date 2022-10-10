package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01UlitmateRelationCal {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		LocalDateTime startDays;
		LocalDateTime endDays = LocalDateTime.now();
		String text = "";
		System.out.print("Enter your start dating?: ");
		text = ip.nextLine() + " 00:00:00";
		startDays = LocalDateTime.parse(text, df);
		System.out.print("Are you still dating? (1 or 2): ");
		int choose = Integer.parseInt(ip.nextLine());
		if (choose == 1) {
			System.out.print("Enter your break-up dating?: ");
			text = ip.nextLine() + " 00:00:00";
			endDays = LocalDateTime.parse(text, df);
		}
		String time = calDating(startDays, endDays);
		System.out.println("The day of first day is: " + startDays.getDayOfWeek());
		System.out.println("The love has already begin: " + time);
	}

	private static String calDating(LocalDateTime start, LocalDateTime end) {
		String result = "";
		if (start.isAfter(end)) {
			throw new IllegalArgumentException("StartDate cannot exceed EndDate!!!");
		}
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();
		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();

		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);

		result = period.getYears() + "year - " + period.getMonths() + "month - " + period.getDays() + "day - "
				+ duration.toHoursPart() + "hour - " + duration.toMinutesPart() + "minutes - "
				+ duration.toSecondsPart() + " seconds";
		return result;
	}
}
