package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DayTimeLoop {
	// + 8. In ra danh sách các ngày trong tuần hiện tại
	// Today: 19.10.2022
	public static void main(String[] args) {
		Locale.setDefault(new Locale("vi","VN"));

		Calendar now = getTime(2022, Calendar.OCTOBER, 19);

		Calendar startDayOfWeek = getStartDayOfWeek(now);
		Calendar endDayOfWeek = getEndDayOfWeek(now);
		printTime(startDayOfWeek);

		System.out.println("====================1st=====================");
		Calendar running = getTime(startDayOfWeek);
		for (int i = 0; i < 6; i++) {
			printTime(running);
			running.add(Calendar.DAY_OF_MONTH, 1);
		}

		System.out.println("====================2nd=====================");
		endDayOfWeek.add(Calendar.DAY_OF_MONTH, 1);
		printTime(startDayOfWeek);
		printTime(endDayOfWeek);
		System.out.println("-------");
		for (Calendar date = startDayOfWeek; date.before(endDayOfWeek); date.add(Calendar.DAY_OF_MONTH, 1)) {
			printTime(date);
		}
	}

	private static Calendar getStartDayOfWeek(Calendar c) {
		// copy time from c to result
		Calendar result = Calendar.getInstance();
		result.setTimeInMillis(c.getTimeInMillis());
		result.add(Calendar.DAY_OF_MONTH, result.getFirstDayOfWeek() - result.get(Calendar.DAY_OF_WEEK));
		return result;
	}

	private static Calendar getEndDayOfWeek(Calendar c) {
		Calendar result = getStartDayOfWeek(c);
		result.add(Calendar.DAY_OF_MONTH, 6);
		return result;
	}

	private static Calendar getTime(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTimeInMillis(input.getTimeInMillis());
		return output;
	}

	private static Calendar getTime(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}

	private static void printTime(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + "/" + (month + 1) + "/" + year);
	}
}
