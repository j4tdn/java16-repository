package homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex02Java07 {
	private static String PATTERN = "dd/MM/yyyy";
	private static SimpleDateFormat df = new SimpleDateFormat(PATTERN);
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year  = sc.nextInt();
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar time = gettime(year, month-1, day);
		System.out.println(df.format(time.getTime()));
		print(time);
		
	}
	

	private static void print(Calendar c)
	{
		String[] weekdays = { "SunDay", "MonDay", "TuesDay", "WednesDay", "ThurDay", "FriDay", "SatDay"};
		String[] monthList = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		
		System.out.println("============================================");
		//line 1
		System.out.println(c.get(Calendar.DAY_OF_MONTH) 
				+" " + monthList[c.get(Calendar.MONTH)]
				+" " + c.get(Calendar.YEAR) 
				+ " is a " + weekdays[c.get(Calendar.DAY_OF_WEEK)-1]   );
		
		System.out.println("Additional facts: \n");
		//line 2
		System.out.println("It is day number " 
		+ c.get(Calendar.DAY_OF_YEAR) 
		+ " of the year, " + 
		(c.getActualMaximum(Calendar.DAY_OF_YEAR) -  c.get(Calendar.DAY_OF_YEAR) ) 
		+ " days left");
		//line 3
		System.out.println("It is " + weekdays[c.get(Calendar.DAY_OF_WEEK)-1]
				+ " number " + countWeekdaysInYear(c) + " out of " 
				+ maxcountWeekdaysInYear(c) + " in " + c.get(Calendar.YEAR));
		//line 4
		System.out.println("It is " + weekdays[c.get(Calendar.DAY_OF_WEEK)-1]
				+ " number " + countWeekdaysInMonth(c) + " out of " 
				+ maxcountWeekdaysInMonth(c) + " in " + monthList[c.get(Calendar.MONTH)] +" "+ c.get(Calendar.YEAR));
			
	    //line 5
		System.out.println("Year " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		//line 6
		System.out.println(monthList[c.get(Calendar.MONTH)] + " " + c.get(Calendar.YEAR) +" has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days" );
		
	}
	//=====================THÁNG======================================
	// đếm có bao nhiêu thứ từ đầu tháng đến thứ hiện tại và giống với thứ hiện tại
		private static int countWeekdaysInMonth(Calendar c)
		{
			Calendar startDate = getStartDayOfMonth(c);
			Calendar endDate = getEndDayOfMonth(c);
			int count = 0;

			
			for(Calendar date = startDate; date.before(endDate) || date.equals(endDate); date.add(Calendar.DAY_OF_MONTH, 1))
			{
				if (date.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
					if (date.before(c) || date.equals(c))
					{
						count++;
					}
				}
						
			}
			return count;
		}
		//đếm tất cả các thứ trong tháng giống với thứ hiện tại
		private static int maxcountWeekdaysInMonth(Calendar c)
		{
			Calendar startDate = getStartDayOfMonth(c);
			Calendar endDate = getEndDayOfMonth(c);
		
			int maxcount = 0;
			
			for(Calendar date = startDate; date.before(endDate) || date.equals(endDate); date.add(Calendar.DAY_OF_MONTH, 1))
			{
				if (date.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
					maxcount ++;
				}
						
			}
			return maxcount;
		}

		//ngày đầu tiên của năm
		private static Calendar getStartDayOfMonth(Calendar c) {
			Calendar result = copy(c);
			result.set(Calendar.DAY_OF_MONTH, 1);
			return result;
		}

		//ngày cuối cùng của năm đó
		private static Calendar getEndDayOfMonth(Calendar c) {
			Calendar result = copy(c);
			result.set(Calendar.DAY_OF_MONTH, result.getActualMaximum(Calendar.DAY_OF_MONTH));
			return result;
		}
		
		
		
		
		//================================NĂM==========================================================
	// đếm có bao nhiêu thứ từ đầu năm đến thứ hiện tại và giống với thứ hiện tại
	private static int countWeekdaysInYear(Calendar c)
	{
		Calendar startDate = getStartDayOfYear(c);
		Calendar endDate = getEndDayOfYear(c);
		int count = 0;

		
		for(Calendar date = startDate; date.before(endDate) || date.equals(endDate); date.add(Calendar.DAY_OF_YEAR, 1))
		{
			if (date.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				if (date.before(c) || date.equals(c))
				{
					count++;
				}
			}
					
		}
		return count;
	}
	//đếm tất cả các thứ trong năm giống với thứ hiện tại
	private static int maxcountWeekdaysInYear(Calendar c)
	{
		Calendar startDate = getStartDayOfYear(c);
		Calendar endDate = getEndDayOfYear(c);
	
		int maxcount = 0;
		
		for(Calendar date = startDate; date.before(endDate) || date.equals(endDate); date.add(Calendar.DAY_OF_YEAR, 1))
		{
			if (date.get(Calendar.DAY_OF_WEEK) == c.get(Calendar.DAY_OF_WEEK)) {
				maxcount ++;
			}
					
		}
		return maxcount;
	}

	//ngày đầu tiên của năm
	private static Calendar getStartDayOfYear(Calendar c) {
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_YEAR, 1);
		return result;
	}

	//ngày cuối cùng của năm đó
	private static Calendar getEndDayOfYear(Calendar c) {
		Calendar result = copy(c);
		result.set(Calendar.DAY_OF_YEAR, result.getActualMaximum(Calendar.DAY_OF_YEAR));
		return result;
	}

	
	private static Calendar copy(Calendar c) {
		Calendar result = Calendar.getInstance();
		result.setTime(c.getTime());
		return result;
	}
	
	//gán thời gian 
	private static Calendar gettime(int year, int month, int day)
	{
		Calendar c = Calendar.getInstance();
		c.set(year, month,day);
		return c;
	}
	
}
