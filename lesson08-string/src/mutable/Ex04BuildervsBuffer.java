package mutable;

public class Ex04BuildervsBuffer {
	public static void main(String[] args) {
		Task task = new Task();
		
		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + task.sb.length());
	}
	private static class Task implements Runnable{
		private StringBuffer sb;
		private static int count = 50000;
		public Task() {
			sb = new StringBuffer();
		}
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running....");
			for(int i = 1; i <= count; i ++) {
				sb.append("a");
			}

		}
		public int getSbLength() {
			return sb.length();
		}
	}

}
