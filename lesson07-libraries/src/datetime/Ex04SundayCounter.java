package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04SundayCounter {
	private static final String PATTERN = "dd/MM/yyyy"; 
	public static void main(String[] args) {
		count(Calendar.getInstance());
	}
	
	private static int count(Calendar c) {
		int count =0;
		
		Calendar startDate = getStartDayOfMonth(c);
		Calendar endDate = getEndDayOfMonth(c);
		plushDay(endDate);
		for(Calendar date = startDate;date.before(endDate);) {
			if(date.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
				count++;
				printTime(date,PATTERN);
				plushWeek(date);
			}else {
				//find first sun day of month
				plushDay(date);
			}
		}
		
		return count;
	}	
	private static void plushDay(Calendar c) {
		c.add(Calendar.DAY_OF_MONTH,1);
	}
	private static void plushWeek(Calendar c) {
		c.add(Calendar.WEEK_OF_MONTH,1);
	}
	
	private static void printTime(Calendar c,String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
	}
	
	private static Calendar getEndDayOfMonth(Calendar c) {
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH, result.getActualMaximum(Calendar.DAY_OF_MONTH));
		return result;
	}
	
	private static Calendar getStartDayOfMonth(Calendar c) {
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH,1);
		return result;
	}
	
	
	private static Calendar copy(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTime(input.getTime());
		return output;
	}
}
