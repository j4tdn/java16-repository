package thread.core;

public class Ex05 {
	public static volatile int counter = 2;
	public static void main(String[] args) {
		System.out.println("Thread main start");
		
		
		Thread t1 = new Thread(() -> {
			System.out.println("t1 is running");
			counter ++ ;
			System.out.println("#t1 counter = " + counter);
		}, "Thread 1");
		
		t1.start();
		
		
		Thread t2 = new Thread(() -> {
			System.out.println("t2 is running");
			counter *= 2 ;
			System.out.println("#t2 counter = " + counter);
		}, "Thread 2");
		
		t2.start();
		
		counter +=2 ;
		System.out.println("#main counter = " + counter);
		
		System.out.println("Thread main end");
	}
}
