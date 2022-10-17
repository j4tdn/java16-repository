package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex02Java08 {
	public static void main(String[] args) {
		LocalDate lc = LocalDate.of(1995, 9, 25);
		System.out.println("Day of year: "+ lc.getDayOfYear());
		System.out.println("sss"+ countMonday(lc));
		
	}
	private static int countMonday(LocalDate lc) {
		int count = 0;
		LocalDate c = copy(lc);
		
		LocalDate start = c.with(TemporalAdjusters.firstDayOfYear());
		
		for(LocalDate st = start;st.getDayOfYear() <= c.getDayOfYear();) {
			if(st.getDayOfWeek() == DayOfWeek.MONDAY) {
				count ++;
				st.plusDays(7);
			}else {
				st.plusDays(1);
			}
			
		}
		return count;
		
	}
	private static LocalDate copy(LocalDate lc) {
		LocalDate c = LocalDate.now();
		return c;
	}

}
