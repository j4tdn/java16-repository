package datetime;

import java.util.Calendar;

public class Ex04SundayCounter_Jasmine {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println("count: " + count(c));
	}
	
	private static int count(Calendar c) {
		int count = 1;
		int sunT = c.getFirstDayOfWeek();
		System.out.println(sunT);
		int x=sunT;
		int y=sunT;
		do {
			x -= 7;
			if (x>=1) count++;
			y += 7;
			if (y<=c.getActualMaximum(Calendar.DATE)) count++;
			if (x<1 && y>c.getActualMaximum(Calendar.DATE)) break;
		} while (true);
		return count;
	}
}
