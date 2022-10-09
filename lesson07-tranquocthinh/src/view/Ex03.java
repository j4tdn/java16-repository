package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Locale;

public class Ex03 {

	public static void main(String[] args) {
		// 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
		
		Locale.setDefault(new Locale("vi", "VN"));
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Ngày, tháng, năm, giờ, phút, giây của thời điểm hiện tại là ");
		System.out.println(now);

		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		Calendar cNow = Calendar.getInstance();
		int dayEndMonth = cNow.getMaximum(Calendar.DATE);
		
		System.out.println("Ngày cuối cùng của tháng hiện tại là: " + dayEndMonth);
		
		// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		
		int firstDay = cNow.getFirstDayOfWeek();
		System.out.println("Ngày đầu tiên trong tuần hiện tại là: " + firstDay);
		
		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		
		int weeksInYear = cNow.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Chúng ta đang ở tuần thứ " + weeksInYear + " trong năm ");
		
		// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		
		int currentDay = cNow.get(Calendar.DAY_OF_MONTH);
		System.out.println("20 ngày nữa là ngày " + (currentDay + 20));
		
		// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày
		LocalDate birthDay = LocalDate.of(1996, 12, 22);
		LocalDate nowDay = LocalDate.now();
		
		Period period = Period.between(birthDay, nowDay);
		
		System.out.println("Bạn đã sống được tới thời điểm hiện tại là ");
		System.out.println(period.getYears() + " years " + period.getMonths() + " month " + period.getDays() + " days ");
	}

}
