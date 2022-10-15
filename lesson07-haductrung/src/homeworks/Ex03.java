package homeworks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03 {
	
	private static final DateFormat dfDate = new SimpleDateFormat("dd/MM/yyyy");
	private static final String PATTERN = "dd/MM/yyyy";
	public static void main(String[] args) {
		
		Timezone();
		System.out.println("====================");
		
		
		FirstDayOfWeek();
		System.out.println("====================");
		
		
		EndDayOfWeek();
		System.out.println("====================");

		
		EndDayofMonth();
		System.out.println("====================");
		
		
		WeekOfYear();
		System.out.println("====================");
		

        PlusDay();
        System.out.println("====================");
        
		
        DayOfLife();
		System.out.println("=========End========");
		
	}
	private static void Timezone() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter timezone");
		String locale= sc.nextLine();
		Calendar Localday =Calendar.getInstance(TimeZone.getTimeZone(locale));

		System.out.println("timezone: " + Localday.get(Calendar.DATE) + "/" + Localday.get(Calendar.MONTH+1) + "/"
		+ Localday.get(Calendar.YEAR) + "  " + Localday.get(Calendar.HOUR_OF_DAY) + ":" + Localday.get(Calendar.MINUTE) + ":"
				+ Localday.get(Calendar.SECOND));
		
	}
	private static void FirstDayOfWeek() {
		Calendar c =Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		System.out.println("First day of week: " + dfDate.format(c.getTime()));
	}
	
	private static void EndDayofMonth() {
		Calendar c= Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("dayEndMonth: " + dfDate.format(c.getTime()));
		
	}
	private static void DayOfLife() {
		LocalDate dateOfBirth = LocalDate.of(1999,9, 21);
		LocalDate present = LocalDate.now();
		Period period = Period.between(dateOfBirth, present);
		System.out.println("Total times when you have lived :" 
		+ period.getYears() + " year "
		+ period.getMonths() + " month "
		+ period.getDays()   + " day "
		
);
	}
	private static void PlusDay() {
		Calendar c =Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("plus 20 day: " + dfDate.format(c.getTime()));
	}
	private static void EndDayOfWeek() {
		Calendar c =Calendar.getInstance();

		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek());
		c.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println("EndDayOfWeek: " +dfDate.format(c.getTime()));

	}
	private static void WeekOfYear() {
		Calendar c= Calendar.getInstance();

		System.out.println("Week " + c.get(Calendar.WEEK_OF_YEAR) + " of year");
	}
	private static void Java8FirstDayOfWeek() {
		LocalDate now=LocalDate.now();

		DateTimeFormatter df= DateTimeFormatter.ofPattern(PATTERN);
		
	}


}