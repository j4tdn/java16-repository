package mutable;
/*
 * String: Store data
 * <StringBuilder>, StringBuffer: operation --> append, delete 
 * --> reduce redundant memory
 * StringBuilder > faster than String||StringBuffer
 */

public class Ex04BuilderVsBuffer {
	public static void main(String[] args) {
		Task task = new Task();
		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		t1.start();
		t2.start();

		// other thread will be run remaining task after current threads done

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// task#sb(100000)
		System.out.println("Length: " + task.getsbLength());

	}

	private static class Task implements Runnable {
		private StringBuffer sb;
		private static int COUNT = 50000;

		public Task() {
			sb = new StringBuffer();
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running ...");
			for (int i = 1; i <= COUNT; i++) {
				sb.append("a");
			}
		}

		public int getsbLength() {
			return sb.length();
		}

	}
}
