package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02SingleThread {
	public static void main(String[] args) {
		// default thread --> thread main
		System.out.println("Ex02SingleThread...start");

		System.out.println(getCurrentThreadName() + " is running ...");

		// runnable: task that thread will execute
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
			System.out.println(getCurrentThreadName() + " is running ...");
			doTask(5);
			doSomething();

		}
	}

	private static void doTask(int second) {
		try {
			TimeUnit.SECONDS.sleep(second);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void doSomething() {
		System.out.println("Do something ...");
	}

	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}

}
