package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02WeekdayCalculatorjava8 {
	private static final String PATTERN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {
		String[] valuemonth = { "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ",
				"September ", "October ", "November ", "December " };
//		Scanner ip = new Scanner(System.in);
//		System.out.print("Enter day: ");
//		int day = ip.nextInt();
//		System.out.print("Enter month: ");
//		int month = ip.nextInt();
//		System.out.print("Enter year: ");
//		int year = ip.nextInt();

		LocalDate input = LocalDate.of(1995, 9, 25);

		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);

		System.out.println(input.getDayOfMonth() + " " + valuemonth[input.getMonthValue() - 1] + input.getYear() + " "
				+ input.getDayOfWeek());
		System.out.println("Additional facts: ");
		// lấy ra ngày cuối cùng trong năm
		LocalDate lastday = input.with(TemporalAdjusters.lastDayOfYear());
		//Line 1
		System.out.println("It is day number " + input.getDayOfYear() + " of the year,"
				+ (lastday.getDayOfYear()-input.getDayOfYear()) + " day left");
		//Line 2.
		System.out.println("It is "+input.getDayOfWeek()+"number");
		
	}
	

}
