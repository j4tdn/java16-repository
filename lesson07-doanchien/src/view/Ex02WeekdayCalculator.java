package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Ex02WeekdayCalculator {
	private static String PATTERN = "dd/MM/yyyy";

	public static void main(String[] args) {
		LocalDate d = LocalDate.of(1995, 9, 25);
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
	}

	private static void calWeekDay(LocalDate d) {
		String[] months = { "Jan", "Feb", "Mar", "April", "May", "June", "Aug", "Sep", "Oct", "Nov", "Dec" };

		System.out.println(d.getDayOfMonth() + " " + months[d.getMonthValue() - 1] + " " + d.getYear() + " is a "
				+ d.getDayOfWeek());

		// It is number 268 of the year, 97 day left
		System.out.println("It is day number " + d.getDayOfYear() + " of the year"
				+ (d.lengthOfYear() - d.getDayOfYear() + " day left"));

		// It is Monday number 39 out of 52 in 1995

		LocalDate FDOYear = d.with(TemporalAdjusters.firstDayOfYear());
		LocalDate FDInput = FDOYear;
		while (true) {
			if (FDInput.getDayOfWeek() == d.getDayOfWeek()) {
				break;
			} else {
				FDInput = FDInput.plusDays(1);
			}
		}
		int cAllDayInp = 0;
		int cDayInp = 1;
		for (LocalDate Date = FDInput; d.getYear() <= d.getYear(); d = d.plusDays(7)) {
			cAllDayInp++;
			if (d.getDayOfYear() < d.getDayOfYear()) {
				cDayInp++;
			}
		}
		System.out.println(
				"It is " + d.getDayOfWeek() + " number " + cDayInp + " out of " + cAllDayInp + " in " + d.getYear());

		// It is Monday number 4 out of 4 in September 1995
		LocalDate fDOM = d.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate fDayInpInM = fDOM;
		while (true) {
			if (fDayInpInM.getDayOfWeek() == d.getDayOfWeek()) {
				break;
			} else {
				fDayInpInM = fDayInpInM.plusDays(1);
			}
		}
		int cAllDIInM = 0;
		int cDIInM = 1;
		for (LocalDate date = fDayInpInM; date.getMonthValue() <= d.getMonthValue(); date = date.plusDays(7)) {
			cAllDIInM++;
			if (date.getDayOfYear() < d.getDayOfYear()) {
				cDIInM++;
			}
		}
		System.out.println("It is " + d.getDayOfWeek() + " number " + cDIInM + " out of " + cAllDIInM + " in "
				+ d.getMonth() + " " + d.getYear());

		// Year 1995 has 365 days
		System.out.println("Year " + d.getYear() + " has " + d.lengthOfYear() + " days");
		// September 1995 has 30 days
		System.out.println(months[d.getMonthValue() - 1] + " " + d.getYear() + " has " + d.lengthOfMonth() + " days");
	}
}
