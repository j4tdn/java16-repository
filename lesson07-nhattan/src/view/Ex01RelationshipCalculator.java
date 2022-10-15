package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex01RelationshipCalculator {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";
	
	public static void main(String[] args) {
		createMenu();
	}
	
	public static void createMenu()	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		LocalDateTime dtStart = null;
		LocalDateTime dtEnd = LocalDateTime.now();
		
		Scanner ip = new Scanner(System.in);
		char choose;
		
		System.out.println("================= Hẹn hò ================");
		System.out.print("Nhập thời điểm bắt đầu (dd/MM/yyyy HH:mm:ss): ");
		System.out.println("01/01/2018 22:20:40\n");
		
		// dtStart = LocalDateTime.parse(ip.nextLine(), dtf);
		dtStart = LocalDateTime.parse("01/01/2018 22:20:40", dtf);
		
		System.out.println("1. Sắp chia tay");
		System.out.println("2. Đã chia tay");
		System.out.print("Nhập lựa chọn của bạn (1, 2): ");
		
		choose = ip.nextLine().charAt(0);
		
		switch (choose) {
		case '1' :
			datingTime(dtStart, dtEnd);
			break;
		case '2':
			System.out.print("\nNhập thời điểm chia tay (dd/MM/yyyy HH:mm::ss): ") ;
			System.out.println("01/03/2020 20:25:45\n");
			
			// dtEnd = LocalDateTime.parse(ip.nextLine(), dtf);
			dtEnd = LocalDateTime.parse("01/03/2020 20:25:45", dtf);
			datingTime(dtStart, dtEnd);
			break;
		default:
			System.out.println("Sai cú pháp.");
			break;
		}
	}
	
	private static void datingTime(LocalDateTime startInclusive, LocalDateTime endExclusive) {
		
		if (startInclusive.isAfter(endExclusive)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd !!!");
		}
		
		LocalDate dateStart = startInclusive.toLocalDate();
		LocalDate dateEnd = endExclusive.toLocalDate();
		
		LocalTime timeStart = startInclusive.toLocalTime();
		LocalTime timeEnd = endExclusive.toLocalTime();
		
		if (timeEnd.isBefore(timeStart)) {
			dateEnd = dateEnd.minusDays(1);
		}
		
		Period period = Period.between(dateStart, dateEnd);
		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();
		
		Duration du = Duration.between(startInclusive, endExclusive);
		long hours = du.toHoursPart();
		int minutes = du.toMinutesPart();
		int seconds= du.toSecondsPart();
		
		System.out.println("\n=> Ngày bắt đầu hẹn hò là thứ " + (startInclusive.getDayOfWeek().getValue() + 1));
		System.out.println("=> Mối tình đã được: ");
		System.out.println("\t" + years + " năm\n"
						 + "\t" + months + " tháng\n"
						 + "\t" + days + " ngày\n"
						 + "\t" + hours + " giờ\n"
						 + "\t" + minutes + " phút\n"
						 + "\t" + seconds + " giây\n"); 
	}
}
