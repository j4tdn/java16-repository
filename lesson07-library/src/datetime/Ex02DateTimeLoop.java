package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.stream.IntStream;


public class Ex02DateTimeLoop {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("vi","VN"));
		SimpleDateFormat timeFormat = new SimpleDateFormat("dd.MM.yyyy");
		Calendar now = getTime(2022, Calendar.OCTOBER, 19);
		now.get(Calendar.DATE);
		now.set(Calendar.DAY_OF_WEEK, now.getFirstDayOfWeek());
		now.get(Calendar.DATE);
		//IntStream.range(0, 7).forEach(o->{System.out.println(timeFormat.format(now.getTime()));now.add(Calendar.DAY_OF_MONTH, 1);});
	
		Calendar runnning = getTime(now);
		IntStream.range(0, 7).forEach(o->{System.out.println(timeFormat.format(runnning.getTime()));runnning.add(Calendar.DAY_OF_MONTH, 1);});
		
	
	}
	
	private static Calendar getTime(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTimeInMillis(input.getTimeInMillis());
		return output;
	}
	
	private static Calendar getTime(int year, int month, int day) {
		Calendar output = Calendar.getInstance();
		output.set(year, month, day);
		return output;
	}
	
	
}
