package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	private ThreadUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printCurrentThreadName() {
		System.out.println(">> thread# "+Thread.currentThread().getName());
	}
	public static void StratThread() {
		System.out.println(Thread.currentThread().getName() + "is running ...");
	}
	public static String getThreadName() {
		return Thread.currentThread().getName();
	}
	
	//virual task with a certain time== giả lập task với thời gian cụ thể
	public static void task(long time, TimeUnit unit) {
		//TimeUnit.HOURS.sleep(2);
		try {
			unit.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//thực thi xong thread đang chạy rồi mới tới thread khác
	public static void join(Thread thread) {
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
