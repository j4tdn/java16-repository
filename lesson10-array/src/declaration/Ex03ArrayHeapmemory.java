package declaration;

import java.util.Arrays;

public class Ex03ArrayHeapmemory {
	public static void main(String[] args) {
		int a = 10;
		modify(a);
		int[] arrays = {2,4};
		modify(arrays);
		System.out.println(Arrays.toString(arrays));
		
	}
	
	
	
	private static void modify(int input) {
		input = 20;
	}
	
	private static void modify(int[] input) {
		input[0] = 1;
		input[1] = 1;
	}



}
