package mutable;

/**
 * String store data
 * <StringBuilder>,StringBuffer: operation --> append , delete
 * --> reduce redundant memory
 * StringBuilder ->String||StringBuffer
 *
 */

public class Ex04BuilderVsBuffer {
	public static void main(String[] args) {
		Task task = new Task();
		
		Thread t1 = new Thread(task , "Thread-1");
		Thread t2 = new Thread(task , "Thread-2"); 
		
		t1.start();
		t2.start();
		
		// orther threads will be run remaining tasks after current threads(t1-t2) done
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//task#sb(100000)
		System.out.println("Length: " + task.getSbLength());
	}
	
	private static class Task implements Runnable{
		
		private StringBuilder sb;
		private static int COUNT = 50000;
		
		public Task() {
			// sb = new StringBuffer();
			sb = new StringBuilder();
		}
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+ " is running...");
			for (int i = 1 ; i <= COUNT ; i++) {
				sb.append("a");
			}
			
		}
		
		public int getSbLength() {
			return sb.length();
		}
	}
}
