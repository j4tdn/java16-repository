package thread.core;

import static utils.ThreadUtils.*;

import java.util.concurrent.TimeUnit;

public class Ex01 {
	//thread main
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				doTask(2, TimeUnit.SECONDS);
				currentThread();
				System.out.println("running a task...");
				
			}
		}, "thread 1");
		t1.start();
	    currentThread();
		
		System.out.println("main end");
	}

}
