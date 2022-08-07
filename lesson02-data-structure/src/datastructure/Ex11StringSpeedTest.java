package datastructure;

public class Ex11StringSpeedTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		for(int i = 1 ; i < 10000000; i ++) {
//			String s1 = new String("hello");
//			String s2 = new String("hello");
//			//chay lau vl
//		}
		String s1 = "hello";
		String s2 = "hello";
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
