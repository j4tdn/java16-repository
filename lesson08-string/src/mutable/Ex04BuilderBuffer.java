package mutable;

//String vẫn dùng để lưu trữ 
//StringBuilder,StringBuffer : operation --> append,delete
//--> reduce redundant memory
//StringBuilder > String || StringBuffer

public class Ex04BuilderBuffer {
	public static void main(String[] args) {
		Task task = new Task();
		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");
		t1.start();
		t2.start();
		// ohter threads will be run remaining tasks after current thread()
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Length: " + task.getSbLenght());
	}

	private static class Task implements Runnable {
		private StringBuilder sb;
		private static int COUNT = 5;

		public Task() {
//			sb = new StringBuffer();
			sb = new StringBuilder();
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName() + " is running ....");
			for (int i = 1; i <= COUNT; i++) {
				sb.append("a");
			}
		}

		public int getSbLenght() {
			return sb.length();
		}
	}
}
