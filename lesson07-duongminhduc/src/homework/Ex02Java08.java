package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Ex02Java08 {
	private static final String PATTERN = "dd/MM/yyyy E";
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter year: ");
		int year = sc.nextInt();
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		String text = df.format(date);
		System.out.println("formated now: " + text);
		System.out.println("\n==============================================\n");
		print(date);
		
	}
	private static void print(LocalDate date)
	{
		
		//line 1
		System.out.println(date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear() + " is a " + date.getDayOfWeek()  );
	    //line 2
		System.out.println("Additional facts: \n");
		//line 3
		System.out.println("It is day number " + date.getDayOfYear() + " of the year, " + (date.lengthOfYear() - date.getDayOfYear()) + " days left");
		//line 4
		
		//line 6
		System.out.println("Year " + date.getYear() + " has " + date.lengthOfYear() + " days.");

		//line 7
		System.out.println(date.getMonth() + " " + date.getYear() + " has "
				+ date.lengthOfMonth() + " days.");
		
		
	}
	
}
