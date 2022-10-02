package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04SundayCounter {
	
	public static final String pattern = "dd/MM/yyyy E";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();
		System.out.println("number of sundays: " + count(today));
	}
	
	private static int count(Calendar c) {
		int count = 0;
		
		Calendar startDate = getStartDayOfMonth(c);
		Calendar endDate = getEndDayOfWeek(c);
		plusDate(endDate);
		printTime(startDate, pattern);
		
		for (Calendar date = startDate; date.before(endDate); ) {
			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
				printTime(date, pattern);
				plusWeek(date);
			} else {
				//find first sunday of month
				plusDate(date);
			}
		}
		
		return count;
	}
	
	private static void plusDate(Calendar c) {
		c.add(Calendar.DAY_OF_MONTH, 1);
	}
	private static void plusWeek(Calendar c) {
		c.add(Calendar.WEEK_OF_MONTH, 1);
	}
	
	private static void printTime(Calendar c, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
	}
	
	private static Calendar getEndDayOfWeek(Calendar c) {
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH, result.getActualMaximum(Calendar.DAY_OF_MONTH));
		return result;
	}
	
	private static Calendar getStartDayOfMonth(Calendar c) {
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH, 1);
		return result;
	}
	
	private static Calendar copy(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTime(input.getTime());
		return output;
	}

}
