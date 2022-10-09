package datetime;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex05TimeZone {
	public static void main(String[] args) {
		System.out.println("defauls timeZone: " + TimeZone.getDefault());
		Calendar c = Calendar.getInstance();
		System.out.println(Arrays.toString(TimeZone.getAvailableIDs()));
		System.out.println("defauls time: " + format(c));
		
		Calendar kiev = Calendar.getInstance(TimeZone.getTimeZone("Europe/Kiev"));
		System.out.println("kiev time: " + format(kiev));
		
	}
	
	private static String format(Calendar c) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy, HH:mm:ss");
		df.setTimeZone(c.getTimeZone());
		return df.format(c.getTime());
	}
}
