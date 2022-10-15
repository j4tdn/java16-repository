package view;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex03DayFuncition {
	private static String PATTERN = "dd/MM/yyyy EEEE HH:mm:ss";
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy EEEE HH:mm:ss");
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		System.out.println("Date Time in Java 08 : "  + df.format(dt));
		
		System.out.println("==================================");
		
		System.out.println("first day now " + df.format(dt.with(DayOfWeek.MONDAY)));
		System.out.println("last day  now" + df.format(dt.with(DayOfWeek.SUNDAY)));
		System.out.println("==================================");
		
		
        LocalDate notNow = LocalDate.now().plusDays(20);
        LocalDate now = LocalDate.now();
		System.out.println("now : " + now);
		System.out.println("notNow + 20days : " + notNow);
		System.out.println("The result : " + notNow.getDayOfWeek());
		
		LocalDate dayOfBirth = LocalDate.of(2001, Month.FEBRUARY, 5);
		LocalDate atMoment = LocalDate.now();
		Period period = Period.between(dayOfBirth, atMoment);
		System.out.println("I have been were born :" 
		+ period.getYears()  + " year \n"
		+ period.getMonths() + " month \n"
		+ period.getDays()   + " day ");
		
		System.out.println("=============================");
		
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("Date Time in Java 07 : " + sdf.format(c.getTime()));
		System.out.println("Week Of Year " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + " is in the " + c.get(Calendar.WEEK_OF_YEAR) + " week ");
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.get(1);
		System.out.println("last day of month " + sdf.format(c.getTime()));
	}
}
