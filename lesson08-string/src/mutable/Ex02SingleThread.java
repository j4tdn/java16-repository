package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02SingleThread {

	public static void main(String[] args) {
		// default thread --> thread main
				System.out.println("Ex02SingleThread...started");
				
				System.out.println(getCurrentThreadName() + " is running ....");
				
				// runnable: task that thread will execute
				// Thread#runnable=new Task()
				Thread thread = new Thread(new Task(), "Thread-X");
				thread.start(); // thread.run() --> runnable.run()
				
				doTask(2);
				System.out.println("Ex02SingleThread...finished");
	}
	
	private static class Task implements Runnable {

		@Override
		public void run() {
			// tasks's content
			// this method will be called when current Thread call start() method
			System.out.println(getCurrentThreadName() + " is running ....");
			doTask(5);
			doSomething();
			
		}
		
	}
	
	// doTask(5)
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void doSomething() {
		System.out.println("Do somthing ...");
	}
	
	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}

}
