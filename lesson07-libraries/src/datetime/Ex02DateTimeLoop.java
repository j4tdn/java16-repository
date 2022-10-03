package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DateTimeLoop {

	public static void main(String[] args) {
		// In ra các ngày trong tuần hiện tại
		// Today: 19.10.2022
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar now = gettime(2022, Calendar.OCTOBER, 31);
		Calendar startDayOfWeek = getStartDayOfWeek(now);
		Calendar endDayOfWeek = getEndDayOfWeek(now);	
		printTime(now);
		printTime(getStartDayOfWeek(now));
		
		System.out.println("========================Cách 1=================================");
		Calendar running = gettime(startDayOfWeek);
		
		
		for(int i = 0;i<7;i++)
		{
			printTime(running);
			running.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("========================Cách 2=================================");
		System.out.print("Start: ");printTime(startDayOfWeek);
		
		System.out.print("End: ");printTime(endDayOfWeek);
		System.out.println("\n");
		endDayOfWeek.add(Calendar.DAY_OF_MONTH, 1);
		for(Calendar date = startDayOfWeek; date.before(endDayOfWeek) ; date.add(Calendar.DAY_OF_MONTH, 1))
		{
			printTime(date);
		}
		
	}
	private static Calendar gettime(Calendar input)
	{
		Calendar output = Calendar.getInstance();
	    output.setTimeInMillis(input.getTimeInMillis());
		return output;
	}
	private static Calendar gettime(int year, int month, int day)
	{
		Calendar c = Calendar.getInstance();
		c.set(year, month,day);
		return c;
	}
	private static void printTime(Calendar c)
	{
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + "/" + (month + 1) + "/" + year);
	}
	private static Calendar getStartDayOfWeek(Calendar c)
	{
		Calendar result = Calendar.getInstance();
		result.setTimeInMillis(c.getTimeInMillis());//copy thời gian của c đến result
		
		result.add(Calendar.DAY_OF_MONTH, result.getFirstDayOfWeek() - result.get(Calendar.DAY_OF_WEEK));
		return result;
	}
	private static Calendar getEndDayOfWeek(Calendar c)
	{
		Calendar result = getStartDayOfWeek(c);
		result.add(Calendar.DAY_OF_MONTH, 6);
		return result;
		
		
	}
	
}
