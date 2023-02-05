package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tuổi: ");
		int age = sc.nextInt();
		System.out.println("Thời gian đã ngủ: ");
		System.out.println(" + Số giờ: ");
		int sleepHours = sc.nextInt();
		System.out.println(" + Số phut: ");
		int sleepMinutes = sc.nextInt();
		
		System.out.println("Thời gian bắt đầu ngủ: ");
		System.out.println(" + Số giờ: ");
		int startSleepHours = sc.nextInt();
		System.out.println(" + Số phut: ");
		int startSleepMinutes = sc.nextInt();
		
		if(age >= 1 && age <=3) {
			startSleepHours = startSleepHours - sleepHours + 20;
			startSleepMinutes -= sleepMinutes;
		}else if(age <= 4 && age >= 13) {
			startSleepHours = startSleepHours - sleepHours + 11;
			startSleepMinutes -= sleepMinutes;
		}else if(age>=14 && age <=17)
	    {
	    	startSleepHours = startSleepHours-sleepHours+9;
	    	startSleepMinutes -= sleepMinutes;
	    }
	    else if(age>=18 && age<=64)
	    {
	    	startSleepHours = startSleepHours-sleepHours+8;
	    	startSleepMinutes -= sleepMinutes;
	    }
	    else
	    {
	    	startSleepHours = startSleepHours-sleepHours+7;
	        startSleepMinutes = sleepHours - sleepMinutes + 30;
	    }

	    timeWakeUp(startSleepHours,startSleepMinutes);
		
	}
	
	public static void timeWakeUp(int hour, int min) {
		if(min < 0) {
			min += 60;
			hour -= 1;
		}
		System.out.println(hour%24 + "h" + min%60 + "m");
	}

}
