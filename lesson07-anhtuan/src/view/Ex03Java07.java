package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex03Java07 {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static DateFormat dc = new SimpleDateFormat("dd/MM/yyyy");
	private static DateFormat da = new SimpleDateFormat("dd/MM/yyyy EEEE");
	private static DateFormat dd = new SimpleDateFormat("dd");
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(format(c, TimeZone.getTimeZone("Euro/Kiev")));
		
		endDayOfMonth(c);
		endDayOfWeek(c);
		startDayOfWeek(c);
		System.out.println("week of year: " + c.get(Calendar.WEEK_OF_YEAR));
		daylater(c);
		birthday(c);
		
		
		
	}
	private static String format(Calendar c, TimeZone tz) {
		df.setTimeZone(tz);
		return df.format(c.getTime());
	}
	private static void endDayOfMonth(Calendar c) {
		Calendar d = copy(c);
		d.set(Calendar.DAY_OF_MONTH, d.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("The last day of the month: "+ dc.format(d.getTime()));
	}
	private static void endDayOfWeek(Calendar c) {
		Calendar d = copy(c);
		d.set(Calendar.DAY_OF_WEEK, d.getActualMaximum(Calendar.DAY_OF_WEEK));
		System.out.println("The last day of the week: " + dc.format(d.getTime()));
	}
	private static void startDayOfWeek(Calendar c) {
		Calendar d = copy(c);
		d.set(Calendar.DAY_OF_WEEK, d.getActualMinimum(Calendar.DAY_OF_WEEK));
		System.out.println("The start day of the week: " + dc.format(d.getTime()));
	}
	private static void daylater(Calendar c) {
		Calendar d = copy(c);
		d.add(Calendar.DAY_OF_YEAR, 20);
		System.out.println("20 day later is: " + da.format(d.getTime()));
	}
	private static void birthday(Calendar c) {
		Calendar d = copy(c);
		Calendar b = Calendar.getInstance();
	    b.set(1999, 05, 12);
	    Date date1 = d.getTime();
	    Date date2 = b.getTime();
	    d.setTime(date1);
	    b.setTime(date2);
	    Calendar c1 = Calendar.getInstance();
	    
	    long no = (d.getTime().getTime() - b.getTime().getTime())/ (24 * 60 * 60 * 1000);
	    System.out.println(d.getTime()+""+ b.getTime() + "  "+da.format(no));
		System.out.println("day " + no);
		
		
		
	}
	private static Calendar copy(Calendar c) {
		Calendar output = Calendar.getInstance();
		output.setTime(c.getTime());
		return output;
	}

}
