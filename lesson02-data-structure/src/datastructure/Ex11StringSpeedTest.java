package datastructure;

public class Ex11StringSpeedTest {
	private static final int COUNT = 100000;
	public static void main(String[] args) {
		// 
		long start = System.currentTimeMillis();
		// Duyệt, lặp lại công việc 100000 lần
		for (int i = 1; i <= COUNT; i++) {
			// STACK = 200000, HEAP = 200000
			String s1 = new String("hello");
			String s2 = new String("hello");
			
			// STACK = 200000, HEAP = 1
			// String s1 = "hello";
			// String s2 = "hello";
		}
		long end = System.currentTimeMillis();
		System.out.println("Duration: " + (end - start) + " ms");
	}
}
