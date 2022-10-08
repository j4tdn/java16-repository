package java07.problem03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03DateTimeApp {
	private static Scanner sc = new Scanner(System.in);
	private static final DateFormat dfDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static final DateFormat dfDate = new SimpleDateFormat("dd/MM/yyyy");
	private static final DateFormat dfDateDayOfWeek = new SimpleDateFormat("dd/MM/yyyy EEEE");

	public static void main(String[] args) {
		// 1
		currentTime();
		System.out.println("============");
		// 2
		lastDayOfMonth();
		System.out.println("============");
		// 3
		firstDayOfWeek();
		lastDayOfWeek();
		System.out.println("============");
		// 4
		weekOfYear();
		System.out.println("============");
		// 5
		next20Days();
		System.out.println("============");
		// 6
		myLifeTime();
	}

	private static void currentTime() {
		// Europe/Kiev
		// Europe/Rome
//		String[] ids = TimeZone.getAvailableIDs();
//		for (String id : ids)
//			System.out.println(id);
		Calendar c = Calendar.getInstance();
		System.out.print("Input Locale: ");
		String locale = sc.nextLine();
		dfDateTime.setTimeZone(TimeZone.getTimeZone(locale));
		System.out.println(locale + " time: " + dfDateTime.format(c.getTime()));
	}

	private static void lastDayOfMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Last day of this month: " + dfDate.format(c.getTime()));
	}

	private static void firstDayOfWeek() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		System.out.println("First day of week: " + dfDate.format(c.getTime()));
	}

	private static void lastDayOfWeek() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		c.add(Calendar.DAY_OF_YEAR, 6);
		System.out.println("Last day of week: " + dfDate.format(c.getTime()));
	}

	private static void weekOfYear() {
		Calendar c = Calendar.getInstance();
		System.out.println("Week of year: " + c.get(Calendar.WEEK_OF_YEAR));
	}

	private static void next20Days() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 20);
		System.out.println("Next 20 days: " + dfDateDayOfWeek.format(c.getTime()));
	}

	private static void myLifeTime() {
		Calendar birthday = Calendar.getInstance();
		Calendar current = Calendar.getInstance();
		while (true)
			try {
				System.out.print("Input birthday: ");
				String temp = sc.nextLine();
				Date parseDate = dfDate.parse(temp);
				birthday.setTime(parseDate);
				break;
			} catch (Exception e) {
				System.out.println("Invalid Date!");
			}
		int doyStart = birthday.get(Calendar.DAY_OF_YEAR);
		int doyEnd = current.get(Calendar.DAY_OF_YEAR);
		int yearStart = birthday.get(Calendar.YEAR);
		int yearEnd = current.get(Calendar.YEAR);
		int result = doyEnd - doyStart;
		for (int year = yearStart; year < yearEnd; year++) {
			birthday.set(Calendar.YEAR, year);
			result += birthday.getActualMaximum(Calendar.DAY_OF_YEAR);
		}
		System.out.println("Live Time: " + result + " days.");
	}
}
