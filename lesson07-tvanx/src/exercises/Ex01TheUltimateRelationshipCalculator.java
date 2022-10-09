package exercises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter day of start Datting: ");
		int day=ip.nextInt();
		System.out.print("Enter month of start Datting: ");
		int month=ip.nextInt();
		System.out.print("Enter year of start Datting: ");
		int year=ip.nextInt();
		System.out.print("Enter hour of start Datting: ");
		int hour=ip.nextInt();
		System.out.print("Enter minute of start Datting: ");
		int minute=ip.nextInt();
		System.out.print("Enter second start Datting: ");
		int second=ip.nextInt();
		
		LocalDateTime start = LocalDateTime.of(year, month,day, hour, minute, second) ;
		LocalDate startDate =start.toLocalDate();
		LocalTime startTime = start.toLocalTime();
		
		System.out.println("Date of start datting: "+start.getDayOfWeek());
		
		System.out.println("Are you break up(1.Yes/2.No )");
		int number = ip.nextInt();
		if(number==1) {
			System.out.println("Enter day of break up: ");
			int endday=ip.nextInt();
			System.out.println("Enter month of break up: ");
			int endmonth=ip.nextInt();
			System.out.println("Enter year of break up: ");
			int endyear=ip.nextInt();
			System.out.println("Enter hour of break up: ");
			int endhour=ip.nextInt();
			System.out.println("Enter minute of break up: ");
			int endminute=ip.nextInt();
			System.out.println("Enter second break up: ");
			int endsecond=ip.nextInt();
			
			LocalDateTime end = LocalDateTime.of(endyear, endmonth, endmonth, endhour, endminute, endsecond) ;
			if(end.isBefore(start)) {
				throw new IllegalArgumentException("End Day must more than Strat Day !!!");
			}
			LocalDate endDate =end.toLocalDate();
			LocalTime endTime = end.toLocalTime();
			Period pr = Period.between(startDate, endDate);
			Duration dr = Duration.between(startTime, endTime);
			
			System.out.println("toString --> \n" + pr.getYears() + " years\n" + pr.getMonths() + " month\n" + pr.getDays()
			+ " days\n" + dr.toHoursPart() + " hours\n" + dr.toMinutesPart() + " minutes\n" + dr.toSecondsPart()
			+ " seconds");
		}
			
		if(number==2) {
			LocalDateTime now = LocalDateTime.now();
			LocalDate nowDate =now.toLocalDate();
			LocalTime nowTime = now.toLocalTime();
			Period pr = Period.between(startDate, nowDate);
			Duration dr = Duration.between(startTime, nowTime);
			
			System.out.println("toString --> \n" + pr.getYears() + " years\n" + pr.getMonths() + " month\n" + pr.getDays()
			+ " days\n" + dr.toHoursPart() + " hours\n" + dr.toMinutesPart() + " minutes\n" + dr.toSecondsPart()
			+ " seconds");
		}
	}
}
