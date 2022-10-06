package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	
	public static void main(String[] args) {
		String pattern = "dd/MM/yyyy  EEEE  HH:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Calendar c = Calendar.getInstance();
		
		Date date = c.getTime();
		String formatted = df.format(date);
		System.out.println(formatted);
		
		System.out.println("====================");
		String birthdayAsString = "18/7/1990";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parsedDate =  df.parse(birthdayAsString);
			Calendar parsedCalender = Calendar.getInstance();
			parsedCalender.setTime(parsedDate);
			System.out.println(parsedDate);
			System.out.println(parsedCalender);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
