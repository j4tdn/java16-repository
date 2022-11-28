package mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MutipleThread {
	private static long start;
	public static void main(String[] args) {
		Task task01 = new Task(3, TimeUnit.SECONDS);
		Task task02 = new Task(4, TimeUnit.SECONDS);
		Task task03 = new Task(5, TimeUnit.SECONDS);
		
		Thread ta = new Thread(task01,"TA");
		Thread tb = new Thread(task02,"TB");
		Thread tc = new Thread(task03,"TC");
		
		start = System.currentTimeMillis();

		ta.start();
		tb.start();
		tc.start();
		
		
	}
	
	private static class Task implements Runnable{
		
		private int time;
		private TimeUnit tu;
		
		public Task(int time,TimeUnit tu) {
			this.time=time;
			this.tu=tu;
		}
		
		@Override
		public void run() {
			printThreadName();
			doTask(5,TimeUnit.SECONDS);
			System.out.println(Thread.currentThread().getName()+" take "+(System.currentTimeMillis()-start)+" ms");
			
		}
	}
	
	private static void doTask(int time,TimeUnit tu) {
		try {
			tu.SECONDS.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void printThreadName() {
		System.out.println(Thread.currentThread().getName()+" is running ... ");
	}
}
