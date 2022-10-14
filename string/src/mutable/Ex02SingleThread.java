package mutable;

public class Ex02SingleThread {
	public static void main(String[] args) {
		System.out.println("Ex02SingleThread...start");
		
		System.out.println(getCurrentThreadName() + " is running ....");
		
		
		//runnable: task that thread will execute
		Thread thread = new Thread(new Task(), "Thread-X");
		thread.start();
		SLEEP(5);
		System.out.println("Ex02SingleThread...end");
	}
	
	private static void SLEEP(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static class Task implements Runnable{
		@Override
		public void run() {
			System.out.println(getCurrentThreadName() + " is running ....");
			doSomething();
			
		}
	}
	
	private static void doSomething() {
		System.out.println("Do something....");
	}
	
	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
	
	
	
}
