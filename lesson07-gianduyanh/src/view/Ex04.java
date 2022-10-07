package view;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex04 {
	
	private static String PATTERN = "dd/MM/yyyy";
	private static String[] blockday = {"02/09", "30/04", "01/05"};
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		date = date.of(2022, 6, 7);
		
		int count = 0;
		while (count <= 110) {
			date = date.plusDays(1);
			if(date.getDayOfWeek() == DayOfWeek.SATURDAY && date.getDayOfWeek() == DayOfWeek.SUNDAY ) {
				continue;	
			}
			if(checkBlockDay(date)) {
				continue;
			}
			count++;
		}
		System.out.println(count);
		//checkBlockDay(date);
		System.out.println(df.format(date));
		checkBlockDay(date);
		
	}
	
	private static boolean checkBlockDay(LocalDate d) {
		
		int count1 = 0;
		
		for (int i = 0; i < blockday.length; i++) {
			int day = Integer.parseInt(blockday[i].split("/")[0]);
			int month =Integer.parseInt(blockday[i].split("/")[1]);
			LocalDate tmp = LocalDate.of(d.getYear(), month, day);
			

			if(d.equals(tmp)) {
				return true;
				
			}
		}
		
		
		
		return false;
	}
	
	

}
