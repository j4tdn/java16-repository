package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02SingleThread {

	public static void main(String[] args) {
		// default thread --> thread main
		System.out.println("Ex02SingleThread...started");

		System.out.println(getCurentThreadName() + " is running...");

		// runnable: task that thread will excute
		Thread thread = new Thread(new Task(), "Thread-X");
		thread.start();
		
		doTask(2);
		System.out.println("Ex02SingleThread...finish");
	}

	private static class Task implements Runnable {
		@Override
		public void run() {
			// task's content
			// this method will be called when current Thread call start() method
			System.out.println(getCurentThreadName() + " is running ...");
			doTask(5);
			doSomething();
		}
	}

	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static void doSomething() {
		System.out.println("Do something...");
	}

	private static String getCurentThreadName() {
		return Thread.currentThread().getName();
	}
}
