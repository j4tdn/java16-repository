package homework;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCaculator {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
private static String getCurrentTimeStamp() {
	return new SimpleDateFormat(PATTERN).format(new Date());
}

	public static void main(String[] args) {
		String start = inputString("Enter first day dating time with format dd/MM/yyyy HH:mm:ss: ");
	String checkBroken = inputString("Are you broke up? (Y/N): ");
	LocalDateTime endLocalDateTime = LocalDateTime.now();
	String end = "";
	if (checkBroken.equals("Y")) {
		end = inputString("Enter broke up day with format dd/MM/yyyy HH:mm:ss: ");
		endLocalDateTime = LocalDateTime.parse(end);
		} else {
			 end = getCurrentTimeStamp();
		}
	
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		LocalDateTime startDay = LocalDateTime.parse(start, df);
		LocalDateTime endDay = LocalDateTime.parse(end, df);
		
		if (endDay.isBefore(startDay)) {
			throw new IllegalArgumentException("Start day must before end day!");
		}
		 
		Duration duration = Duration.between(startDay, endDay);
		LocalDate startDate = startDay.toLocalDate();
		LocalDate endDate = endDay.toLocalDate();
		
		
		DayOfWeek day = startDate.getDayOfWeek();
		System.out.println("The day of week is: " + day.getDisplayName(TextStyle.FULL, Locale.getDefault()));
	
		Period period = Period.between(startDate, endDate);
		
		if (duration.isNegative()) {
			duration.plusDays(1);
			period.minusDays(1);
		}
		System.out.println("Time of relationship is: " + period.getYears() + " years \n"
				+ period.getMonths() + " months \n" + period.getDays() + " days \n"
				+ duration.toHoursPart() + " hours \n" + duration.toMinutesPart() + " minutes \n" +
				 duration.toSecondsPart() + " seconds");
	}
	private static String inputString(String text) {
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println(text);
		result = sc.nextLine();
		return result;
	}
}
