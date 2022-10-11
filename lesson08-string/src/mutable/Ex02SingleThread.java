package mutable;

import java.util.concurrent.TimeUnit;

public class Ex02SingleThread {
	public static void main(String[] args) {
		//default thread --> thread main
		System.out.println("Ex02SingleThread....started");
		
		System.out.println(getCurrentThreadName() + "is running");
		
		Thread thread = new Thread(new task(), "Thread-X");
		thread.start();
		dotask(2);
		System.out.println("Ex02SingleThread....finished"); 
	}
	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
	private static class task implements Runnable{
		@Override
		public void run() {
			// task's content
			//this method will be called when Thread call start() method
			System.out.println(getCurrentThreadName() + "is running");
			
			dotask(5);
			doSomething();
		}
	}
	private static void doSomething() {
		System.out.println("doSomething.....");
	}
	private static void dotask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
