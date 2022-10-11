package mutable;

//String: store data
//StringBuilder, StringBuffer: operation --> append, delete
//--> reduce redundant memory
//StringBuilder và StringBuffer:
//Nếu không dùng đa luồng thì nên dùng StringBuilder vì xử lý sẽ nhanh hơn StringBuffer
public class Ex04BuilderVsBuffer {
	public static void main(String[] args) {
		Task task = new Task();
		// task#sb(0)

		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");

		t1.start();
		t2.start();

		// Thread main will be run remaining tasks after current current threads done
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// task#sb(100000)
		System.out.println("Length: " + task.getSbLength());
	}

	private static class Task implements Runnable {
		private StringBuffer sb;
//		private StringBuilder sb;
		private static int COUNT = 50000;

		public Task() {
			sb = new StringBuffer();
//			sb = new StringBuilder();//Không đồng bộ kịp
		}

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running ...");
			for (int i = 1; i <= COUNT; i++) {
				sb.append("a");
			}
		}

		public int getSbLength() {
			return sb.length();
		}
	}
}
