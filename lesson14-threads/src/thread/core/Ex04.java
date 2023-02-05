package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex04 {
//	Task took 3s
//	Demo performance case with 3 calculation tasks
//	Run serially each single task took 9s
//	Run in a parallel way took ~3s
	
	private static long start = System.currentTimeMillis();
	
	public static void main(String[] args) {
//		Task task1 = new Task();
//		Task task2 = new Task();
//		Task task3 = new Task();
//		
//		task1.run();
//		task2.run();
//		task3.run();
//		long end = System.currentTimeMillis();
//		System.out.println("took " + (end - start) + "ms"); // 9023ms
		
		Thread t1 = new Thread(new Task(), "Thread 1");
		Thread t2 = new Thread(new Task(), "Thread 2");
		Thread t3 = new Thread(new Task(), "Thread 3");
		start = System.currentTimeMillis();
		t1.start();
		t2.start();
		t3.start();
		// 3ms
	}
	
	private static class Task implements Runnable{

		@Override
		public void run() {
			startThread();
			doTask(3, TimeUnit.SECONDS);
			System.out.println(Thread.currentThread().getName() +" took " + (System.currentTimeMillis() - start));
		}
		
	}
}
