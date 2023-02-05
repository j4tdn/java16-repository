package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static utils.ThreadUtils.*;

public class Ex01 {
	private static Random rd = new Random();
	private static long start = 0;
	private static int capacity = 20;
	
	public static void main(String[] args) {
		System.out.println("thread start");
		
		start = System.currentTimeMillis();
		//blocking queue
		List<Task> tasks = new ArrayList<>(capacity);
		for (int i = 0 ; i < capacity; i++) {
			long time = 2 + rd.nextInt(6);
			tasks.add(new Task(time,TimeUnit.SECONDS));
		}
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processcors" + processors);
		ExecutorService service = Executors.newFixedThreadPool(processors);
		
		for(Task task: tasks) {
			service.submit(task);
		}
		System.out.println("thread end ");
	}
	
	private static class Task implements Runnable {
		private long time;
		private TimeUnit unit;
		
		public Task(long time , TimeUnit unit) {
			this.time = time;
			this.unit = unit;
		}
		@Override
		public void run() {
			starThread(time);
			doTask(time, unit);
			endThread(start);
		}
	}
}
