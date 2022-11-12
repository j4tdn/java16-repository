package declaration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex03ArrayHeapMemory {
	public static void main(String[] args) {
		int a = 10;
		modify(a);
		System.out.println("a: " + a);
		
		int[] array = {2, 4};
		modify(array);
		System.out.println("number: " + Arrays.toString(array));
	}
	
	private static void modify(int input) {
		input = 20;
	}
	private static void modify(int[] number) {
		number[0] = 99;
	}
}
