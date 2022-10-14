package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Ex02WeekDayCaculator {
	private static final String PATTERN = "EEE dd/MM/yyyy";
	private static final SimpleDateFormat df = new SimpleDateFormat(PATTERN);

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995, Calendar.SEPTEMBER, 25);

		System.out.println(df.format(c.getTime()));
		int dOY = c.get(Calendar.DAY_OF_YEAR);
		int numberDOY = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("day number " + dOY + ", " + (numberDOY - dOY) + " day left");

		// dayOfYearCount(c);
		System.out.println(
				"Year " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days ");
		System.out.println(c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " "
				+ c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
}