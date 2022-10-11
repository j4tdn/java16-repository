package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03Functions {
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("Europe/Kiev");
		System.out.println("Thời gian hiện tại (dd/MM/yyyy HH:mm:ss) ở khu vực " + tz.getDisplayName());
		getTimeZone(tz);
		lastDayInCurrentMonth();
		getDayInWeek();
		getCurrentInWeek();
		getTwentyDays();
		System.out.print("Nhập vào ngày tháng năm sinh(dd/MM/yyyy): ");
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date birthday = df.parse(new Scanner(System.in).nextLine());
			getMyLived(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static void getTimeZone(TimeZone timeZone) {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		df.setTimeZone(timeZone);
		System.out.println(df.format(date));
	}

	private static void lastDayInCurrentMonth() {
		Calendar ld = Calendar.getInstance();
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + ld.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	private static void getDayInWeek() {
		Calendar firstDayOfWeek = Calendar.getInstance();
		Calendar lastDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.add(Calendar.DAY_OF_MONTH,
				firstDayOfWeek.getFirstDayOfWeek() - firstDayOfWeek.get(Calendar.DAY_OF_WEEK));
		lastDayOfWeek.add(Calendar.DAY_OF_MONTH, 7 - lastDayOfWeek.get(Calendar.DAY_OF_WEEK));
		System.out.println("Ngày đầu tiên của tuần hiện tại: " + firstDayOfWeek.get(Calendar.DAY_OF_MONTH));
		System.out.println("Ngày cuối cùng của tuần hiện tại: " + lastDayOfWeek.get(Calendar.DAY_OF_MONTH));
	}

	private static void getCurrentInWeek() {
		Calendar c = Calendar.getInstance();
		System.out.println("Ngày hiện tại đang ở tuần thứ " + c.get(Calendar.WEEK_OF_YEAR) + " trong năm");
	}

	private static void getTwentyDays() {
		String[] dayOfWeeks = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(
				"20 ngày nữa sẽ là: " + df.format(c.getTime()) + "," + dayOfWeeks[c.get(Calendar.DAY_OF_WEEK) - 1]);
	}

	private static void getMyLived(Date birthday) {
		Date current = new Date();
		long start = birthday.getTime();
		long end = current.getTime();
		System.out.println("Bạn đã sống được " + (end - start) / (24 * 60 * 60 * 1000) + " days ");
	}

}
