package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex06DatingTime {
	public static void main(String[] args)  {

		LocalDateTime start = LocalDateTime.of(2018, 8, 1, 23, 10, 10);
		LocalDateTime end = LocalDateTime.now();
		
		if(end.isBefore(start))
		{
			throw new IllegalArgumentException("StartDay must less than EndDay");
		}
		LocalDate ld1 = start.toLocalDate();
		LocalTime lt1 = start.toLocalTime();
		LocalDate ld2 = end.toLocalDate();
		LocalTime lt2 = end.toLocalTime();
		Period pr = Period.between(ld1, ld2);
		Duration dr = Duration.between(lt1, lt2);
		
		if(dr.isNegative()) // nếu dr âm
		{
			dr = dr.plusDays(1);
			pr = pr.minusDays(1);
		}
		System.out.println("DatingTime: \n" 
		        + pr.getYears() + " years\n" 
				+ pr.getMonths() + " month\n" 
		        + pr.getDays() + " days\n"
				+ dr.toHoursPart() + " hours\n" 
				+ dr.toMinutesPart() + " minutes\n" 
				+ dr.toSecondsPart() + " seconds\n");
				
		
	}
}
