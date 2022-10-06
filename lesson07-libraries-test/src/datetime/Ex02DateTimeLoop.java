package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DateTimeLoop {
	public static void main(String[] args) {
		//today 19.10.2022
		Calendar now = getTime(2022, Calendar.OCTOBER, 19);
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar startDayOfWeek = getStartDayOfWeek(now);
		Calendar endDayofWeek = getEndDayOfWeek(now);
		Calendar running = getTime(startDayOfWeek);

		printTime(now);
		printTime(startDayOfWeek);
		System.out.println("=========1st=========");
		for (int i = 0; i < 7; i++) {
			printTime(running);
			running.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("=======2st=======");
		//start_date(17/10)
		printTime(startDayOfWeek);
		printTime(endDayofWeek);
		System.out.println("====================");
		for(Calendar date = startDayOfWeek; date.before(endDayofWeek); date.add(Calendar.DAY_OF_MONTH,  1)) {
			printTime(date);
		}
		
	}
	
	private static Calendar getTime(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
	private static Calendar getTime(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTimeInMillis(input.getTimeInMillis());
		return output;
	}
	
	private static void printTime(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		
		
		System.out.println(day + "/" + (month + 1) + "/" + year);
	}
	private static Calendar getStartDayOfWeek(Calendar c) {
		
		Calendar rs = Calendar.getInstance();
		rs.setTimeInMillis(c.getTimeInMillis());
		rs.add(Calendar.DAY_OF_MONTH, rs.getFirstDayOfWeek() - rs.get(Calendar.DAY_OF_WEEK));
		return rs;
	}

	private static Calendar getEndDayOfWeek(Calendar c) {

		Calendar rs = Calendar.getInstance();
		rs.setTimeInMillis(c.getTimeInMillis());
		rs.add(Calendar.DAY_OF_MONTH, rs.getFirstDayOfWeek() + rs.get(Calendar.DAY_OF_WEEK) - 1);
		return rs;
	}

}
