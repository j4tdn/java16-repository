package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
		// Calendar, Date, String
		String pattern = "dd/MM/yyyy";
		// 12-hh ; 24-HH ; a-AM/PM
		// MM not mm
		DateFormat df = new SimpleDateFormat(pattern);
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		String formated = df.format(cDate);
		System.out.println(formated);
		
		System.out.println("===============================================");
		String birthdayAsString = "05/07/2002";
		try {
			Date parsedDate = df.parse(birthdayAsString);
			// parsable only when the pattern is appropriate for birthdayAsString
			// so we change the pattern into "dd//MM//yyyy"
			System.out.println(parsedDate);
			Calendar parsedCalendar = Calendar.getInstance();
			parsedCalendar.setTime(parsedDate);
			System.out.println(parsedCalendar);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
