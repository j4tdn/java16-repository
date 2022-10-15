package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		// LocalDate: d/M/y
		// Period: Find distance from start until end(LocalDate)
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2024, 12, 31);
		
		Period period = Period.between(start, end);
		System.out.println("period: "+period);//toString
		System.out.println("toString --> "
		        + period.getYears()+ "years\n"
				+ period.getMonths()+ "months\n"
				+ period.getDays()+ "days\n");
		
	}

}
