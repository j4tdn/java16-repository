package ex03;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;



public class TimeCheck {
	private static final String PATTERN = "dd/MM/yyy HH:mm:ss";
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		LocalDateTime now = LocalDateTime.now();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		System.out.println(dtf.format(now));
		
		System.out.println("================================");
		
	
		
		LocalDateTime lastDay = now.with(TemporalAdjusters.lastDayOfMonth()); 
		System.out.println(lastDay);
		System.out.println("\n================================");
		//Line 3
		System.out.println(now.getDayOfWeek());
		LocalDateTime lastDayOfWeek=now;
		LocalDateTime firstDayOfWeek=now;
	
		while(true) {
			if(lastDayOfWeek.getDayOfWeek().toString()=="SUNDAY") {
				break;
			}
			else {
				lastDayOfWeek=lastDayOfWeek.plusDays(1);
			}
		}
		System.out.println("Last day in Week: "+lastDayOfWeek);
		
		while(true) {
			if(firstDayOfWeek.getDayOfWeek().toString()=="MONDAY") {
				break;
			}
			else {
				firstDayOfWeek=firstDayOfWeek.minusDays(1);
			}
		}
		System.out.println("First day in Week: "+firstDayOfWeek);
		System.out.println("\n================================");
		
				//Line 4
		int numberweek= now.getDayOfYear()/7;
		System.out.println(numberweek);
		System.out.println("\n================================");
		
			//Line 5

		System.out.println(dtf.format(now.plusDays(20)));
		System.out.println(now.plusDays(20).getDayOfWeek());
		System.out.println("\n================================");
		
		//Line 6
		
		LocalDate currentDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2003,06,22);
		int days = Period.between(birthDate, currentDate).getDays();
		System.out.println("Have lived "+days);
		 
		
	}
}
