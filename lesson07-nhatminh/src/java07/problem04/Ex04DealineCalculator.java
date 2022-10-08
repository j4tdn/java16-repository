package java07.problem04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java07.utils.DateTimeUtils;

public class Ex04DealineCalculator {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		deadlineCalculator(c, 1);
		c.set(2022, Calendar.JUNE, 07);
		deadlineCalculator(c, 110);
	}

	private static void deadlineCalculator(Calendar c, int period) {
		int numOfWeek = period / 5;
		int remain = period % 5;
		Calendar result = Calendar.getInstance();
		result = DateTimeUtils.copy(c);
		result.add(Calendar.DAY_OF_YEAR, numOfWeek * 7);
		while (remain != 0) {
			result.add(Calendar.DAY_OF_YEAR, 1);
			int dow = result.get(Calendar.DAY_OF_WEEK);
			if (dow != Calendar.SUNDAY && dow != Calendar.SATURDAY)
				remain--;
		}
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Deadline: " + df.format(result.getTime()));
	}
}
