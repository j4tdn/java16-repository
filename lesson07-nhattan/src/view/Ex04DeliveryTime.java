package view;

import java.util.Calendar;
import java.util.Date;

public class Ex04DeliveryTime {
	public static void main(String[] args) {
		System.out.println(dateRelease(Calendar.getInstance(), 110));
	}
	
	public static Date dateRelease(Calendar date, int amount) {
		Calendar dateEnd = Ex02Java07_WeekdayCalculator.copy(date);
		Calendar dateStartHoliday = Ex02Java07_WeekdayCalculator.copy(date);
		Calendar dateEndHoliday = Calendar.getInstance();
												
		int amountWeek = amount / 5;
		
		// ngày thừa ra khi chia 5
		int daysLeft = amount % 5; 
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = date.get(Calendar.WEEK_OF_YEAR);
		dateEnd.add(Calendar.WEEK_OF_YEAR, amountWeek);
		
		// + ngày thừa ra khi chia 5
		plusWorkedDays(dateEnd, daysLeft);
		
		System.out.println(dayOfWeek);
		System.out.println(weekOfYear);
		
		dateStartHoliday.set(Calendar.DAY_OF_MONTH, 29);
		dateStartHoliday.set(Calendar.MONTH, 11);
		
		dateEndHoliday.set(Calendar.DAY_OF_MONTH, 5);
		dateEndHoliday.set(Calendar.MONTH, 0);
		dateEndHoliday.set(Calendar.YEAR, date.get(Calendar.YEAR) + 1);
		
		// ngày bù
		int makeUp = 0;
		
		if (dateEnd.before(dateStartHoliday)) {
			makeUp = 0; 
		} else if (dateEnd.after(dateEndHoliday)) {
			makeUp = dateStartHoliday.get(Calendar.DAY_OF_WEEK) == 1 ? 6 : 5; 
		} else {
			while (true) {
				if (dateStartHoliday.after(dateEnd)) {
					break;
				}
				
				if (isWorkedDay(dateStartHoliday)) {
					makeUp++;
					
				}
				
				dateStartHoliday.add(Calendar.DAY_OF_MONTH, 1);
			}
			
		}
		
		plusWorkedDays(dateEnd, makeUp);
		return dateEnd.getTime();
	}
	
	private static void plusWorkedDays(Calendar date, int amount) {
		int i = 0;
		while (i < amount) {
			date.add(Calendar.DAY_OF_MONTH, 1);
			if (isWorkedDay(date)) {
				i++;
			}
		}
	}
	
	private static boolean isWorkedDay (Calendar date) {
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		return (dayOfWeek != 1 || dayOfWeek != 7) ;
	}
}
