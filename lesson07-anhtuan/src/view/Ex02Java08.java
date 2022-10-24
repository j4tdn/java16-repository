package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex02Java08 {
	public static void main(String[] args) {
		LocalDate lc = LocalDate.of(1995, 9, 25);
		System.out.println("Day of year: "+ lc.getDayOfYear());
		System.out.println(lc.getDayOfWeek());
		
		System.out.println("Monday of year: "+ countMonday(lc));
		System.out.println("Monday of month: "+ countMonday(lc));
	}
	private static int countMonday(LocalDate lc) {
		int count = 0;
		
		
		LocalDate start = lc.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate end = lc.with(TemporalAdjusters.lastDayOfMonth());
		
		for(LocalDate st = start;st.isBefore(end);) {
			if(st.getDayOfWeek() == DayOfWeek.MONDAY) {
				count ++;
				st = st.plusDays(7);
			}else {
				st = st.plusDays(1);
			}
			
		}
		return count;
		
	}
	private static int countMondayYear(LocalDate lc) {
		int count = 0;
		
		
		LocalDate start = lc.with(TemporalAdjusters.firstDayOfYear());
		
		
		
		for(LocalDate st = start;st.isBefore(lc.withDayOfYear(268));) {
			if(st.getDayOfWeek() == DayOfWeek.MONDAY) {
				count ++;
				st = st.plusDays(7);
			}else {
				st = st.plusDays(1);
			}
			
		}
		return count;
		
	}
	

}
