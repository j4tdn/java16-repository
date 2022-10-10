package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex02WeekDayCal {
	private static final String PATTERN = "dd/MM/yyyy";

	public static void main(String[] args) {
		Date date = new Date();
		date = inputDay();
		String rank = getDayOfWeek(date);
		String monthString = getMonth(date);
		System.out.println(date.getDate() + " " + monthString + " " + (date.getYear() + 1900) + " is a " + rank);
		getDayOfYear(date);
		getDayOfWeekInYear(date);
		dayOfWeekInMonth(date);
		numberDayOfYear(date);
		numberDayOfMonth(date);
	}

	public static Date inputDay() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter day: ");
		int day = Integer.parseInt(ip.nextLine());
		System.out.print("Enter month: ");
		int month = Integer.parseInt(ip.nextLine());
		System.out.print("Enter year: ");
		int year = Integer.parseInt(ip.nextLine());
		String text = "" + day + "/" + month + "/" + year;
		SimpleDateFormat format = new SimpleDateFormat(PATTERN);
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(format.parse(text));
			System.out.println(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return c.getTime();
	}

	private static String getMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		String[] monthAsString = { "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		return monthAsString[c.get(Calendar.MONTH)];
	}

	private static String getDayOfWeek(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		String[] dayOfWeeks = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		int dow = c.get(Calendar.DAY_OF_WEEK);
		return dayOfWeeks[dow - 1];
	}

	private static void getDayOfYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int dayLeft = 365 - dayOfYear;
		System.out.println("It is day number " + dayOfYear + " of the year " + "," + dayLeft + " days left ");
	}

	private static void getDayOfWeekInYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		String rank = getDayOfWeek(date);
		int year = c.get(Calendar.YEAR);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int number = dayOfYear / 7 + (dayOfYear % 7 != 0 ? 1 : 0);
		int lastDateOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int outOf = number + (lastDateOfYear - dayOfYear) / 7;
		System.out.println("It is " + rank + " number " + number + " out of " + outOf + " in " + year);
	}

	private static void dayOfWeekInMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		String rank = getDayOfWeek(date);
		String monthAsString = getMonth(date);
		int year = c.get(Calendar.YEAR);
		int number = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int lastDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int outOf = number + (lastDayOfMonth - c.get(Calendar.DAY_OF_MONTH)) / 7;
		System.out.println(
				"It is " + rank + " number " + number + " out of " + outOf + " in " + monthAsString + " " + year);
	}

	private static void numberDayOfYear(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int year = c.get(Calendar.YEAR);
		GregorianCalendar g = new GregorianCalendar();
		int days = g.isLeapYear(year) ? 366 : 365;
		System.out.println("Year " + year + " has " + days + " days");
	}

	private static void numberDayOfMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		String monthAsString = getMonth(date);
		int year = c.get(Calendar.YEAR);
		int day = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(monthAsString + " " + year + " has " + day + " days");
	}

}
