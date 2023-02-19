package thread.core;

import static util.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex01 {
	
	// thread main
	public static void main(String[] args) {
		// Thread t1 = new Thread(Runnable);
		// t1.start() >>> t1.run[native method] >> t1.run() {runnable.run()}
		System.out.println("main start");
		
		Thread t1 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				// prepare data took 2s
				doTask(2, TimeUnit.SECONDS);
				
				printCurrentThreadName();
				System.out.println("Running a task ...");
			}
		}, "thread1");
		t1.start(); // automatically call t1.run >> runnable
		
		
		
		// current thread 
		printCurrentThreadName();
		System.out.println("main end");
		
	}
	
	
}	
