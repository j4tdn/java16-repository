package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		//LocalDate : d/M/y
		//Period: Find distance from start(LocalDate) until(LocalDate)
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2022,12,31);
		
		Period period = Period.between(start, end);
		System.out.println(period);//2M28D
		System.out.println("toString --> \n" + period.getYears() + period.getMonths()+period.getDays());
	}

}
