package thread.core;

import static util.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Ex04 {
	// Task: Took 3 seconds
	// Demo performance case with 3 calculation tasks - Took 9 seconds
	// Run single task: Took 9 seconds
	// Run parallel with 3 threads:  Took ~3 seconds
	private static long start = 0;
	
	public static void main(String[] args) {
		Task task1 = new Task(3, SECONDS);
		Task task2 = new Task(4, SECONDS);
		Task task3 = new Task(3, SECONDS);
		
		start = System.currentTimeMillis();
		
		Thread t1 = new Thread(task1, "thread1");
		t1.start();
		
		Thread t2 = new Thread(task2, "thread2");
		t2.start();
		
		Thread t3 = new Thread(task3, "thread3");
		t3.start();
		
	}
	
	private static class Task implements Runnable {
		private long time;
		private TimeUnit unit;
		
		
		public Task(long time, TimeUnit unit) {
			this.time = time;
			this.unit = unit;
		}
		
		@Override
		public void run() {
			startThread();
			doTask(time, unit);
			demoSync();
			System.out.println(getThreadName() + " tooks: " + (System.currentTimeMillis() - start) + " ms");
		}
		// synchronized data
		// synchronized method
		private synchronized void demoSync() {
			System.out.println(getThreadName() + " accessed synchronized method");
			System.out.println("end synchronized method");
		}
	}
}
