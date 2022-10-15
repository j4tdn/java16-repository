package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02SingleThread {
	public static void main(String[] args) {
		// default thread --> thread main
		System.out.println("Ex02SingleTHread...started");
		
		System.out.println(getCurrentThreadName()+" is run name");
		
		//runnable: task thread will execute
		Thread thread = new Thread(new Task(), "Thread-X");
		thread.start(); // thread.run() --> runnable.run()
		doTask(2);
		System.out.println("Ex02SingleThread...finshed");
	}
	
	private static class Task implements Runnable{
		@Override
		public void run() {
			//tasks's content
			//this method will be called when current thread call start() method
			System.out.println(getCurrentThreadName()+" is Running .... ");
			doTask(5);
			doSomething();
			
		}
	}
	
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void doSomething() {
		System.out.println("Do something ... ");
	}
	
	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
}