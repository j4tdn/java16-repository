package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02Java07 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995, Calendar.SEPTEMBER, 25);
		System.out.println("day number is " + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("Monday of the year is :" + countMonday(c));
		System.out.println("Monday of the month is :" + countMondayMonth(c));
		day(c);
		System.out.println("day of the month is: " + dayMonth(c));
	}
	private static int countMonday(Calendar c) {
		int count = 0;
		Calendar startDay = getStartDayOfYear(c);
		c.set(1995, Calendar.SEPTEMBER , 25);
		Calendar endDay = c;
		for(Calendar date = startDay;date.before(endDay);) {
			if(date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				count++;
				date.add(Calendar.WEEK_OF_MONTH, 1);
			}else {
				date.add(Calendar.DAY_OF_YEAR, 1);
			}
		}
		
		return count ;
		
	}
	private static Calendar getStartDayOfYear(Calendar c) {
		Calendar start = copy(c);
		start.set(Calendar.DAY_OF_YEAR, 1);
		return start;
	}
	private static Calendar getEndDayOfMonth(Calendar c) {
		Calendar end = copy(c);
		end.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return end;
	}
	private static Calendar copy(Calendar c) {
		Calendar output = Calendar.getInstance();
		output.setTime(c.getTime());
		return output;
	}
	private static void printfTime(Calendar c, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
	}
	private static Calendar getStartDayOfMonth(Calendar c) {
		Calendar start = copy(c);
		
		start.set(Calendar.DAY_OF_MONTH, 1);
		return start;
	}
	private static int countMondayMonth(Calendar c) {
		int count = 0;
		Calendar startDay = getStartDayOfMonth(c);
		
		Calendar endDay = getEndDayOfMonth(c);
		for(Calendar date = startDay;date.before(endDay);) {
			if(date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				count++;
				date.add(Calendar.WEEK_OF_MONTH, 1);
			}else {
				date.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		
		return count;
		
	}
	private static void day(Calendar c) {
		GregorianCalendar gc = new GregorianCalendar();
		if(gc.isLeapYear(1995) == false) {
			System.out.println("1995 have 365 day");
		}
	}
	private static int dayMonth(Calendar c) {
		int count = 0;
		for(Calendar date = getStartDayOfMonth(c); date.before(getEndDayOfMonth(c));date.add(Calendar.DAY_OF_MONTH, 1)) {
			count ++;
			
		}
		return count + 1;
		
	}
	
	

	

}
