package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		System.out.println("default timezone: " + TimeZone.getDefault());
		Calendar c = Calendar.getInstance();
		System.out.println("default time: " + format(c, TimeZone.getDefault()));
		
		System.out.println("\n==========\n");
		
		// Europe/Kiev
		Calendar kiev = Calendar.getInstance(TimeZone.getTimeZone("Europe/Kiev"));
		System.out.println("kiev time: " + format(kiev, TimeZone.getTimeZone("Europ")));
		
		System.out.println("\n==========\n");
		String[] ids = TimeZone.getAvailableIDs();
		for(String id: ids) {
			System.out.println(id);
		}
	}
	
	private static String format(Calendar c, TimeZone tz) {
		df.setTimeZone(tz);
		return df.format(c.getTime());
	}
}
