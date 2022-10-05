package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DateTimeLoop {
	//in ra các ngày trong tuần
	//today: 19.10.2022
	public static void main(String[] args) {
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar now = getTime(2022, Calendar.OCTOBER, 19);
		Calendar enday = getEndDayOfWeek(now);
		getStartDayOfWeek(now);
		printfTime(now);
		printfTime(getStartDayOfWeek(now));
		Calendar running = getTime(getStartDayOfWeek(now));
		for(int i =0; i < 7; i++) {
			printfTime(running);
			running.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("=============");
		
		getEndDayOfWeek(now).add(Calendar.DAY_OF_MONTH, 1);
		for(Calendar date = getStartDayOfWeek(now); date.before(getEndDayOfWeek(now)); date.add(Calendar.DAY_OF_MONTH, 1)){
			printfTime(date);
		}
		
	}
	private static Calendar getTime(int i, int october, int j) {
		Calendar c = Calendar.getInstance();
		c.set(i, october, j);
		return c;
	}
	private static Calendar getStartDayOfWeek(Calendar c) {
		Calendar result = Calendar.getInstance();
		result.setTimeInMillis(c.getTimeInMillis());
		result.add(c.DAY_OF_MONTH, result.getFirstDayOfWeek() - result.get(Calendar.DAY_OF_WEEK));
		return result;
	}
	private static Calendar getEndDayOfWeek(Calendar c) {
		Calendar result = getStartDayOfWeek(c);
		result.add(Calendar.DAY_OF_MONTH, 6);
		
		
		return result;
	}
	private static Calendar getTime(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTimeInMillis(output.getTimeInMillis());
		return output;
	}
	private static void printfTime(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day +"/" + (month + 1) +"/" + year);
		
	}
}
