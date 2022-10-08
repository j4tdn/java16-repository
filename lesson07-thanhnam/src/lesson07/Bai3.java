package lesson07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Bai3 {
	
	private static final String PATTERN = "dd/MM/yyyy ";
	private static final SimpleDateFormat dow = new SimpleDateFormat("dd/MM/yyyy ");
	
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		
		String text = df.format(now);
		
		System.out.println("now: " + text);
		System.out.println("First Days : "+ df.format(now.with(DayOfWeek.MONDAY)));
		System.out.println("Last Days: "+ df.format(now.with(DayOfWeek.SUNDAY)));
		
		LocalDate ft = LocalDate.now().plusDays(20);
		System.out.println("after 20 days: "+ ft );
		
		
		LocalDate Birthday = LocalDate.of(2001, 10, 14);
		LocalDate pr = LocalDate.now();
		
		Period period = Period.between(Birthday, pr);
		
		System.out.println("I lived: "
				+ period.getYears()+" Years \n"
				+ period.getMonths()+" Months \n"
				+ period.getDays()+" Days \n");
		
		System.out.println("================");
		
		
		Calendar cNow = Calendar.getInstance();
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);
		int month = cNow.get(Calendar.MONTH)+1;
		int year = cNow.get(Calendar.YEAR);
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("c Date: " + currentDate);
		
		
		cNow.set(Calendar.DAY_OF_WEEK, cNow.getFirstDayOfWeek());
		System.out.println("First Days Of Week: " + dow.format(cNow.getTime()));
		
		cNow.set(Calendar.DAY_OF_WEEK, cNow.getFirstDayOfWeek());
		cNow.add(Calendar.DAY_OF_YEAR, 6);
		System.out.println("Last day of week: " + dow.format(cNow.getTime()));
		System.out.println("Week Of Year: " + cNow.get(Calendar.WEEK_OF_YEAR));
		
		cNow.add(Calendar.DAY_OF_YEAR, 20);
		System.out.println("20 days: " + dow.format(cNow.getTime()));
		
		
		cNow.set(Calendar.DAY_OF_MONTH, cNow.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Last days of month: " + dow.format(cNow.getTime()));
	}
}
