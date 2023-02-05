package thread.core;

import java.util.concurrent.TimeUnit;
import static utils.ThreadUtils.*;

public class Ex01 {
	//thread main
	public static void main(String[] args) {
		//Thread t1 = new Thread(new Runnable() 
		//t1.start >>> t1.run[native method] >>> t1.run() {runnable.run}
		System.out.println("Main start");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//prepare data took 2
				doTask(2, TimeUnit.SECONDS);
				printCurrentThreadName();
				System.out.println("Running a task...");
				
			}
		}, "thread1");
		t1.start(); //automatically call t1.run
		
		
		//current thread
		printCurrentThreadName();
		System.out.println("Main end");
	}

}
