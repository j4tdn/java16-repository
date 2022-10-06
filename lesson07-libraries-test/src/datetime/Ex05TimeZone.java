package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	public static void main(String[] args) {
		System.out.println("default timezone " + TimeZone.getDefault());
		Calendar c = Calendar.getInstance();
		System.out.println("default Time: " + format(c,TimeZone.getTimeZone("Europe/Kiev")));
		System.out.println("=================\n");
		
		Calendar kiev = Calendar.getInstance();
		System.out.println("Kiev Time: " + kiev);
		System.out.println("=================\n");
		String[] id = TimeZone.getAvailableIDs();
//		for (String string : id) {
//			System.out.println(string);
//		}
	}
	
	private static String format(Calendar c, TimeZone tz) {
		df.setTimeZone(tz);
		return df.format(c.getTime());
	}

}
