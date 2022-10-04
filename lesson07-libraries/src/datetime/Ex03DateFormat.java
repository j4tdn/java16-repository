package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	public static void main(String[] args) {
		// Calendar, Date, String
		
		String pattern = "dd/MM/yyyy EEEE hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		String formatted = df.format(date);
		System.out.println(formatted);
		
		System.out.println("=======================");
		String birthDayAsString = "17/9/1999";
		df = new SimpleDateFormat("dd/MM/yyy");
		try {
			Date parseDate = df.parse(birthDayAsString);
			Calendar parseC = Calendar.getInstance();
			parseC.setTime(parseDate);
			System.out.println(parseDate);
			System.out.println(parseC);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
