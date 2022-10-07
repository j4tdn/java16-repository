package view;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Ex03 {
	private static String PATTERN ="dd/MM/yyyy EEEE HH:mm:ss";
	private static SimpleDateFormat simpleDf = new SimpleDateFormat("dd/MM/yyyy EEEE");
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		System.out.println("Java 08 : "  + df.format(datetime));
		System.out.println("first day " + df.format(datetime.with(DayOfWeek.MONDAY)));
		System.out.println("last day  " + df.format(datetime.with(DayOfWeek.SUNDAY)));
        LocalDate future = LocalDate.now().plusDays(20);
        LocalDate now = LocalDate.now();
		System.out.println("now : " + now);
		System.out.println("future + 20days : " + future);
		System.out.println("The future date after adding days : " + future.getDayOfWeek());
		
		LocalDate dateOfBirth = LocalDate.of(2001, Month.DECEMBER, 11);
		LocalDate present = LocalDate.now();
		Period period = Period.between(dateOfBirth, present);
		System.out.println("Total times when you have lived :" 
		+ period.getYears() + " year "
		+ period.getMonths() + " month "
		+ period.getDays()   + " day "
		
);
		
		System.out.println("=============================");
		
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Java 07 : " + simpleDf.format(c.getTime()));
		System.out.println("Week Of Year " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + " is in the " + c.get(Calendar.WEEK_OF_YEAR) + " week ");
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.get(1);
		System.out.println("last day of month " + simpleDf.format(c.getTime()));
		
		}
	
	}


