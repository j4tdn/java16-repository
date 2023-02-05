package thread.pool;

import static utils.ThreadUtils.doTask;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import utils.ThreadUtils;

public class Ex03 {
	private static Random rd = new Random();
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Thread, runnable
		// Thread pool
		// + Blocking queue
		// + Threads
		
		//Thread pool
		// + >> execute(Runnable): void
		// + >> submit(Callable<T>): Future<T>
		
		//Future task implements RunnableFuture<V> extends Runnable, Future<V>
		// + Callable >> Task
		// + Future<T> return value 
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		FutureTask<Integer> futureTask = new FutureTask<>(new Task()); 
		
		//submit task >. set return value to FutureTask
		service.submit(futureTask);
		
		//return
		System.out.println(futureTask.get());
		service.shutdown();
		
		
	}
	
	private static class Task implements Callable<Integer>{
		@Override
		public Integer call() throws Exception {
			int rand = 10 +  rd.nextInt(20);
			ThreadUtils.startThread(rand);
			doTask(2, TimeUnit.SECONDS);
			return rand;
		}
		
	}

}
