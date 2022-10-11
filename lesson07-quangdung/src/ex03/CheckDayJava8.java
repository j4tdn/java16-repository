package ex03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class CheckDayJava8 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		int a;
		LocalDate input = LocalDate.of(2022, 10, 10);
		boolean flag = true;
		do {
			System.out.println("\n------------------MENU----------------");
			System.out.println("1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ");
			System.out.println("2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy)");
			System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại");
			System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm");
			System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy");
			System.out.println("6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày");
			a = Integer.parseInt(ip.nextLine());
			switch (a) {
			case 1:
			case 2:
				LocalDate lastdayinM = input.with(TemporalAdjusters.lastDayOfMonth());
				System.out.println(lastdayinM);
				break;
			case 3:
				System.out.println(input.getDayOfWeek());
				LocalDate lastDayinW=input;
				LocalDate firstDayinW=input;
				while(true) {
					if(lastDayinW.getDayOfWeek().toString()=="SUNDAY") {
						break;
					}
					else {
						lastDayinW=lastDayinW.plusDays(1);
					}
				}
				System.out.println("Last day in Week: "+lastDayinW);
				
				while(true) {
					if(firstDayinW.getDayOfWeek().toString()=="MONDAY") {
						break;
					}
					else {
						firstDayinW=firstDayinW.minusDays(1);
					}
				}
				System.out.println("First day in Week: "+firstDayinW);
				break;
			case 4:
				double numberweek= input.getDayOfYear()/7.0;
				System.out.println(input.getDayOfMonth()+" in week number "+Math.ceil(numberweek));
				break;
			case 5: 
				System.out.println(input.plusDays(20).getDayOfWeek());
				break;
			case 6:
				LocalDate getDate =LocalDate.now();
				LocalDate birthday = LocalDate.of(2001,6,23);
				long days = ChronoUnit.DAYS.between(birthday, getDate);
				System.out.println("you live "+days);
				break;
			default:
				System.out.println("Thoat");
				flag = false;
				break;
			} 
		} while (flag);
	}
}
