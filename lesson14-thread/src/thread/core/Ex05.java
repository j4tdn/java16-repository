package thread.core;

public class Ex05 {
	//#main: +=2
	//#thread1 +=1
	//#thread2 *=2
	
	//thread main->1->2:4.5.10
	//m21:4-8-9
	//12m:3-6-8
	//1m2: 3-5-10
	//21m: 4-5-7
	//2m1 :4-6-7
	
	//kết quả ở đâu thì thread ở đó in ra--> ko lấy kết quả của thread 1 in vào thread 2
	
	
	/*
	 * khi dùng chung dữ liệu thì: 
	volatile : đọc data từ main memory
	non volatile : read data từ each CPU cache>> bỏ trường hợp sai
	*/
	
	private static volatile int counter=2;
	public static void main(String[] args) {
		System.out.println(">> thread main start");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("#thread is running");
				counter++;
				System.out.println("#thread1 count: " + counter);
			}
		});t1.start();
		 
       Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("#thread is running");
				counter*=2;
				System.out.println("#thread1 count: " + counter);
			}
		});t2.start();
		
		counter+=2;
		System.out.println("#main counter: " +counter);
		
		System.out.println(">>thread main end");
	}

}
