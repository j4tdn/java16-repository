package homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Ex01{

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date to start dating: ");
		int day = 0,month=0,year=0,hour = 0,minuter = 0,second = 0;
		int eday = 0,emonth=0,eyear=0,ehour = 0,eminuter = 0,esecond = 0;
		System.out.println("Enter year: ");
		year = sc.nextInt();	
		System.out.println("Enter month: ");
		month= sc.nextInt();	
		System.out.println("Enter day: ");
		day = sc.nextInt();
	
		System.out.println("Enter hours: ");
		hour = sc.nextInt();
		System.out.println("Enter minutes: ");
		minuter  =sc.nextInt();
		System.out.println("Enter second: ");
		second = sc.nextInt();
		
		LocalDateTime tstart = LocalDateTime.of(year, month, day, hour, minuter, second);
		System.out.println("Did you break up (1/2): ");
		System.out.println("1. Yes");
		System.out.println("2. No");
		int yn ;
		yn = sc.nextInt();
		System.out.println("===========================================");
		if(yn == 1)
		{
		
			System.out.println("Enter year: ");
			eyear = sc.nextInt();	
			System.out.println("Enter month: ");
			emonth= sc.nextInt();	
			System.out.println("Enter day: ");
			eday = sc.nextInt();
		
			System.out.println("Enter hours: ");
			ehour = sc.nextInt();
			System.out.println("Enter minutes: ");
			eminuter  =sc.nextInt();
			System.out.println("Enter second: ");
			esecond = sc.nextInt();
			LocalDateTime tend  = LocalDateTime.of(eyear, emonth, eday, ehour, eminuter, esecond);
		    Caculator(tstart, tend);	
		}
		else if(yn == 2)
		{
			LocalDateTime tnow = LocalDateTime.now();
			Caculator(tstart, tnow);
		}
		else
		{
			throw new IllegalArgumentException("Syntax Error");
		}
		
	}

	private static void Caculator(LocalDateTime start, LocalDateTime end)
	{
		if(end.isBefore(start))
		{
			throw new IllegalArgumentException("StartDay must less than EndDay");
		}
		
		System.out.println("Love each other since day: "+start.getDayOfWeek());
		
		LocalDate ld1 = start.toLocalDate();
		LocalTime lt1 = start.toLocalTime();
		LocalDate ld2 = end.toLocalDate();
		LocalTime lt2 = end.toLocalTime();
		Period pr = Period.between(ld1, ld2);
		Duration dr = Duration.between(lt1, lt2);
		
		if(dr.isNegative()) // nếu dr âm
		{
			dr = dr.plusDays(1);
			pr = pr.minusDays(1);
		}
		System.out.println("DatingTime: \n" 
		        + pr.getYears() + " years\n" 
				+ pr.getMonths() + " month\n" 
		        + pr.getDays() + " days\n"
				+ dr.toHoursPart() + " hours\n" 
				+ dr.toMinutesPart() + " minutes\n" 
				+ dr.toSecondsPart() + " seconds\n");
				
	}
	
	
	
}

