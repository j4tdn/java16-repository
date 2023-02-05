package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Ex04 {
	//1 task mất 3s
	//3 task chạy tuần tự mất 9 
	//chạy 3 task với 3 thread mất 3s
	private static long start =0;
	
	public static void main(String[] args) {
		Task task1 = new Task(3, SECONDS);
		Task task2 = new Task(4, SECONDS);
		Task task3 = new Task(3, SECONDS);
		
		start = System.currentTimeMillis();
		
		Thread t1 = new Thread(task1,"thread 1");
		t1.start();
		
		Thread t2 = new Thread(task2,"thread 1");
		t2.start();
		
		Thread t3 = new Thread(task3,"thread 1");
		t3.start();
		
		
	}
	public static class Task implements Runnable{
		@SuppressWarnings("unused")
		private long time;
		private TimeUnit unit;
		
		
		public Task(long time, TimeUnit unit) {
			this.time =time;
			this.unit=unit;
		}
		
		@Override
		public void run() {
			StratThread();
			task(3, TimeUnit.SECONDS);
			System.out.println(getThreadName() + "Tooks " +(System.currentTimeMillis()-start) + "ms");
		}
	}

}
