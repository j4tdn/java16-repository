package declaration;

import java.util.Arrays;

public class Ex03ArrayHeapMemory {
	public static void main(String[] args) {
		int a=10;
		modify(a);
		System.out.println(a);
		
		int[] numbers = {2,4};
		modifyArray(numbers);
		System.out.println("numbers:"+Arrays.toString(numbers));
	}
	private static void modify(int input) {
		input=20;
	}
	private static void modifyArray(int[] array) {
		array[0]=99;
	}
}