package mutable;
/**
 * String: store date
 * <StringBuider>, StringBuffer: operation ---> append, delete
 * --> reduce redundant memory
 *StringBuider > String || StringBuffer
 */
public class Ex04BuilderVsBuffer {
	public static void main(String[] args) {
		task t1 = new task();
		
		Thread td1 = new Thread(t1,"T1");
		Thread td2 = new Thread(t1,"T2");
		
		td1.start();
		td2.start();
		
		try {
			td1.join();
			td2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Length: " + t1.lengthh());
	}
	
	private static class task implements Runnable{
		StringBuilder sb;
		int count = 50000;
		public task(){
			sb = new StringBuilder();
		}
		
		@Override
		public void run() {
			System.out.println(getCurrentThreadName() + " is running ....");
			for (int i = 0; i < count; i++) {
				sb.append("a");
			}
		}
		
		public int lengthh() {
			return sb.length();
		}
		
	}
	private static String getCurrentThreadName() {
		return Thread.currentThread().getName();
	}
	
}
