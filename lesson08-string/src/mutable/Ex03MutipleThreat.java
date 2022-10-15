package mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MutipleThreat {
	public static void main(String[] args) {
		
	}
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	private static class Task implements Runnable{
		@Override
		public void run() {
			// tasks's content
			System.out.println(getCurrentThreadName()+"is running...");
			doTask(5);
			doSomeThing();
		}
	}
	private static void doSomeThing() {
		System.out.println("do shomethong ...");
	}
	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}


}
