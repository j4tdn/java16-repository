package java08.problem04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex04DeadlineCalculator {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		deadlineCalculator(now, 1);
		LocalDate date = LocalDate.of(2022, 06, 07);
		deadlineCalculator(date, 110);
	}

	private static void deadlineCalculator(LocalDate c, int period) {
		int numOfWeek = period / 5;
		int remain = period % 5;
		LocalDate result = c.plusDays(numOfWeek * 7);
		while (remain != 0) {
			result = result.plusDays(1);
			DayOfWeek dow = result.getDayOfWeek();
			if (dow != DayOfWeek.SUNDAY && dow != DayOfWeek.SATURDAY)
				remain--;
		}
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Deadline: " + df.format(result));
	}
}
