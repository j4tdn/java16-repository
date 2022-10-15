package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DateTimeLoop {
	// in ra các ngày trong tuần có chứa ngày hiện tại
	// today: 19/10/2022
	public static void main(String[] args) {
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar now = getTime(2022, Calendar.OCTOBER, 19);// 2
		Calendar StartOfWeek = getStartOfWeek(now);//lấy đc ngày đầu tuần
		Calendar EndDayOfWeek = getEndDayOfWeek(now);

		printTime(now);//(3) in ra ngày tháng năm hiện tại
		printTime(StartOfWeek);
		System.out.println("=================1st===================");
		Calendar running = getTime(StartOfWeek);//giữ lại giá trị của StartOfWeek

		for (int i = 0; i < 7; i++) {
			printTime(running);
			running.add(Calendar.DAY_OF_MONTH, 1);
			//StartOfWeek.add(Calendar.DAY_OF_MONTH, 1);=23--> không reused được

		}
		System.out.println("=================2nd===================");
		//cần biết start-date(17/10), end-date(23/10)
		printTime(StartOfWeek);
		printTime(EndDayOfWeek);
		
		EndDayOfWeek.add(Calendar.DAY_OF_MONTH, 1);//tăng EndDayOfWeek lên 1
		System.out.println("--------");
		for (Calendar date = StartOfWeek; date.before(EndDayOfWeek); date.add(Calendar.DAY_OF_MONTH, 1)) {
			printTime(date);             //trong khi date bé hơn EndDayOfWeek
		}

	}

	private static Calendar getStartOfWeek(Calendar c) {//ngày bắt đầy của tuần


		Calendar result = Calendar.getInstance();//mục đích là get ra ngày đầu tuần
		result.setTimeInMillis(c.getTimeInMillis());//không thay đổi now
        //tạo biến result rồi copy thời gian của Calendar.c đưa vào result
		//-->result có đầy đủ thông tin cl=ủa Calendar.c rồi  nhưng nó là 1 biến/ô nhớ khác
		
		//c.add(Calendar.DAY_OF_MONTH, 
		result.add(Calendar.DAY_OF_MONTH, 
				result.getFirstDayOfWeek() - result.get(Calendar.DAY_OF_WEEK));
		return result;
	}

	private static Calendar getTime(Calendar input) {
		Calendar output = Calendar.getInstance();
		output.setTimeInMillis(input.getTimeInMillis());
		return output;
	}

	private static Calendar getEndDayOfWeek(Calendar c) {
		Calendar result = getStartOfWeek(c);
		result.add(Calendar.DAY_OF_MONTH, 6);
		return result;

	}

	private static Calendar getTime(int year, int month, int day) {//(1)
		Calendar c = Calendar.getInstance();//lấy ngày hiện tại
		c.set(year, month, day);
		return c;
	}

	private static void printTime(Calendar c) {// (3) in ra ngày tháng năm của c
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + "/" + (month + 1) + "/" + year);
	}

}
