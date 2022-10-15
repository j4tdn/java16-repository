package datetime;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

public class Ex04SundayCounter {
	private static final String PATTERN = "dd/MM/yyy E";

	public static void main(String[] args) {
		System.out.println("number of sunday " + count(Calendar.getInstance()));

	}

	private static int count(Calendar c) {
		int Count = 0;

		Calendar endDate = getEndDayOfMonth(c);
		Calendar starDate = getStartDayOfMonth(c);
		
		//printTime(starDate, PATTERN);
		//printTime(endDate, PATTERN); //		printTime(endDate,"dd/MM/yyyy");
		
		//endDate.add(Calendar.DAY_OF_MONTH, 1);
		plusDay(endDate);
		for (Calendar date = starDate; date.before(endDate);) {
			                                                //date.add(Calendar.DAY_OF_MONTH, 1)
			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				Count++;
				printTime(date, PATTERN);
				plusWeek(date);//nếu gặp chủ nhật thì +7 ngày luôn

			} else {
				plusDay(date);//nếu không phải chủ nhật thì + 1
			}
		}
		return Count;
	}

	private static void plusDay(Calendar c) {
		c.add(Calendar.DAY_OF_MONTH, 1);
	}

	private static void plusWeek(Calendar c) {
		c.add(Calendar.WEEK_OF_MONTH, 1);
	}
	
	//lấy ngày đầu của tháng-->set day=1--> ngày c thay đổi
	//lấy hàm copy để c không đổi

	private static Calendar copy(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTime(input.getTime());//setTimeInMillis
		return output;
	}

	private static Calendar getStartDayOfMonth(Calendar c) { //1
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH, 1);
		return result;
	}
	
	//lấy ngày bắt đầu của tháng

	private static Calendar getEndDayOfMonth(Calendar c) { //2
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_MONTH, result.getActualMaximum(Calendar.DAY_OF_MONTH));
		return result;                    //lấy max của DAY_OF_MONTH
	}

	private static void printTime(Calendar c, String pattern) { //3
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
		//in ra ở pattern nào thì truyền vào
	}

}
