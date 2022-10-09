package homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03Java07 {
	private static Scanner sc = new Scanner(System.in);
	private static final DateFormat df1= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static final DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
	private static final DateFormat df3 = new SimpleDateFormat("dd/MM/yyyy EEEE");
	
	public static void main(String[] args) {
	System.out.println("\n");
		line1();
		
		line2();
		
		line3();
		
		line4();
		
		line5();
		
		
		
		
		
	}
	public static void line1()
	{
		Calendar datetime = Calendar.getInstance();
		System.out.print("Enter TimeZone Locale: ");
		String locale = sc.nextLine();
		df1.setTimeZone(TimeZone.getTimeZone(locale));
		System.out.println(locale + " time: " + df1.format(datetime.getTime()));
	}
	public static void line2()
	{
		Calendar datetime = Calendar.getInstance();
		datetime.set(Calendar.DAY_OF_MONTH, datetime.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Last day of this month: " + df2.format(datetime.getTime()));
	}
	public static void line3()
	{
		Calendar datetime = Calendar.getInstance();
		
		System.out.println("Firt Day Of Week: " + datetime.getFirstDayOfWeek());
		
	}
	public static void line4()
	{
		Calendar datetime = Calendar.getInstance();
		datetime.getFirstDayOfWeek();
		datetime.add(Calendar.DAY_OF_YEAR, 6);
		
		System.out.println("Firt Last Of Week: " + datetime.DAY_OF_YEAR);
		
	}
	public static void line5()
	{
		Calendar c = Calendar.getInstance();
		System.out.println("Week of year: " + c.get(Calendar.WEEK_OF_YEAR));
	}
	public static void line6()
	{
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 20);
		System.out.println("Next 20 days: " + df3.format(c.getTime()));
	}
}
