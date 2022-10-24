package mutable;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Ex03MutipleThread {
	private static long start;
	public static void main(String[] args) {
		Task task01 = new Task(3, TimeUnit.SECONDS);
		Task task02 = new Task(5, TimeUnit.SECONDS);
		Task task03 = new Task(4, TimeUnit.SECONDS);
		
		Thread tA = new Thread(task01, "TA");
		Thread tB = new Thread(task02, "TB");
		Thread tC = new Thread(task03,"TC");
		start = System.currentTimeMillis();
		tA.start();
		tB.start();
		tC.start();
		
	}
	
	private static void printfThreadName() {
		System.out.println(Thread.currentThread().getName()+ "is running....");
	}
	private static class Task implements Runnable{
		private int time;
		private TimeUnit tu;
		public Task(int time, TimeUnit tu) {
			this.time=time;
			this.tu=tu;
		}
		@Override
		public void run() {
			
			printfThreadName();
			dotask(5, tu);
			System.out.println(Thread.currentThread().getName() + " takes" + (System.currentTimeMillis() - start));
			
		}
	}
	
	private static void dotask(int seconds, TimeUnit tu) {
		try {
			tu.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
