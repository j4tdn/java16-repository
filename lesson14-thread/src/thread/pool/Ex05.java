package thread.pool;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Ex05 {
	private static ExecutorService service;
	private static int poolSize = 4;
	static {
		service = Executors.newFixedThreadPool(poolSize);
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<List<Integer>> digitTask = new FutureTask<>(() -> loadDigits());
		
		FutureTask<List<String>> textTask = new FutureTask<>(() -> loadTexts());
		
		//submit task
		submitTask(Arrays.asList(digitTask, textTask));
		
		//get return value 
		List<Integer> digits = digitTask.get();
		List<String> texts = textTask.get();
		
		System.out.println(digits);
		System.out.println(texts);
		service.shutdown();
	}
	
	private static void submitTask(List<FutureTask<?>> tasks) {
		tasks.forEach(service::submit);
//		for(FutureTask<?> task : tasks){
//			service.submit(task);
//		}
		
		//tasks.forEach(task -> service.submit(task));
	}
	
	//query from database
	public static List<Integer> loadDigits(){
		return Arrays.asList(1,2,3,4,5);
	}

	public static List<String> loadTexts(){
		return Arrays.asList("a", "b", "c", "d", "f");
	}

}
