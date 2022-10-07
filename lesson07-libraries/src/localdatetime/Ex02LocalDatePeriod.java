package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		// LocalDate: dd/MM/yyyy
		// Period: Find distance from start(LocalDate) to end(LocalDate)
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2022, 12, 2);
		Period period = Period.between(start, end);
		System.out.println("period: " + period);
		System.out.println("=> " + period.getYears() + " years " +
			period.getMonths() + " months " + period.getDays() + " days");
	}
}
