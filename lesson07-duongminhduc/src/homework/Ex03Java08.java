package homework;


import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;

import java.util.Locale;
import java.util.Scanner;

public class Ex03Java08 {
	private static Scanner sc = new Scanner(System.in);
	private static final String PATTERN1 = "dd/MM/yyyy hh:mm:ss";
	private static final String PATTERN2 = "dd/MM/yyyy";
	
	public static void main(String[] args) {
       line1();
       
       line2();
       
       line3();
       
       line4();
  
       line5();
       
       line6();
	}
	public static void line1()
	{
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN1);
		String text = df.format(now);
		System.out.println("Date Time Now: " + text);		
	}
	public static void line2()
	{
		LocalDate now = LocalDate.now();
		int d = now.lengthOfMonth();
		int y = now.getYear();
		int m = now.getMonthValue();
	
		LocalDate end = LocalDate.of(y, m, d);
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN2);
		System.out.println("End Date Of Month: " + df.format(end));
	}
	private static void line3()
	{
		LocalDate now = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN2);
        System.out.println("Firt day of week: " + df.format(now.with(WeekFields.of(Locale.US).dayOfWeek(),1L)));
        System.out.println("Last day of week: " + df.format(now.with(WeekFields.of(Locale.US).dayOfWeek(),7L)));
	}
	private static void line4()
	{
		LocalDate now = LocalDate.now();
		WeekFields wf  = WeekFields.of(Locale.US);
		System.out.println("Week of year: " + now.get(wf.weekOfWeekBasedYear()));
	}
	private static void line5()
	{
		LocalDate now = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN2);
		System.out.println("Next 20 days: " + df.format(now.plusDays(20)));
	}
	private static void line6()
	{
		LocalDate now  = LocalDate.now();
		
		int day,month,year;
		while(true)
		{
			try {
				System.out.println("Enter day: ");
				day = sc.nextInt();
				System.out.println("Enter month: ");
			    month = sc.nextInt();
				System.out.println("Enter year: ");
			    year = sc.nextInt();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Error Day");
			}
		}
		LocalDate BirthDay = LocalDate.of(year, month, day);
		int bdoy = BirthDay.getDayOfYear();
    	int ndoy = now.getDayOfYear();
	
		if(ndoy < bdoy)
		{
			ndoy += 365;
			BirthDay.plusYears(1);
		}
		int numyear = now.getYear() - BirthDay.getYear();
		System.out.println("You lived: " + ((ndoy - bdoy) + numyear*365 ) + " days" );
		
		
	}
}
