import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex03 {
	private static String PATTERN = "dd/MM/yyyy EEEE HH:mm:ss";
	private static String PATTERN1 = "dd/MM/yyyy EEEE ";
	
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("vi", "VN"));
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern(PATTERN1);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Now : " + df.format(now));

		Calendar cNow = Calendar.getInstance();
		cNow.set(Calendar.DATE, cNow.getActualMaximum(Calendar.DATE));
		Date lastDateOfMonth = cNow.getTime();
		System.out.println("Last day of month : " +  lastDateOfMonth);
		
		System.out.println("First day of week :  " + df1.format(now.with(DayOfWeek.MONDAY)));
		System.out.println("Last  day  of  week  : " + df1.format(now.with(DayOfWeek.SUNDAY)));
		
		int weeksInYear = cNow.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Week in year : " + weeksInYear );
		
		LocalDate notNow = LocalDate.now().plusDays(20);
		System.out.println("notNow + 20days : " + df1.format(now));
		
		
		LocalDate dayOfBirth = LocalDate.of(2001, Month.FEBRUARY, 5);
		LocalDate atMoment = LocalDate.now();
		Period period = Period.between(dayOfBirth, atMoment);
		System.out.println("I have been were born :" 
		+ period.getYears()  + " year - "
		+ period.getMonths() + " month - "
		+ period.getDays()   + " day ");
	}

}