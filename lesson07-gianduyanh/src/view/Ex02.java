package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ex02 {

	private static String PATTERN = "EEE dd/MM/yyyy";
	private static SimpleDateFormat df = new SimpleDateFormat(PATTERN);

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995, Calendar.SEPTEMBER, 25);
		c.get(1);

		System.out.println(df.format(c.getTime()));
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		System.out.println("day of year: " + dayOfYear);
		int maxdayOfyear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("days left : " + (maxdayOfyear - dayOfYear));
		dayOfWeekCount(c);
        dayOfYearCount(c);
        System.out.println("Year " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) +" days ");
        System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())+ " " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	private static void dayOfWeekCount(Calendar c) {
		int count = 0;
		int index = 0;
		Calendar running = Calendar.getInstance();
		running.setTimeInMillis(c.getTimeInMillis());
		running.set(Calendar.DAY_OF_MONTH, 1);
		running.get(1);

		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(c.getTimeInMillis());
		end.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		end.get(1);
		for (; running.before(end);) {
			if (running.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				System.out.println(df.format(running.getTime()));
				count++;
				if (running.equals(c)) {
					index = count;

				}
			}
			running.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("It is " + c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
				+ " number " + index + " out of " + count + "  in "
				+ c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));

		System.out.println(count);
	}
	
	private static void dayOfYearCount(Calendar c) {
		int count = 0;
		int index = 0;
		Calendar running = Calendar.getInstance();
		running.setTimeInMillis(c.getTimeInMillis());
		running.set(Calendar.DAY_OF_YEAR, 1);
		running.get(1);
		System.out.println("running" + df.format(running.getTime()));

		Calendar end = Calendar.getInstance();
		end.setTimeInMillis(c.getTimeInMillis());
		end.set(Calendar.DAY_OF_YEAR, c.getActualMaximum(Calendar.DAY_OF_YEAR));
		end.get(1);
		System.out.println("end" + df.format(end.getTime()));
		for (; running.before(end);) {
			if (running.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				System.out.println(df.format(running.getTime()));
				count++;
				if (running.equals(c)) {
					index = count;
				}
			}
			running.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.println("It is " + c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
				+ " number " + index + " out of " + count + " in "
				+ c.getDisplayName(Calendar.YEAR, Calendar.LONG, Locale.getDefault()));

		System.out.println(count);
		
	}
	

}
