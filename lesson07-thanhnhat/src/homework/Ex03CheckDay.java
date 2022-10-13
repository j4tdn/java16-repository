package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex03CheckDay {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date datenow = new Date();
		String datef = df.format(datenow);
		System.out.println("Time now: " + datef);

		df = new SimpleDateFormat("dd/MM/yyyy");
		Date ld = new Date();
		ld.setDate(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		String ldom = df.format(ld);
		System.out.println("The last day of this month: " + ldom);

		int fdow = c.getFirstDayOfWeek();
		int now = c.get(Calendar.DAY_OF_WEEK);
		for (int i = now; i > fdow; i--) {
			c.add(Calendar.DAY_OF_MONTH, -1);
		}
		int fd = c.get(Calendar.DAY_OF_MONTH);
		c = Calendar.getInstance();
		for (int i = now; i < 8; i++) {
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		int ld1 = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("The first day of this week is " + fd 
				+ " and the last day of this week is " + ld1);
		
		c = Calendar.getInstance();
		int week = c.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Week now: " + week);
		
		c.add(Calendar.DAY_OF_MONTH, 20);
		String[] weekdays = {"Sunday", "Monday", "Tuesday", 
				"Wednesday", "Thurday", "Friday", "Saturday"};
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("20 more days will be: " + c.get(Calendar.DAY_OF_MONTH) + " and day of week is: " 
				+ weekdays[dayOfWeek-1]);
		
		try {
			c.set(2000, 10, 20);
			Date currentDay = new Date();
			Calendar a = Calendar.getInstance();
			String startDay = "20/10/2000 20:00:00";
			String endDay = df.format(currentDay);
			
			Date d1 = df.parse(startDay);
			Date d2 = df.parse(endDay);
			long getTime = d2.getTime() - d1.getTime();
			long getTimeinDay = TimeUnit.MILLISECONDS.toDays(getTime);
			System.out.println("It's been " + getTimeinDay + " days since your birthday!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
