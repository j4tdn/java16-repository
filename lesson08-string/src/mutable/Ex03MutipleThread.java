package mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MutipleThread {
	public static void main(String[] args) {
		Task task01 = new Task(0, 0)
		
	}
	private static void printfThreadName() {
		System.out.println("");
	}
	private static class Task implements Runnable{
		private int time;
		private int tu;
		public Task(int time, int tu) {
			this.time=time;
			this.tu=tu;
		}
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
