package datastructure;

public class Ex11StringSpeedTest {
	private static final int COUNT = 100000;
	public static void main(String[] args) 
	{
		long start = System.currentTimeMillis();
		for (int i =1; i<=COUNT;i++) {
//			STACK = 200.000, HEAP = 200.000
//			String s1 = new String("Hello");
//			String s2 = new String("Hello"); // ~14ms
			
//			STACK = 200.000, HEAP = 1;
//			String s1 = "Hello";
//			String s2 = "Hello"; // ~2ms
		}
		long end = System.currentTimeMillis();
		System.out.println("Duration: " + (end - start) + " ms");
	}
}
