package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import bean.DayOfWeek;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02Java07_WeekdayCalculator {
	private static final String PATTERN = "dd/MM/yyyy";
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		do {
			try {
				System.out.print("Enter the date (" + PATTERN + "): ");
				input(c);
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} while (true);
		
		int dom = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);
		int doy = c.get(Calendar.DAY_OF_YEAR);
		int daysLeft = c.getActualMaximum(Calendar.DAY_OF_YEAR) - doy;
		DayOfWeek[] dowEnum = DayOfWeek.values();
		DayOfWeek dow = dowEnum[c.get(Calendar.DAY_OF_WEEK) - 1];
		Month month = Month.of(c.get(Calendar.MONTH) + 1);
		
		System.out.println(dom + " " + month + " " 
							   + year + " is a " + dow);
		System.out.println("\nAdditionals facts");
		System.out.println("\tIt is day number " + doy + " of the year, "
										         + daysLeft + " days left");
		System.out.println("\tIt is " + dow
									  + " number " + ordinalDowInYear(c) 
									  + " out of " + numberOfDowInYear(c) 
									  + " in " + year);
		
		System.out.println("\tIt is " + dow
									  + " number " + ordinalDow(c)
									  + " out of " + numberOfDow(c)
									  + " in " + month + " " + year);
		
		System.out.println("\tYear " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println("\t" + month + " " + year 
								+ " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
	
	private static void input(Calendar c) throws ParseException {
		DateFormat df = new SimpleDateFormat(PATTERN);
		Date date = df.parse(new Scanner(System.in).nextLine());
		c.setTime(date);
	}
	
	private static int numberOfDow(Calendar c) {
		
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int maxDow = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		for (int i = maxDow; i > 28; i--) {
			c.set(Calendar.DAY_OF_MONTH, i);
			if (c.get(Calendar.DAY_OF_WEEK) == dayOfWeek) {
				c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
				return 5;
			}
		}
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
		return 4;
	}
	
	private static int ordinalDow(Calendar c) {
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		return dayOfMonth % 7 == 0 ? dayOfMonth / 7 : dayOfMonth / 7 + 1;
	}
	
	private static int numberOfDowInYear(Calendar date) {
		Calendar c = copy(date);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		c.set(Calendar.MONTH, 0);
		int count = 0;
		for (int i = 0; i < 12; i++) {
			c.set(Calendar.MONTH, i);
			c.set(Calendar.DAY_OF_WEEK, dayOfWeek);
			count += numberOfDow(c);
		}
		return count;
	}
	
	private static int ordinalDowInYear(Calendar date) {
		Calendar c = copy(date);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int month = c.get(Calendar.MONTH);
		
		int count = ordinalDow(c);
		for (int i = month - 1; i >= 0; i--) {
			c.set(Calendar.MONTH, i);
			c.set(Calendar.DAY_OF_WEEK, dayOfWeek);
			count += numberOfDow(c);
		}
		return count;
	}
	
	public static Calendar copy(Calendar source) {
		Calendar destination = Calendar.getInstance();
		destination.setTime(source.getTime());
		return destination;
	}
	
}
