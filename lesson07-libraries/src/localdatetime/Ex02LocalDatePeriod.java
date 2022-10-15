package localdatetime;

import java.time.LocalDate;
import java.time.Period;

public class Ex02LocalDatePeriod {
public static void main(String[] args) {
	//localdate:d/M/y
	//Period: Find distance from start(localdate) until end(localdate)
	LocalDate start = LocalDate.now();
	LocalDate end = LocalDate.of(2022, 12, 31);
	Period period = Period.between(start, end);
	System.out.println("period:"+ period);
	System.out.println("toString-->"+period.getYears()+"years\n"+ period.getMonths()+"months\n"+period.getDays()+"days");
}
}
