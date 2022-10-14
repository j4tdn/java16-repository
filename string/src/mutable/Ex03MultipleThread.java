package mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MultipleThread {

	private static long currentTime;
	
	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Task(3, TimeUnit.SECONDS), "Thread-1");
		Thread thread2 = new Thread(new Task(4, TimeUnit.SECONDS), "Thread-2");
		Thread thread3 = new Thread(new Task(3, TimeUnit.SECONDS), "Thread-3");
		currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println(Thread.currentThread().getName() + " takes " + (System.currentTimeMillis() - currentTime));
		
	}
	
	private static class Task implements Runnable{
		
		private int time;
		private TimeUnit unit;
		
		Task(int time, TimeUnit unit){
			this.time = time;
			this.unit = unit;
		}
		@Override
		public void run() {
			System.out.println(printThreadName() + " is running ....");
			doTask(this.time, this.unit);
			System.out.println(Thread.currentThread().getName() + " takes " + (System.currentTimeMillis() - currentTime));
			
		}
	}
	
	private static void doTask(int time, TimeUnit unit) {
		try {
			unit.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void doSomething() {
		System.out.println("Do something....");
	}
	
	private static String printThreadName() {
		return Thread.currentThread().getName();
	}

}
