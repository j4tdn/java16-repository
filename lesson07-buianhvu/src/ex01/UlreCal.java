package ex01;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.LocalDateTime;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class UlreCal {
	static Scanner sc = new Scanner(System.in);
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		
	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		
		LocalDateTime start = LocalDateTime.of(25, 12, 2020, 15, 20, 05);
		LocalDateTime end = LocalDateTime.of(0, 0, 0, 0, 0, 0);
		LocalDateTime now = LocalDateTime.now();

		System.out.println("Broke up ?");
		System.out.println("\n1.Yes");
		System.out.println("\n2.No");
		String choose = sc.nextLine();

		Period periodBrokeup = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration durationBrokeup = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (choose == "Yes") {
			end = LocalDateTime.of(18, 02, 2022, 9, 15, 18);
			

		}

		else {
			end = now;
		}

		System.out.println("================================");
		
			
			 LocalDate date = LocalDate.of(2020, 12, 25);
		        DayOfWeek day = date.getDayOfWeek();
		        System.out.println(day.getDisplayName(TextStyle.FULL, Locale.getDefault()));

		
		
		
		System.out.println("\n" + periodBrokeup.getYears() + " years \n" 
		        + periodBrokeup.getMonths() + " month \n"
				+ periodBrokeup.getDays() + " day \n" 
		        + durationBrokeup.toHoursPart() + " hours \n"
				+ durationBrokeup.toMinutesPart() + " minutes \n" 
		        + durationBrokeup.toSecondsPart() + " seconds");

	}

}
