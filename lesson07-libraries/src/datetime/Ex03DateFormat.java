package datetime;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
         // Calendar, Date, Format
		String pattern = "dd/MM/yyyy EEEE hh:mm:ss a";
		
		DateFormat df = new SimpleDateFormat(pattern);
		
		Calendar c = Calendar.getInstance();
		Date date = c.getTime(); // convert calendar thành date
		
		String formatted = df.format(date);
		
		System.out.println(formatted);
		
		System.out.println("============================");
		String birthdayAsString = "18/7/1990";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parseDay = df.parse(birthdayAsString);
			Calendar parsedCalendar = Calendar.getInstance();
			parsedCalendar.setTime(parseDay);
			System.out.println(parsedCalendar);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
