package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	public static void main(String[] args) {
		System.out.println("default timezone: " + TimeZone.getDefault());
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		System.out.println("default time: " + format(c));
		
		System.out.println("=============================");
		
		Calendar kiev = Calendar.getInstance();
		System.out.println("kiev time: " + format(kiev, TimeZone.getTimeZone("Europe/kiev") ));
		
		System.out.println("=============================");
		
		String[] ids = TimeZone.getAvailableIDs();
		for (String id:ids) {
			System.out.println(id);
		}
		
	}
	
	private static String format(Calendar c) {
		return df.format(c.getTime());
	}
	
	private static String format (Calendar c, TimeZone tz) {
		df.setTimeZone(tz);
		return df.format(c.getTime());
	}
}
