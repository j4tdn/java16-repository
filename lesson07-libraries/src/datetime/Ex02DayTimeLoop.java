package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DayTimeLoop {
	//In ra danh sách các ngày trong tuần hiện tại   
	//=>>> Epoch time
	public static void main(String[] args) {
		Locale.setDefault(new Locale("vi","VN"));
		
		Calendar now = getTime(2022,Calendar.OCTOBER,19);
		Calendar starDayOfWeek = getStarDayOfWeek(now);
		Calendar endDayOfWeek = getEndDayOfWeek(now);
		
		System.out.println("1=====");
		
		for(int i=0;i<7;i++) {
			printTime(running);
			running.add(Calendar.DAY_OF_MONTH,1);
			
			System.out.println("2=====");
			// start_date(17/10), end_date(23/7)
			
			
		}
	}
	private static Calendar getEndDayOfWeek(Calendar c) {
		Calendar result = getStartDayOfWeek(c);
		result.add(Calendar.DAY_OF_MONTH,6);
		return result;
	
	}
	
	private static Calendar getTime(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTimeInMillis(input.getTimeInMillis());
		return ouput;

	}
	private static Calendar getTime(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
	private static void printTime(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + "/" + month + "/" + year);
	}
}
