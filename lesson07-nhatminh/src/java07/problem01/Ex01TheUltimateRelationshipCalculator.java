package java07.problem01;

import java.util.Calendar;
import java.util.Locale;

import java07.utils.DateTimeUtils;

public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		// Start Dating Time
		Calendar start = Calendar.getInstance();
		start.set(2002, Calendar.FEBRUARY, 7, 19, 01, 00);
		// Broke up
		Calendar endBroke = Calendar.getInstance();
		endBroke.set(2021, Calendar.DECEMBER, 31, 19, 00, 59);
		// Not broken up
		Calendar endNotBrokenUp = Calendar.getInstance();

		// Date of week of start day
		String temp = start.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ROOT);
		System.out.println("First day is: " + temp);
		// Time Diff
		timeDiff(start, endBroke);
		timeDiff(start, endNotBrokenUp);
	}

	private static void timeDiff(Calendar start, Calendar end) {
		int diffSeconds = 0, diffMinutes = 0, diffHours = 0;
		int diffDays = 0, diffMonths = 0, diffYears = 0;
		diffSeconds += end.get(Calendar.SECOND) - start.get(Calendar.SECOND);
		if (diffSeconds < 0) {
			diffSeconds += 60;
			diffMinutes -= 1;
		}
		diffMinutes += end.get(Calendar.MINUTE) - start.get(Calendar.MINUTE);
		if (diffMinutes < 0) {
			diffMinutes += 60;
			diffHours -= 1;
		}
		diffHours += end.get(Calendar.HOUR_OF_DAY) - start.get(Calendar.HOUR_OF_DAY);
		if (diffHours < 0) {
			diffHours += 24;
			diffDays -= 1;
		}
		diffDays += end.get(Calendar.DAY_OF_MONTH) - start.get(Calendar.DAY_OF_MONTH);
		if (diffDays < 0) {
			// Get the maximum days of previous month(stop date)
			Calendar temp = DateTimeUtils.copy(end);
			temp.set(Calendar.MONTH, temp.get(Calendar.MONTH) - 1);
			int numOfDaysOfStartMonth = temp.getActualMaximum(Calendar.DAY_OF_MONTH);
			diffDays += numOfDaysOfStartMonth;
			diffMonths -= 1;
		}
		diffMonths += end.get(Calendar.MONTH) - start.get(Calendar.MONTH);
		if (diffMonths < 0) {
			diffMonths += 12;
			diffYears -= 1;
		}
		diffYears += end.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		if (diffYears < 0) {
			throw new IllegalArgumentException("Start date > Stop date!!!");
		}

		System.out.println("TimeDiff:\n\t" + diffYears + " years\n\t" + diffMonths + " months\n\t" + diffDays
				+ " days\n\t" + diffHours + " hours\n\t" + diffMinutes + " minutes\n\t" + diffSeconds + " seconds\n\t");
	}
}
