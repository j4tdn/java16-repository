package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import bean.DayOfWeek;

public class Ex03Java07LifeIsTooLong {
	private static String PATTERN = "dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat(PATTERN);
		Calendar c = Calendar.getInstance();
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.DAY_OF_MONTH, 10);
		
		System.out.println("Thời gian hiện tại: " + df.format(currentDate(Locale.US)));
		System.out.println("Ngày cuối cùng của tháng hiện tại(dd/MM/yyyy): " + df.format(lastDayOfMonth(c)));
		System.out.println("Ngày đầu tiên của tuần hiện tại: " + df.format(firstDateInWeek(c)));
		System.out.println("Ngày hiện tại đang ở tuần thứ mấy của năm: " + ordinalWeekYear(c));
		System.out.println("Sau 20 ngày nữa là ngày nào, thứ mấy: " + df.format(after20Day(c)));
		System.out.println("Bạn đã sống được bao nhiêu ngày: " + daysAlive(birthday, c));
	}
	
	private static Date currentDate(Locale locale) {
		return Calendar.getInstance(locale).getTime();
	}
	
	private static Date lastDayOfMonth(Calendar date) {
		Calendar c = Ex02Java07_WeekdayCalculator.copy(date);
		int maxDow = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, maxDow);
		return c.getTime();
	}
	
	private static Date firstDateInWeek(Calendar date) {
		Calendar c = Ex02Java07_WeekdayCalculator.copy(date);
		
		for (int i = 1; i <= 7; i++) {
			if (c.get(Calendar.DAY_OF_WEEK) == c.getFirstDayOfWeek()) {
				return c.getTime();
			}
			c.add(Calendar.DAY_OF_MONTH, -1);
		}
		
		return null;
	}
	
	private static int ordinalWeekYear(Calendar date) {
		return date.get(Calendar.WEEK_OF_YEAR);
	}
	
	private static Date after20Day(Calendar date) {
		Calendar c = Ex02Java07_WeekdayCalculator.copy(date);
		c.add(Calendar.DAY_OF_MONTH, 20);
		return c.getTime();
	}
	
	private static long daysAlive(Calendar birthday, Calendar current) {
		long duration = current.getTimeInMillis() - birthday.getTimeInMillis();
		return TimeUnit.MILLISECONDS.toDays(duration);
	}
	
	private static boolean isInFirstWeekOfMonth(Calendar date) {
		int dayOfMonth = date.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek >= dayOfMonth;
	}
	
}
