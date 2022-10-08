package java08.problem02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Ex02WhatDayIsThisDate {
	private static final String PATTERN = "dd/MM/yyyy";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		while (true) {
			try {
				System.out.print("Input a date: ");
				String input = sc.nextLine();
				LocalDate parsedDate = LocalDate.parse(input, df);
				whatDayIsThisDate(parsedDate);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Invalid Date!");
			}
		}
	}

	private static void whatDayIsThisDate(LocalDate input) {
		String[] dateOfWeek = { "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String[] monthList = { "", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		// From Monday to Sunday: 1->7
		DayOfWeek dow = input.getDayOfWeek();
		int year = input.getYear();
		// Month list from 1->12
		String month = monthList[input.getMonthValue()];
		LocalDate ldoy = input.with(TemporalAdjusters.lastDayOfYear());
		LocalDate fdoy = input.with(TemporalAdjusters.firstDayOfYear());

		// TITLE
		System.out.println(input.getDayOfMonth() + " " + month + " " + year + " is a " + dateOfWeek[dow.getValue()]);
		System.out.println("Additional facts:");

		// LINE 1
		int doy = input.getDayOfYear();
		System.out
				.println("\t+It is day number " + doy + " of the year, " + (ldoy.getDayOfYear() - doy) + " days left.");

		// LINE 2
		int countAll = 0, countToInput = 0;
		TemporalAdjuster adjusterFirst = TemporalAdjusters.dayOfWeekInMonth(1, dow);
		TemporalAdjuster adjusterLast = TemporalAdjusters.dayOfWeekInMonth(-1, dow);
		TemporalAdjuster adjusterNextDow = TemporalAdjusters.next(dow);
		LocalDate lastDow = ldoy.with(adjusterLast);
		for (LocalDate date = fdoy.with(adjusterFirst); date.isBefore(lastDow)
				|| date.isEqual(lastDow); date = date.with(adjusterNextDow)) {
			countAll++;
			if (date.isBefore(input) || date.isEqual(input))
				countToInput++;
		}
		System.out.println("\t+It is " + dateOfWeek[dow.getValue()] + " number " + countToInput + " out of " + countAll
				+ " in " + year + ".");

		// LINE 3
		countAll = 0;
		countToInput = 0;
		LocalDate fDowom = input.with(TemporalAdjusters.dayOfWeekInMonth(1, dow));
		LocalDate lDowom = input.with(TemporalAdjusters.dayOfWeekInMonth(-1, dow));
		for (LocalDate date = fDowom; date.isBefore(lDowom)
				|| date.isEqual(lDowom); date = date.with(adjusterNextDow)) {
			countAll++;
			if (date.isBefore(input) || date.isEqual(input))
				countToInput++;
		}
		System.out.println("\t+It is " + dateOfWeek[dow.getValue()] + " number " + countToInput + " out of " + countAll
				+ " in " + month + " " + year + ".");

		// LINE 4
		System.out.println("\t+Year " + year + " has " + ldoy.getDayOfYear() + " days.");

		// LINE 5
		System.out.println("\t+" + month + " " + year + " has "
				+ input.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth() + " days.");
	}
}
