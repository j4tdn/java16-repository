package view;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Ex03 {
	private static final String PATTERN = "EEE dd/MM/yyyy";
	private static final SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);

	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		System.out.println("Java 08 : " + df.format(datetime));
		System.out.println("fDOW " + df.format(datetime.with(DayOfWeek.MONDAY)));
		System.out.println("lDOW  " + df.format(datetime.with(DayOfWeek.SUNDAY)));
		LocalDate future = LocalDate.now().plusDays(20);
		System.out.println("check days after 20 days: " + future);
		System.out.println("dOW after 20 days: " + future.getDayOfWeek());

		LocalDate dateOfBirth = LocalDate.of(2001, Month.FEBRUARY, 21);
		LocalDate present = LocalDate.now();
		Period period = Period.between(dateOfBirth, present);
		System.out.println(
				"My age:" + period.getYears() + " year " + period.getMonths() + " month " + period.getDays() + " day "

		);

		System.out.println("=============================");

		Calendar c = Calendar.getInstance();

		System.out.println("Java 07 : " + sdf.format(c.getTime()));
		System.out.println("Week Of Year " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + " is in the " + c.get(Calendar.WEEK_OF_YEAR) + " week ");
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.get(1);
		System.out.println("last day of month " + sdf.format(c.getTime()));

	}

}
