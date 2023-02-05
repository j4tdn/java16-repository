package thread.core;

import java.util.concurrent.TimeUnit;

import static utils.ThreadUtils.*;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread t1 = new Thread(() -> {
			// prepare data took 2s
			doTask(2, TimeUnit.SECONDS);
						
			printCurrentThreadName();
			System.out.println("Running a task");
		}, "thread1");
		
		t1.start();
		
		// current thread
		printCurrentThreadName();
		System.out.println("main end");
	}
}
