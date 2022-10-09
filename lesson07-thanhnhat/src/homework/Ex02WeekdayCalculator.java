package homework;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02WeekdayCalculator {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995, Calendar.SEPTEMBER, 25);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		String[] weekdays = {"Sunday", "Monday", "Tuesday", 
				"Wednesday", "Thurday", "Friday", "Saturday"};
		System.out.println("25 September 1995 is a " + weekdays[dayOfWeek-1]);
		
		System.out.println("\nAdditional facts");
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int doy = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("* It is day number " + dayOfYear 
				+ " of the year, " + (doy-dayOfYear) + " days left");
	
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		int woy = c.getActualMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("* It is " + weekdays[dayOfWeek-1] + " number "
				+ weekOfYear + " out of " + woy + " in " + c.get(1));

		String[] monthdays = {"January", "February", "March", "April", "Autumn",
				"June", "July", "August", "September", "October","November", "December"};
		int dayOfWeekInMonth = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int dowim = c.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("* It is " + weekdays[dayOfWeek-1] + " number "
				+ dayOfWeekInMonth + " out of " + dowim + " in " 
				+ monthdays[c.get(2)] + " " + c.get(1));
		
		System.out.println("* Year " + c.get(1) + " has " + doy + " days");
		
		int dom = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("* " + monthdays[c.get(2)] + " has " + dom + " days");
	}

}
