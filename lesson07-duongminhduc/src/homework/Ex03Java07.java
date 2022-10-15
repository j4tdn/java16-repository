package homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.Year;
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
	//
		//line1();
		
		line2();
		
		line3();
		
		line4();
		
		line5();	
		
		line6();
		
		line7();
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
		
		System.out.println("Last Day Of Week: " + datetime.get(Calendar.DAY_OF_YEAR));
		
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
	public static void line7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		Calendar DateOfBirth = Calendar.getInstance();
		DateOfBirth.set(year, month, day);
		Calendar now = Calendar.getInstance();
		
		int bdoy = DateOfBirth.get(Calendar.DAY_OF_YEAR);
		now.add(Calendar.MONTH, 1);
		int ndoy = now.get(Calendar.DAY_OF_YEAR);
		System.out.println("n: " + ndoy);
		System.out.println("b: " + bdoy);
		if(ndoy < bdoy)
		{
			ndoy += 365;
			DateOfBirth.add(Calendar.YEAR, 1 );
		}
		int numyear = now.get(Calendar.YEAR) - DateOfBirth.get(Calendar.YEAR);
		System.out.println("You lived: " + ((ndoy - bdoy) + numyear*365 ) + " days" );
		
	}
}
