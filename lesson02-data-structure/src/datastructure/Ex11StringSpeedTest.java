package datastructure;

import java.util.Iterator;

public class Ex11StringSpeedTest {
	private static final int count = 10000;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			String s1 = new String("hello");
			String s2 = new String("hello");
			
//			String s1 = "hello";
//			String s2 = "hello";
		}
		long end = System.currentTimeMillis();
		System.out.println("duration " + (end - start ) + "ms");

	}

}
