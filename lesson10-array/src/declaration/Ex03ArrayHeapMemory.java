package declaration;

import java.util.Arrays;

public class Ex03ArrayHeapMemory {
	public static void main(String[] args) {
		int[] arrNumber = {2,4};
		modify(arrNumber);
		System.out.println(Arrays.toString(arrNumber));
		
	}
	private static void modify(int[] array) {
		array[0]=99;		
	}

}
