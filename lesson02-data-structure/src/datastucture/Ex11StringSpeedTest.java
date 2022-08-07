package datastucture;

public class Ex11StringSpeedTest {
	private static final int COUNT = 100000;

	public static void main(String[] args) {
		// epoch time
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			// STACK = 200.000, HEAP = 200.000
//			String s1 = new String("hello");
//			String s2 = new String("hello");

			// STACK = 200.000, HEAP = 1
			String s1 = "hello";
			String s2 = "hello";
			System.out.println("Hash code: " + System.identityHashCode(s1));
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start) + " ms");
	}
}
