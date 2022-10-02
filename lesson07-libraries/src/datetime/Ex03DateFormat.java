package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
		// Calendar, Date, String
		String pattern = "dd/MM/yyy EEEE hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);

		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		String formatted = df.format(date);

		System.out.println(formatted);

		System.out.println("==================");

		String birthdayAsString = "18/07/1990";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parseDate = df.parse(birthdayAsString);
			Calendar parCalendar = Calendar.getInstance();
			parCalendar.setTime(parseDate);
			System.out.println(parseDate);
			System.out.println(parCalendar);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
