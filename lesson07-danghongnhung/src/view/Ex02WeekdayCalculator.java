package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Ex02WeekdayCalculator {
	private static String PATTERN = "dd/MM/yyyy EEEE";
	public static void main(String[] args) {
		LocalDate day = LocalDate.of(1995, 9, 25);
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		weekdayCal(day);


	}
	private static void weekdayCal(LocalDate day) {
		String[] valueOfMonth = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println(day.getDayOfMonth() + " " + valueOfMonth[day.getMonthValue()-1]
				+ " "+ day.getYear() + " is a " + day.getDayOfWeek());
		
		System.out.println("Additional facts");
		//It is number 268 of the year, 97 day left
		System.out.println("It is day number " + day.getDayOfYear() + " of the year"
				+ (day.lengthOfYear() - day.getDayOfYear() + " day left"));
		
		//It is Monday number 39 out of 52 in 1995
	
		LocalDate firstDayOfY = day.with(TemporalAdjusters.firstDayOfYear());
		LocalDate firstDayInput = firstDayOfY;
		while(true) {
			if(firstDayInput.getDayOfWeek()==day.getDayOfWeek()) {
				break;
			}
			else {
				firstDayInput = firstDayInput.plusDays(1);
			}
		}
		int countAllDayInp=0;
		int countDayInp=1;
		for(LocalDate date = firstDayInput;date.getYear()<=day.getYear();date=date.plusDays(7)) {
			countAllDayInp++;
			if(date.getDayOfYear() < day.getDayOfYear()) {
				countDayInp++;
			}
		}
		System.out.println("It is "+day.getDayOfWeek()+" number "+countDayInp+" out of "+countAllDayInp+" in "+day.getYear());
		
		//It is Monday number 4 out of 4 in September 1995
		LocalDate firstDayOfM = day.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate fDayInpInM = firstDayOfM;
		while(true) {
			if(fDayInpInM.getDayOfWeek()==day.getDayOfWeek()) {
				break;
			}
			else {
				fDayInpInM = fDayInpInM.plusDays(1);
			}
		}
		int countallDIInM=0;
		int countDIInM=1;
		for(LocalDate date = fDayInpInM;date.getMonthValue()<= day.getMonthValue();date=date.plusDays(7)) {
			countallDIInM++;
			if(date.getDayOfYear() < day.getDayOfYear()) {
				countDIInM++;
			}
		}
		System.out.println("It is "+ day.getDayOfWeek()+" number "+countDIInM+" out of "+countallDIInM+" in " +day.getMonth()+ " " +day.getYear());
		
		//year 1995 has 365 days
		System.out.println("Year " + day.getYear()+ " has " + day.lengthOfYear() + " days");
		//September 1995 has 30 days
		System.out.println(valueOfMonth[day.getMonthValue() - 1] + " " + day.getYear() +" has " + day.lengthOfMonth() + " days" );
	}
}
