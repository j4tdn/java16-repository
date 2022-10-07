package datetime;

import java.util.Calendar;

public class Ex04SundayCounter {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("So ngay chu nhat trong thang: " + count(c));
	}

	public static int count(Calendar c) {
		int count = 0;
		Calendar fdom = Calendar.getInstance();
		fdom.setTimeInMillis(c.getTimeInMillis());
		fdom.set(Calendar.DAY_OF_MONTH, 1);
		Calendar ldom = Calendar.getInstance();
		ldom.setTimeInMillis(c.getTimeInMillis());
		ldom.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH)); // Chú ý không dùng getMaximum chỉ
																					// cho ra giá trị 31
		ldom.add(Calendar.DAY_OF_MONTH, 1);
		for (Calendar date = fdom; date.before(ldom); date.add(Calendar.DAY_OF_MONTH, 1)) {
			if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				count++;
			}
		}
		return count;
	}
}
