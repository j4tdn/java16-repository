package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02SingleThread {

	public static void main(String[] args) {
		System.out.println("Ex02SingleThread...started");
		System.out.println(getCurrentThreadName() + " is string");
		Thread thread = new Thread(new Task(),"Thread-X");
		thread.start();
		doTask(2);
		System.out.println("Ex02SingleThread...finished");
	}
	private static String getCurrentThreadName()
	{
		return Thread.currentThread().getName();
	}
	private static class Task implements Runnable
	{
		@Override
		public void run() {
			// task's content
			// this method will be called when current Thread call start() method
			
			System.out.println(getCurrentThreadName() + " is string");
			doTask(5);
			doSomething();
		}
	}
	private static void doSomething()
	{
		System.out.println("Do something ...");
		
	}
	private static void doTask(int seconds)
	{
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
