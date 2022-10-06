package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
		// Localdate : d/M/y
		// Period : find distance from start(LocalDate) until end(LocalDate)
	public static void main(String[] args) {
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2022, 12, 31);
		
		Period period = Period.between(start, end);
		System.out.println("period: " + period);
		System.out.println("toString --> " + period.getYears() + "Year\n"
						+ period.getYears() + "year\n"
						+ period.getMonths() + "month\n"
						+ period.getDays() + "day\n");
		
	}
}
