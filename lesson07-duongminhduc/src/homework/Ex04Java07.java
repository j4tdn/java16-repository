
package homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04Java07 {
	private static final String PATTERN = "dd/MM/yyyy E";

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JUNE, 7);
		
		Calendar result = copy(c);
		CalculatorDate(result);
	}

	private static void CalculatorDate(Calendar c) {
		int count = 0;
		Calendar startDate = getStartDayOfMonth(c);
		for (Calendar date = startDate;;plusDay(date)) {
			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
					|| date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				continue;
			} else {
				count++;
				if (count == 110) {
					printTime(date, PATTERN);
					break;
				}
			}

		}

	}

	private static void plusDay(Calendar c) {
		c.add(Calendar.DAY_OF_MONTH, 1);
	}

	private static void printTime(Calendar c, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
	}

	private static Calendar getStartDayOfMonth(Calendar c) {
		Calendar result = copy(c);
		return result;
	}

	private static Calendar copy(Calendar c) {
		Calendar result = Calendar.getInstance();
		result.setTime(c.getTime());
		return result;
	}
}
