package views;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Ex02TimeWakeUp {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Tuổi: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("Thời gian đã ngủ: ");
		System.out.print("\t+Số giờ: ");
		int hours = Integer.parseInt(ip.nextLine());
		
		System.out.print("\t+Số phút: ");
		int minutes = Integer.parseInt(ip.nextLine());
		
		System.out.print("Thời điểm bắt đầu ngủ (giờ): ");
		int timeBegin = Integer.parseInt(ip.nextLine());
		
		LocalTime timeStart = LocalTime.of(timeBegin, 0);
		Duration slept = Duration.ofHours(hours).plusMinutes(minutes);
		System.out.println("Bạn nên thức dậy lúc: " + timeWakeUp(age, timeStart, slept).toString());
	}
	
	private static LocalTime timeWakeUp(int age, LocalTime timeStart, Duration slept) {
		Duration minTime;
		if (age >= 1 && age <= 3) {
			minTime = Duration.ofHours(20);
		} else if (age >= 4 && age <= 13) {
			minTime = Duration.ofHours(11);
		} else if (age >= 14 && age <= 17) {
			minTime = Duration.ofHours(9);
		} else if (age >= 18 && age <= 64) {
			minTime = Duration.ofHours(8);
		} else {
			minTime = Duration.ofHours(7).plusMinutes(30);
		}
		
		Duration timeLeft = minTime.minus(slept);
		
		LocalTime result = timeStart.plusHours(timeLeft.toHoursPart()).plusMinutes(timeLeft.toMinutesPart());
		return result;
	}
}
