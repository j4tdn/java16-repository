package java08.problem03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class Ex03DateTimeApp {
	private static Scanner sc = new Scanner(System.in);
	private static final DateTimeFormatter dfDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static final DateTimeFormatter dfDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private static final DateTimeFormatter dfDateDayOfWeek = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE");

	public static void main(String[] args) {
		// 1
		currentTime();
		System.out.println("============");
		// 2
		lastDayOfMonth();
		System.out.println("============");
		// 3
		firstDayOfWeek();
		lastDayOfWeek();
		System.out.println("============");
		// 4
		weekOfYear();
		System.out.println("============");
		// 5
		next20Days();
		System.out.println("============");
		// 6
		myLifeTime();
	}

	private static void currentTime() {
//		America/Argentina/Buenos_Aires
//		Europe/Nicosia
//		Pacific/Guadalcanal
//		Europe/Athens
//		US/Pacific
//		Europe/Monaco
//		Set<String> temp = ZoneId.getAvailableZoneIds();
//		for (String s : temp)
//			System.out.println(s);
		System.out.print("Input Locale: ");
		String locale = sc.nextLine();
		LocalDateTime now = LocalDateTime.now(ZoneId.of(locale));
		System.out.println("Current time: " + dfDateTime.format(now));
	}

	private static void lastDayOfMonth() {
		LocalDate now = LocalDate.now();
		TemporalAdjuster adjuster = TemporalAdjusters.lastDayOfMonth();
		System.out.println("Last day of month: " + dfDate.format(now.with(adjuster)));
	}

	private static void firstDayOfWeek() {
		LocalDate now = LocalDate.now();
		DayOfWeek dow = WeekFields.of(Locale.ROOT).getFirstDayOfWeek();
		LocalDate fdow = now.with(TemporalAdjusters.previousOrSame(dow));
		System.out.println("First day of week: " + dfDate.format(fdow));
	}

	private static void lastDayOfWeek() {
		LocalDate now = LocalDate.now();
		DayOfWeek dow = WeekFields.of(Locale.ROOT).getFirstDayOfWeek();
		LocalDate ldow = now.with(TemporalAdjusters.previousOrSame(dow));
		ldow = ldow.plusDays(6);
		System.out.println("Last day of week: " + dfDate.format(ldow));
	}

	private static void weekOfYear() {
//		Calendar c = Calendar.getInstance();
//		System.out.println("Week of year: " + c.get(Calendar.WEEK_OF_YEAR));
		LocalDate now = LocalDate.now();
		WeekFields weekFields = WeekFields.of(Locale.ROOT);
		System.out.println("Week of year: " + now.get(weekFields.weekOfWeekBasedYear()));
	}

	private static void next20Days() {
		LocalDate now = LocalDate.now();
		LocalDate next20Days = now.plusDays(20);
		System.out.println("Next 20 days: " + dfDateDayOfWeek.format(next20Days));
	}

	private static void myLifeTime() {
		LocalDate birthday;
		LocalDate now = LocalDate.now();
		while (true)
			try {
				System.out.print("Input birthday: ");
				String temp = sc.nextLine();
				birthday = LocalDate.parse(temp, dfDate);
				break;
			} catch (Exception e) {
				System.out.println("Invalid Date!");
			}
		long result = ChronoUnit.DAYS.between(birthday, now);
		System.out.println("Live Time: " + result + " days.");
	}
}
