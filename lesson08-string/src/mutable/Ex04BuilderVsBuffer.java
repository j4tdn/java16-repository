package mutable;

public class Ex04BuilderVsBuffer {
	public static void main(String[] args) {
		Task task = new Task();
		
		Thread t1 = new Thread(task, "Thread-1");
		Thread t2 = new Thread(task, "Thread-2");
		
		t1.start();
		t2.start();
	  
		System.out.println("Length: "+ task.getSbLength);
	}
	
	private static class Task implements Runnable {
		
		 private StringBuffer sb;
		 private static int COUNT = 50000;
		 
		 public Task () {
			// sb =new StringBuffer();
			 sb = new StringBuilder();
		 }
		 
		 @Override
		 public void run() {
			 System.out.println(Thread.currentThread().getName() + " is running ..");
		 }
	}

}
