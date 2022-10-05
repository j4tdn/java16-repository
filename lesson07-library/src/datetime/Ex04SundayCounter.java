package datetime;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04SundayCounter {
	public static void main(String[] args) {
		System.out.println(count(Calendar.getInstance()));
	}
	private static int count(Calendar c) {
		int count = 0;
		Calendar startDay = getStartdayOfMonth(c);
		Calendar endDay = getEnddayOfMonth(c);
		printfTime(c,"dd/MM/yyyy E");
		
		for(Calendar date = startDay; date.before(endDay);) {
			if(date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
				printfTime(date, "dd/MM/yyyy");
				
				plusWeek(date);
				
			}else {
				plusDay(date);
			}
		}
		return count;
	}
	private static Calendar getStartdayOfMonth(Calendar c) {
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH, 1);
		return result;
	}
	private static Calendar getEnddayOfMonth(Calendar c) {
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH, result.getActualMaximum(Calendar.DAY_OF_MONTH));
		return result;
	}
	private static Calendar copy(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTime(input.getTime());
		return output;
	}
	private static void printfTime(Calendar c, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
		
	}
	private static void plusDay(Calendar c) {
		c.add(Calendar.DAY_OF_MONTH, 1);
	}
	private static void plusWeek(Calendar c) {
		c.add(Calendar.WEEK_OF_MONTH, 1);
	}

}
