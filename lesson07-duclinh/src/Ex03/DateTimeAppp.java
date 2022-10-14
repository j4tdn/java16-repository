package Ex03;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Locale;
public class DateTimeAppp {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) {
		//1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
		Scanner sc = new Scanner(System.in);
		// Giờ mặc định ở vn
		System.out.println("default timezone: " + TimeZone.getDefault());
		Calendar c = Calendar.getInstance();
		System.out.println("default time: " + format(c, TimeZone.getDefault()));
		
		System.out.println("\n====================\n");
		// Danh sách các vùng
		String[] ids = TimeZone.getAvailableIDs();
		for(String id: ids) {
			System.out.println(id);
		}
		System.out.println("input: ");
		String region = sc.nextLine();  
		System.out.println("\n====================\n");
		System.out.println("Region time: " + format(c, TimeZone.getTimeZone(region)));
		//2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		Calendar lastday = Calendar.getInstance();
		lastday.set(Calendar.DAY_OF_MONTH, lastday.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Last day of this month: " + df.format(lastday.getTime()));
		//3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		Calendar firstDOW = Calendar.getInstance();
		firstDOW.set(Calendar.DAY_OF_WEEK,firstDOW.getFirstDayOfWeek());
		System.out.println("Firt Day Of Week: " + (firstDOW.get(Calendar.DATE)+1));
		System.out.println("Last Day Of Week: " + (firstDOW.get(Calendar.DATE)+7));
		//4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		Calendar WOY = Calendar.getInstance();
		int numberOfWeek = WOY.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Tuần thứ :" + numberOfWeek);
		//5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		Calendar after20Day = Calendar.getInstance();
		after20Day.add(Calendar.DATE, 20);
		int dayafter = after20Day.get(Calendar.DATE);
		YearMonth yearMonth = YearMonth.of(2022, Calendar.MONTH);
		String dc = yearMonth.atDay(dayafter).getDayOfWeek().name();
		System.out.println("date: " + dayafter);
		System.out.println("date number: " + dc);
		//6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		Calendar birthday = getTime(2002,Calendar.JUNE,18);
		Calendar now = Calendar.getInstance();
		
		int doyStart = birthday.get(Calendar.DAY_OF_YEAR);
		System.out.println("Day of month start: "+ doyStart);
		int doyEnd = now.get(Calendar.DAY_OF_YEAR);
		System.out.println("Day of month end: "+ doyEnd);
		int result = doyEnd - doyStart;
		for (int year = birthday.get(Calendar.YEAR); year < now.get(Calendar.YEAR); year++) {
			birthday.set(Calendar.YEAR, year);
			result += birthday.getActualMaximum(Calendar.DAY_OF_YEAR);
		}
		System.out.println("Live Time: " + result + " days.");
	}
	private static String format(Calendar c, TimeZone tz) {
		df.setTimeZone(tz);
		return df.format(c.getTime());
	}
	private static Calendar getTime(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
	private static void printTime(Calendar c) {
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println(day + "/" + (month+1) + "/" + year);
	}
	private static Calendar getStartDayOfYear(Calendar c) {
		// copy time from c to result
		Calendar result = Calendar.getInstance();
		result.setTimeInMillis(c.getTimeInMillis());
		
		result.add(Calendar.DAY_OF_MONTH, 
				result.getFirstDayOfWeek() - result.get(Calendar.DAY_OF_WEEK));
		return result;
	}
	private static Calendar getEndDayOfYear(Calendar c) {
		Calendar result = getStartDayOfYear(c);
		result.add(Calendar.DAY_OF_MONTH, 6);
		return result;
	}
}
