package mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MultipleThread {
	private static long start;
	public static void main(String[] args) {
		Task task1 = new Task(3, TimeUnit.SECONDS);
		Task task2 = new Task(5, TimeUnit.SECONDS);
		Task task3 = new Task(4, TimeUnit.SECONDS);
		Thread tA = new Thread(task1, "TA");
		Thread tB = new Thread(task2, "TB");
		Thread tC = new Thread(task3, "TC");
		start = System.currentTimeMillis();
		tA.start();
		tB.start();
		tC.start();
		task1.run();
		task2.run();
		task3.run();
	}
	private static class Task implements Runnable{
		private int time;
		private TimeUnit tu;
		
		public Task(int time, TimeUnit tu) {
			this.time = time;
			this.tu = tu;
		}
		@Override
		public void run() {
			// task's content
			// this method is called when current thread call start() method
			printThreadName();
			doTask(time, tu);
			System.out.println(Thread.currentThread().getName() + " takes " + (System.currentTimeMillis()-start));
		}
	}
	private static void doTask(int time, TimeUnit tu) {
		try {
			tu.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void printThreadName() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}
