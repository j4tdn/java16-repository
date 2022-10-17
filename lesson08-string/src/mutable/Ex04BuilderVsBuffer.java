package mutable;
// still store data with String
// StringBuilder(single thread) and StringBuffer(multiple threads) used for operation -> append, delete
// in order to reduce redundant memory
// StringBuilder is preferable owing to its performance
public class Ex04BuilderVsBuffer {
	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();
		Thread t1 = new Thread(task, "Thread1");
		Thread t2 = new Thread(task, "Thread2");
		// task#sb(0)
		t1.start();
		t2.start();
		// task#sb(100000)
		// other threads (in this case, that is main)
		// will run remaining task after current threads done
		t1.join();
		t2.join();
		System.out.println("length: " + task.getSbLength());
	}

	private static class Task implements Runnable {
		private StringBuffer sb;
//		private StringBuilder sb;
		private static int count = 50000;

		public Task() {
//			sb = new StringBuilder();
			sb = new StringBuffer();
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running");
			for (int i = 1; i <= count; i++) {
				sb.append("a");
			}
		}
		public int getSbLength() {
			return sb.length();
		}
	}
}
