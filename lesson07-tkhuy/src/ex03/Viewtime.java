package ex03;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
public class Viewtime {
	private static String PATTERN ="dd/MM/yyyy EEEE HH:mm:ss";
	public static void main(String[] args) {
		LocalDateTime nDateTime = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		
		System.out.println("Today: " + df.format(nDateTime));

		LocalDate nDay = nDateTime.toLocalDate();
		System.out.println("The last day of the current month: " + nDay.with(TemporalAdjusters.lastDayOfMonth()));
		
		System.out.println("First day of current week: " + df.format(nDateTime.with(DayOfWeek.MONDAY)));
		System.out.println("Last day of current week: " + df.format(nDateTime.with(DayOfWeek.SUNDAY)));
		
		double numberweek= nDateTime.getDayOfYear()/7.0;
		System.out.println(nDateTime.getDayOfMonth()+" in week number "+Math.ceil(numberweek));
		
	     LocalDate future = LocalDate.now().plusDays(20);
	     LocalDate now = LocalDate.now();
		 System.out.println("future + 20days : " + future + " " + future.getDayOfWeek());
		 
		 LocalDate getDate =LocalDate.now();
		 LocalDate birthday = LocalDate.of(2001,06,18);
		 long days = ChronoUnit.DAYS.between(birthday, getDate);
		 System.out.println("Total times you  live: "+days);

	}
}
