package thread.core;

import static utils.ThreadUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread t1 = new Thread(new Task(), "thread1");
		t1.start();
		join(t1);
		
		Thread t2 = new Thread(new Task(), "thread2");
		t2.start();
		join(t2);

		printCurrentTheadName();
		System.out.println("main end");
	}
	
	private static class Task implements Runnable {
		
		@Override
		public void run() {
			printCurrentTheadName();
			System.out.println("running a task ...");
		}
	}
}
