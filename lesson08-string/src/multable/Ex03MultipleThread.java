package multable;

import java.util.concurrent.TimeUnit;

public class Ex03MultipleThread {

	private static long start;

	public static void main(String[] args) {
		Task task01 = new Task(3, TimeUnit.SECONDS);
		Task task02 = new Task(5, TimeUnit.SECONDS);
		Task task03 = new Task(4, TimeUnit.SECONDS);

		Thread tA = new Thread(task01, "TA");
		Thread tB = new Thread(task02, "TB");
		Thread tC = new Thread(task03, "TC");

		start = System.currentTimeMillis();

		tA.run();
		tB.run();
		tC.run();
		
		

	}

	private static class Task implements Runnable {
		private int time;
		private TimeUnit tu;

		public Task(int time, TimeUnit tu) {
			this.time = time;
			this.tu = tu;
		}

		@Override
		public void run() {
			// task's content
			// this method will be called when current Thread call start() method
			printThreadName();
			doTask(time, tu);
			System.out.println(
					Thread.currentThread().getName() + " takes " + (System.currentTimeMillis() - start) + "ms");

		}
	}

	// doTask(5)
	private static void doTask(int time, TimeUnit tu) {
		try {
			tu.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void printThreadName() {
		System.out.println(Thread.currentThread().getName() + " is running...");
	}

}
