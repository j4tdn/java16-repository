package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {

		// LocalDate :d/M/y
		// Period : Find distance from start (LocalDate) until end (LocalDate)
		
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2024, 12, 31);
		
		Period period = Period.between(start, end);
		System.out.println("Period: " + period);
		System.out.println("toString --> \n" + period.getYears() + " years\n" 
		+ period.getMonths() + " month\n" + period.getDays() + " days\n");
		
	}
}
