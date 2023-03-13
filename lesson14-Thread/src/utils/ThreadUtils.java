package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	private ThreadUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void currentThread() {
		System.out.println("currentThread # "+ Thread.currentThread().getName());
	}
	public static void doTask(long time, TimeUnit unit) {
		try {
			unit.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
