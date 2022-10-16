package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02SingleThread {
	private static class Task implements Runnable{
		@Override
		public void run() {
			// task's content
			// this method is called when current thread call start() method
			System.out.println(getCurrentThreadName() + " is running");
			doTask(5);
			doSth();
		}
	}
	private static void doSth() {
		System.out.println("do sth...");
	}
	private static void doTask(int second) {
		try {
			TimeUnit.SECONDS.sleep(second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// default thread -> thread main
		System.out.println("Ex02SingleThread starts");
		System.out.println(getCurrentThreadName() + " is running");
		
		// runnable: task that thread will execute
		Thread thread = new Thread(new Task(), "Thread-X");
		thread.start();
		doTask(2);
		System.out.println("Ex02SingleThread finishes");
	}
	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
}
