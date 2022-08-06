package datastructure;

import java.util.Iterator;

public class Ex11StringSpeechTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String s1 = "hello";
			String s2 = "hello";
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}

}
