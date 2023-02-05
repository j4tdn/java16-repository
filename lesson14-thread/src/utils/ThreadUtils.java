package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	private ThreadUtils() {
	}
	
	public static void printCurrentTheadName() {
		System.out.println(">> thread #" + Thread.currentThread().getName());
	}
	
	public static void startThead() {
		System.out.println(Thread.currentThread().getName() + " is running ...");
	}
	
	public static void startThead(long time ) {
		System.out.println(Thread.currentThread().getName() + " is running ..." + time);
	}
	
	public static void endThead(long start) {
		System.out.println(Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - start));
	}
	
	public static String getTheadName() {
		return Thread.currentThread().getName();
	}
	
	// virtual task with a certain time
	public static void doTask(long time, TimeUnit unit) {
		try {
			unit.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// block current thread
	public static void join(Thread thread) {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
