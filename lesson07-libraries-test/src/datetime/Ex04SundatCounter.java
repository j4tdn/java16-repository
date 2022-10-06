package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04SundatCounter {
	private static final String PATTERN = "dd/MM/yyyy EEEE";
	public static void main(String[] args) {
		Calendar cNow = Calendar.getInstance();
		count(cNow);
	}
	private static int count(Calendar c) {
		int count = 0;
//		Calendar c1 = Calendar.getInstance();
//		c1.set(Calendar.DAY_OF_MONTH, 1);
//		c1.get(Calendar.DATE);
//		for (int i = 0; i < c1.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
//			if(c1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//				count++;
//			}
//			c1.add(Calendar.DAY_OF_MONTH, 1);
//						
//		}
//		System.out.println(count);
//
		
		
		Calendar starDate = startDayOfMonth(c);
		Calendar endDate = endDayOfMonth(c);
		endDate.add(Calendar.DAY_OF_MONTH, 1);
		prinTime(starDate, PATTERN);
		prinTime(endDate,PATTERN);
		for(Calendar date = starDate; date.before(endDate);) {
			if(date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				prinTime(date, PATTERN);
				count++;
				plusWeek(date);
			}
			else {
				date.add(Calendar.DAY_OF_MONTH,1);;
			}
		}
		return count;
	}
	private static void plusWeek(Calendar c) {
		c.add(Calendar.WEEK_OF_MONTH, 1);
	}
	
	private static void prinTime(Calendar c , String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
	}
	
	private static Calendar endDayOfMonth(Calendar c) {
		Calendar rs = copy(c);
		rs.set(Calendar.DATE, rs.getActualMaximum(Calendar.DAY_OF_MONTH));
		return rs;
	}
	private static Calendar startDayOfMonth(Calendar c) {
		Calendar rs = copy(c);
		rs.set(Calendar.DATE, 1 );
		return rs;
	}
	private static Calendar copy(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTime(input.getTime());
		return output;
	}

}
