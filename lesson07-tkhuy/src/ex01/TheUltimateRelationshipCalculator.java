package ex01;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;
public class TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Dating start year: ");
		int year= sc.nextInt();
		System.out.print("Enter Dating start month: ");
		int month= sc.nextInt();
		System.out.print("Enter Dating start day: ");
		int day= sc.nextInt();
		System.out.print("Enter Dating start hour: ");
		int hour = sc.nextInt();
		System.out.print("Enter Dating start minute: ");
		int minute= sc.nextInt();
		System.out.print("Enter Dating start second: ");
		int second= sc.nextInt();
		
		LocalDateTime start = LocalDateTime.of(year, month, day, hour, minute, second);
		
		System.out.println("Have you broken up yet?? y(Yes)/ n(No)");
		String choose = sc.next();
		if(choose.equals("y") || choose.equals("Y")) {
			System.out.println("Enter and love year: ");
			int endYear= sc.nextInt();
			System.out.println("Enter and love month: ");
			int endMonth= sc.nextInt();
			System.out.println("Enter end love day: ");
			int endDay= sc.nextInt();
			System.out.println("Enter end love  hour: ");
			int endHour= sc.nextInt();
			System.out.println("Enter end love minute: ");
			int endMinute= sc.nextInt();
			System.out.println("Enter end love second: ");
			int endSecond= sc.nextInt();
			
			LocalDateTime end = LocalDateTime.of(endYear, endMonth, endDay, endHour, endMinute, endSecond);
			if(end.isBefore(start)) {
				throw new IllegalArgumentException("End day must more than start day");
			}
			
			urCalculator(start, end);
		}
		else if(choose.equals("n") || choose.equals("N")) {
			LocalDateTime eNow = LocalDateTime.now();
			urCalculator(start, eNow);
		}
	}

	private static void urCalculator(LocalDateTime start, LocalDateTime end) {
		LocalDate startDate = start.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		
		LocalDate endDate = end.toLocalDate();
		LocalTime endTime = end.toLocalTime();
		
		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(startTime, endTime);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("Number of days spent together \n"
				+ period.getYears() + " years\n"
				+ period.getMonths() + " months\n"
				+ period.getDays() + " days\n"
				+ duration.toHours() + " hours\n"
				+ duration.toMinutesPart() + " minutes\n"
				+ duration.toSecondsPart() + " seconds");
		
	}
}
