package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
		String pattern = "dd/MM/yyyy EEEE HH:mm:ss";
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = c.getTime();
		String formatted = df.format(date);
		System.out.println(formatted);
		System.out.println("=====");
		String birth ="18/07/1990";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parsed = df.parse(birth);
			Calendar parsedCalendar = Calendar.getInstance();
			parsedCalendar.setTime(parsed);
			System.out.println(parsedCalendar);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
