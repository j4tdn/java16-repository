package declaration;

import java.util.Arrays;

public class Ex03ArrayHeapMemory {
	public static void main(String[] args) {
		int a = 10;
		modify(a);
		System.out.println(a);
		int[] number= {2,4};
		modify(number);
		System.out.println(Arrays.toString(number));
		
	}
	private static void modify(int input) {
		input = 20;
	}
	private static void modify(int[] input) {
		input[0] = 9;
	}

}
