package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2022, 12, 31);
		Period period = Period.between(start, end);
		System.out.println("period :" + period);
		System.out.println("toString --> \n"
				+"year:");
	}
}
