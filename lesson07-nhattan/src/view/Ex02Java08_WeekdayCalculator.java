package view;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02Java08_WeekdayCalculator {
	private static final String PATTERN = "dd/MM/yyyy";
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		do {
			try {
				System.out.print("Enter the date (" + PATTERN + "): ");
				date = input(date);
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} while (true);
		
		DayOfWeek dow = date.getDayOfWeek();
		int dom = date.getDayOfMonth();
		int doy = date.getDayOfYear();
		int daysLeft = date.lengthOfYear() - date.getDayOfYear();
		Month month = date.getMonth();
		int year = date.getYear();
		
		
		System.out.println(dom + " " + month + " " + year + " is a " + dow);
		
		System.out.println("\nAdditionals facts");
		System.out.println("\tIt is day number " + doy + " of the year, "
									         + daysLeft + " days left");
		System.out.println("\tIt is " + dow
						 + " number " + ordinalDowInYear(date) 
						 + " out of " + numberOfDowInYear(date) 
						 + " in " + year);
		
		System.out.println("\tIt is " + dow
						 + " number " + ordinalDow(date)
						 + " out of " + numberOfDow(date)
						 + " in " + month + " " + year);
		
		System.out.println("\tYear " + year + " has " + date.lengthOfYear());
		System.out.println("\t" + month + " " + year 
						 + " has " + date.lengthOfMonth() + " days");
	}
	
	private static LocalDate input(LocalDate date) throws ParseException {
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		date = LocalDate.parse(new Scanner(System.in).nextLine(), df);
		return date;
	}
	
	private static int numberOfDow(LocalDate date) {
		
		int dayOfMonth = date.getDayOfMonth();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int maxDow = date.lengthOfMonth();
		
		for (int i = maxDow; i > 28; i--) {
			date = date.withDayOfMonth(i);
			if (date.getDayOfWeek().equals(dayOfWeek)) {
				date = date.withDayOfMonth(dayOfMonth);
				return 5;
			}
		}
		date = date.withDayOfMonth(dayOfMonth);
		return 4;
	}
	
	private static int ordinalDow(LocalDate date) {
		int dayOfMonth = date.getDayOfMonth();
		return dayOfMonth % 7 == 0 ? dayOfMonth / 7 : dayOfMonth / 7 + 1;
	}
	
	private static int numberOfDowInYear(LocalDate date) {
		DayOfWeek dow = date.getDayOfWeek();
		date = date.withMonth(Month.JANUARY.getValue());
		int count = 0;

		for (int i = 1; i <= 12; i++) {
			date = date.withMonth(i).withDayOfMonth(1);
			
			date = firstDayOfWeekInMonth(dow, date);
			count += numberOfDow(date);
		}
		return count;
	}
	
	private static LocalDate firstDayOfWeekInMonth(DayOfWeek dayOfWeek, LocalDate date) {
		for (int i = 1; i < 7; i++) {
			if(isDayOfWeek(dayOfWeek, date)) {
				break;
			}
			date = date.plusDays(1);
		}
		return date;
	}
	
	private static boolean isDayOfWeek(DayOfWeek dow, LocalDate date) {
		return date.getDayOfWeek() == dow;
	}
	
	private static int ordinalDowInYear(LocalDate date) {
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		Month month = date.getMonth();
		
		// tinh so luong dow cua thang hien tai
		int count = ordinalDow(date); 
		
		// tru thang hien tai ra
		for (int i = month.getValue() - 1; i >= 1; i--) { 
			date = date.withMonth(i).withDayOfMonth(1);
			date = firstDayOfWeekInMonth(dayOfWeek, date);
			count += numberOfDow(date);
		}
		return count;
	}
	
}
	
