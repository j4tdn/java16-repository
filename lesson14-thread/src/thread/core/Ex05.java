package thread.core;

public class Ex05 {
	// volatile read data from main memory
	// non volatile -> read data from each CPU cache -> reduce wrong case
	private static volatile int counter = 2;
	//12m, 1m2, 21m, 2m1, m12, m21
	//#main
	public static void main(String[] args) {
		System.out.println("Thread main start");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("#Thread1 is running...");
				counter++;
				System.out.println("#Thread1 counter: " + counter);
				
			}
		}, "thread1");
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("#Thread1 is running...");
				counter*=2;
				System.out.println("#Thread2 counter: " + counter);
				
			}
		}, "thread2");
		t2.start();
		
		counter +=2;
		System.out.println("#main counter: " + counter);
		System.out.println("Thread main end");
		
	}

}
