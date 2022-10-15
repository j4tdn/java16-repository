package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02SingleThread {
	public static void main(String[] args) {
		// default thread >> thread main
		System.out.println("Ex02... started");
		System.out.println(getCurrentThreadName() + " is running ..");

		Thread thread = new Thread(new Task(), "Thread-X");
		thread.start();

		doTask(2);

		System.out.println("Ex02... finished");

	}

	private static class Task implements Runnable {

		@Override
		public void run() {

			System.out.println(getCurrentThreadName() + " is running ..");

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
		System.out.println("Do sth...");

	}

	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}

}
