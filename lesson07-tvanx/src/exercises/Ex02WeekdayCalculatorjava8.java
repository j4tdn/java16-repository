package exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02WeekdayCalculatorjava8 {
	private static final String PATTERN = "dd/MM/yyyy EEEE";

	public static void main(String[] args) {
		String[] valuemonth = { "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ",
				"September ", "October ", "November ", "December " };
//		Scanner ip = new Scanner(System.in);
//		System.out.print("Enter day: ");
//		int day = ip.nextInt();
//		System.out.print("Enter month: ");
//		int month = ip.nextInt();
//		System.out.print("Enter year: ");
//		int year = ip.nextInt();

		LocalDate input = LocalDate.of(1995, 9, 25);

		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);

		System.out.println(input.getDayOfMonth() + " " + valuemonth[input.getMonthValue() - 1] + input.getYear() + " "
				+ input.getDayOfWeek());
		System.out.println("Additional facts: ");
		//Line 1
		System.out.println("Line 1");
		System.out.println("It is day number " + input.getDayOfYear() + " of the year,"
				+ (input.lengthOfYear()-input.getDayOfYear()) + " day left");
		//Line 2
		System.out.println("Line 2");
		LocalDate firstDayOfY = input.with(TemporalAdjusters.firstDayOfYear());
		boolean check = true;
		LocalDate firstMD = firstDayOfY;
		while(check==true) {
			if(firstMD.getDayOfWeek()==input.getDayOfWeek()) {
				check=false;
			}
			else {
				firstMD=firstMD.plusDays(1);
			}
		}
		int countAllMonday=0;
		int countMonday=1;
		for(LocalDate date = firstMD;date.getYear()<=input.getYear();date=date.plusDays(7)) {
			countAllMonday++;
			if(date.getDayOfYear() < input.getDayOfYear()) {
				countMonday++;
			}
		}
		System.out.println("It is "+input.getDayOfWeek()+" number "+countMonday+" out of "+countAllMonday+" in "+input.getYear());
		
		//Line 3
		System.out.println("Line 3");
		LocalDate firstDayOfM = input.with(TemporalAdjusters.firstDayOfMonth());
		boolean checkM = true;
		LocalDate firstMDinM = firstDayOfM;
		while(checkM==true) {
			if(firstMDinM.getDayOfWeek()==input.getDayOfWeek()) {
				checkM=false;
			}
			else {
				firstMDinM=firstMDinM.plusDays(1);
			}
		}
		int countallMDinM=0;
		int countMDinM=1;
		for(LocalDate date = firstMDinM;date.getMonthValue()<=input.getMonthValue();date=date.plusDays(7)) {
			countallMDinM++;
			if(date.getDayOfYear() < input.getDayOfYear()) {
				countMDinM++;
			}
		}
		System.out.println("It is "+input.getDayOfWeek()+" number "+countMDinM+" out of "+countallMDinM+" in "+input.getMonth()+input.getYear());
	
		//Line 4x
		System.out.println("Line 4");
		System.out.println("Year "+input.getYear()+" has "+input.lengthOfYear()+" days");
		//Line 5
		System.out.println("Line 5");
		System.out.println((valuemonth[input.getMonthValue() - 1])+input.getYear() +" has "+input.lengthOfMonth());
	}
	

}
