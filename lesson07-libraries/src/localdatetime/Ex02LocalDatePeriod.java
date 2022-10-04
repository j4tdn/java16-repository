package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		//LocalDate: d/M/y
		//period: find distance for start(LocalDate) until end(LocalDate)
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2022, 12, 31);
		
		Period period = Period.between(start, end);
		System.out.println(period);
		System.out.println("toString --> \n" + period.getYears() + " years\n"
										   + period.getMonths() + " months\n"
										   + period.getDays() + " days");
		
	}

}
