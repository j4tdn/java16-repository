package datetime;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex03DateFormat {
	public static void main(String[] args) {
		//Calendar, Date, String
		
		String pattern = "dd/MM/yyyy EEEE hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Calendar c = Calendar.getInstance();
		Date date = c.getTime(date);
		String formatted = df.format(date);
		System.out.println(formatted);
		
		System.out.println("=======");
		String birthdayAsString = "18/7/1990";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parsedDate = df.parse(birthdayAsString);
			Calendar parsedCalendar = Calendar.getInstance();
			parsedCalendar.setTime(parseDate);
			System.out.println(parsedDate);
			
		}
		
	}
}
