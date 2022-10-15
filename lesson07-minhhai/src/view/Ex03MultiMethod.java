package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Ex03MultiMethod {
	private static String PATTERN = "dd/MM/yyyy EEEE HH:mm:ss";

	public static void main(String[] args) {

		LocalDateTime nowT = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);

		// 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
		System.out.println("Now time: " + df.format(nowT));

		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		LocalDate nDay = nowT.toLocalDate();
		System.out.println("Last day of this month: " + nDay.with(TemporalAdjusters.lastDayOfMonth()));

		// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		System.out.println("First day of current week: " + df.format(nowT.with(DayOfWeek.MONDAY)));
		System.out.println("Last day of this week: " + df.format(nowT.with(DayOfWeek.SUNDAY)));

		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		double numberweek = nowT.getDayOfYear() / 7.0;
		System.out.println(nowT.getDayOfMonth() + " in week number " + Math.ceil(numberweek));

		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		LocalDate fD = LocalDate.now().plusDays(20);
		System.out.println("20 days later is : " + fD + " and is " + fD.getDayOfWeek());

		//6. Nhập vào ngày tháng nămsinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		LocalDate today = LocalDate.now();
		LocalDate myBirthday = LocalDate.of(1999, 8, 1);
		long myTime = ChronoUnit.DAYS.between(myBirthday, today);
		System.out.println("The time that i live until now: " + myTime + "days");

	}

}
