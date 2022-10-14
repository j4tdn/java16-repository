package Ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.time.LocalDate;
public class WeekdayCalculator {
	private static final String PATTERN = "dd/MM/yyyy";

	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter year: ");
//		int year = sc.nextInt();
//		System.out.println("Enter month: ");
//		int month = sc.nextInt();
//		System.out.println("Enter day: ");
//		int day = sc.nextInt();
		LocalDate input = LocalDate.of(1995,9,25);
		
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		String dmy = df.format(input);
		System.out.println("formated now: " + dmy);
		System.out.println("\n==============================================\n");
		
		System.out.println("It is day number " + input.getDayOfYear() + " of the year, " + (input.lengthOfYear() - input.getDayOfYear()) + " days left");	
		
		System.out.println("It is "+ input.getDayOfWeek() + " " + (int)Math.ceil((float)input.getDayOfYear()/7) + " out of " + " 52 " + input.getYear() );
		
		// line 3
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
		System.out.println("It is "+input.getDayOfWeek()+" number "+countMDinM+" out of "+countallMDinM+" in "+input.getMonth()+ " " + input.getYear());
		
		System.out.println("Year " + input.getYear() + " has " + input.lengthOfYear() + " days.");
	
		System.out.println(input.getMonth() + " " + input.getYear() + " has "
				+ input.lengthOfMonth() + " days.");
		
		
	}

}
