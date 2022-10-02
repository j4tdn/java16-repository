package datetime;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03DateFormat {

	public static void main(String[] args) {
		// Calendar, Date, String
		
		String pattern = "dd/MM/yyyy EEEE hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		String formatted = df.format(date);
		System.out.println(formatted);
			
		System.out.println("===============");
		String birthdayAsString = "18/07/1990";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parsedDate = df.parse(birthdayAsString);
			Calendar parsedCalendar = Calendar.getInstance();
			parsedCalendar.setTime(parsedDate);
			
			System.out.println(parsedDate);
			System.out.println(parsedCalendar);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
