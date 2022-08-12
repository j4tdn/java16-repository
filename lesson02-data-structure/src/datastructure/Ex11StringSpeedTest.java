package datastructure;

public class Ex11StringSpeedTest {
	private static final int count=100000;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i =1; i<= count; i++) {
			//STACK = 200.000, HEAP = 200.000
			//String s1 = new String("hello");
			//String s2 = new String("hello");
			
			//STACK = 200.000, HEAP = 1
			String s1 = "hello";
			String s2 = "hello";
		}
		long end = System.currentTimeMillis();
		System.out.println("time: " + (end - start) + " ms");
	}

}
