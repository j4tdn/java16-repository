package Homeworks;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	private static final String PATTERN = "dd/MM/yyy ";

	public static void main(String[] args) {
		System.out.println("number of sunday and saturday " + count(Calendar.getInstance()) * 2);
		System.out.println("deadline is: ");
		printTime(deadline(Calendar.getInstance()), PATTERN);

	}

	private static Calendar deadline(Calendar c) {

		Calendar endDate = getEndDayOfMonth(c);
		endDate.add(Calendar.DAY_OF_YEAR, count(Calendar.getInstance()) * 2);

		return endDate;
	}

	private static int count(Calendar c) {
		int Count = 0;

		Calendar starDate = getStartDayOfMonth(c);
		Calendar endDate = getEndDayOfMonth(c);

		plusDay(endDate);
		for (Calendar date = starDate; date.before(endDate);) {

			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				Count++;

				plusWeek(date);

			} else {
				plusDay(date);
			}
		}
		return Count;
	}

	private static void plusDay(Calendar c) {
		c.add(Calendar.DAY_OF_MONTH, 1);
	}

	private static void plusWeek(Calendar c) {
		c.add(Calendar.WEEK_OF_MONTH, 1);
	}

	private static Calendar getStartDayOfMonth(Calendar c) { // 1
		Calendar result = SetInTime(2022, Calendar.JUNE, 7);

		return result;
	}

	private static Calendar getEndDayOfMonth(Calendar c) { // 2
		Calendar result = SetInTime(2022, Calendar.JUNE, 7);
		result.set(Calendar.DAY_OF_MONTH, 110);
		return result;
	}

	private static void printTime(Calendar c, String pattern) { // 3
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
	}

	private static Calendar SetInTime(int year, int month, int date) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;

	}

}