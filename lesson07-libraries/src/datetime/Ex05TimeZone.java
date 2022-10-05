package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone {
	private static DateFormat df = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	public static void main(String[] args) {
		System.out.println("defaul timezone: " + TimeZone.getDefault());
		Calendar c = Calendar.getInstance();
		System.out.println("calendar :" + format(c,TimeZone.getDefault()));
		System.out.println("=================");
		Calendar kiev = Calendar.getInstance();
		System.out.println("calendar of kiev :" + format(kiev,TimeZone.getTimeZone("Europe/kiev")));
		
		
	}
	private static String format(Calendar c ,TimeZone tz) {
		df.setTimeZone(tz);
		return df.format(c.getTime());
	}

}
