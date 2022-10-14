package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Ex03ManyDaystoLives {
	private static final String PATTERN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {
		String[] valuemonth = { "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ",
				"September ", "October ", "November ", "December " };

		LocalDate input = LocalDate.of(2022, 10, 10);

		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		System.out.println(df.format(input));

		// Line 2
		LocalDate lastdayinM = input.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastdayinM);
		// Line 3
		System.out.println(input.getDayOfWeek());
		LocalDate lastDayinW = input;
		LocalDate firstDayinW = input;

		while (true) {
			if (lastDayinW.getDayOfWeek().toString() == "SUNDAY") {
				break;
			} else {
				lastDayinW = lastDayinW.plusDays(1);
			}
		}
		System.out.println("Last day in Week: " + lastDayinW);

		while (true) {
			if (firstDayinW.getDayOfWeek().toString() == "MONDAY") {
				break;
			} else {
				firstDayinW = firstDayinW.minusDays(1);
			}
		}
		System.out.println("First day in Week: " + firstDayinW);

		double numberweek = input.getDayOfYear() / 7.0;
		System.out.println(input.getDayOfMonth() + " in week number " + Math.ceil(numberweek));

		System.out.println(input.plusDays(20).getDayOfWeek());

		LocalDate getDate = LocalDate.now();
		LocalDate birthday = LocalDate.of(2001, 6, 23);
		long days = ChronoUnit.DAYS.between(birthday, getDate);
		System.out.println("you live " + days);

	}
}