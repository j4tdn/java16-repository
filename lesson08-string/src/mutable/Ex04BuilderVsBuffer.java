package mutable;

// String vẫn dùng để lưu trữ 
//StringBuilder,StringBuffer : operation --> append,delete
//--> reduce redundant memory
public class Ex04BuilderVsBuffer {
	public static void main(String[] args) {
		Task task = new Task();
		
		Thread t1 = new Thread(task,"Thread-1");
		Thread t2 = new Thread(task,"Thread-2");
		
		t1.start();
		t2.start();
		
		//thread-main will be run remaining tasks after current threads done
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Lenght: "+task.getSblength());
	}
	
	private static class Task implements Runnable{
		
		private StringBuffer sb;
		//private StringBuilder sb;
		private static int COUNT = 50000;
		
		public Task() {
			sb= new StringBuffer();
			//sb = new StringBuilder();
		}
		
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+" is running...");
			for(int i=0;i<COUNT;i++) {
				sb.append("a");
			}
		}
		public int getSblength() {
			return sb.length();
		}
	}
}