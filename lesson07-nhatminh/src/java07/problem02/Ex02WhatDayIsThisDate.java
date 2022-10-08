package java07.problem02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import java07.utils.DateTimeUtils;

public class Ex02WhatDayIsThisDate {
	private static final String PATTERN = "dd/MM/yyyy";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat(PATTERN);
		while (true) {
			try {
				System.out.print("Input a date: ");
				String input = sc.nextLine();
				Date parseDate = df.parse(input);
				Calendar parsedCalendar = Calendar.getInstance();
				parsedCalendar.setTime(parseDate);
				whatDayIsThisDate(parsedCalendar);
				break;
			} catch (ParseException e) {
				System.out.println("Invalid Date!");
			}
		}
	}

	private static void whatDayIsThisDate(Calendar input) {
		String[] dateOfWeek = { "", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String[] monthList = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int dow = input.get(Calendar.DAY_OF_WEEK);
		int year = input.get(Calendar.YEAR);
		String month = monthList[input.get(Calendar.MONTH)];

		// TITLE
		System.out.println(input.get(Calendar.DAY_OF_MONTH) + " " + month + " " + year + " is a " + dateOfWeek[dow]);
		System.out.println("Additional facts:");

		// LINE 1
		int doy = input.get(Calendar.DAY_OF_YEAR);
		System.out.println("\t+It is day number " + doy + " of the year, "
				+ (input.getActualMaximum(Calendar.DAY_OF_YEAR) - doy) + " days left.");

		// LINE 2
		int countAll = 0, countToInput = 0;
		Calendar fdoy = DateTimeUtils.copy(input);
		Calendar ldoy = DateTimeUtils.copy(input);
		fdoy.set(Calendar.DAY_OF_YEAR, 1);
		ldoy.set(Calendar.DAY_OF_YEAR, input.getActualMaximum(Calendar.DAY_OF_YEAR));
		for (Calendar date = fdoy; date.before(ldoy) || date.equals(ldoy);) {
			if (date.get(Calendar.DAY_OF_WEEK) == dow) {
				countAll++;
				if (date.before(input) || date.equals(input))
					countToInput++;
				date.add(Calendar.DAY_OF_YEAR, 7);
			} else
				date.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.println("\t+It is " + dateOfWeek[dow] + " number " + countToInput + " out of " + countAll + " in "
				+ year + ".");

		// LINE 3
		countAll = 0;
		countToInput = 0;
		Calendar fdom = DateTimeUtils.copy(input);
		Calendar ldom = DateTimeUtils.copy(input);
		fdom.set(Calendar.DAY_OF_MONTH, 1);
		ldom.set(Calendar.DAY_OF_MONTH, input.getActualMaximum(Calendar.DAY_OF_MONTH));
		for (Calendar date = fdom; date.before(ldom) || date.equals(ldom);) {
			if (date.get(Calendar.DAY_OF_WEEK) == dow) {
				countAll++;
				if (date.before(input) || date.equals(input))
					countToInput++;
				date.add(Calendar.DAY_OF_MONTH, 7);
			} else
				date.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("\t+It is " + dateOfWeek[dow] + " number " + countToInput + " out of " + countAll + " in "
				+ month + " " + year + ".");

		// LINE 4
		System.out.println("\t+Year " + year + " has " + input.getActualMaximum(Calendar.DAY_OF_YEAR) + " days.");

		// LINE 5
		System.out.println(
				"\t+" + month + " " + year + " has " + input.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");
	}
}
