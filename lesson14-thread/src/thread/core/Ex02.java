package thread.core;

import java.util.concurrent.TimeUnit;
import static utils.ThreadUtils.*;


public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Main start");
		
		Thread t1 = new Thread(new Task(), "thread1");
		t1.start(); //automatically call t1.run
		
		//current thread
		printCurrentThreadName();
		System.out.println("Main end");
	}
	
	private static class Task implements Runnable{
		@Override
		public void run() {
			//prepare data took 2
			doTask(2, TimeUnit.SECONDS);
			printCurrentThreadName();
			System.out.println("Running a task...");
			
		}
	}

}
