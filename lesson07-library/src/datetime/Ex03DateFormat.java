package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
		String pattern = "EEE, MMM d,yyyy h:mm:ss:ms a";
		DateFormat df = new SimpleDateFormat(pattern); 
		Calendar c = Calendar.getInstance();
		
		String formatted = df.format(c.getTime());
		System.out.println(formatted);
		
		String dateAsText = "18.7.1990";
		df = new SimpleDateFormat("dd.MM.yyyy");
		try {
			Date parseDate = df.parse(dateAsText);
			System.out.println(parseDate);
			Calendar parseCalender = Calendar.getInstance();
			parseCalender.setTime(parseDate);
			System.out.println(parseCalender);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==============================");
		System.out.println("Sunday count : " + getCountOfSundays(c));
		
	}
	
	private static int getCountOfSundays(Calendar c) {
		int count = 0;
		// Solution 1
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.get(Calendar.DATE);
	
		for (int i = 0; i < c.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
			} 
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		// Solution 2
//		Calendar tmp = Calendar.getInstance();
//		tmp.setTime(c.getTime());
//		c = getFirstSundaysInMonth(c);
//		while(true) {
//			count++;
//			c.add(Calendar.WEEK_OF_MONTH, 1);
//			if(c.get(Calendar.MONTH)!= tmp.get(Calendar.MONTH)) break;
//		}
		return count;
	}
	
	private static Calendar getFirstSundaysInMonth(Calendar cal) {
		cal.set(Calendar.DAY_OF_MONTH, 1);
		while(true) {
			cal.add(Calendar.DAY_OF_MONTH, 1);
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) break;
		}
		return cal;
	}
}
