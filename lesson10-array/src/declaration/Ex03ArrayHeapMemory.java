package declaration;

import java.util.Arrays;

public class Ex03ArrayHeapMemory {
	public static void main(String[] args) {
		int a = 10;
		modify(a);
		System.out.println(a);
		int[] numbers = {2, 4};
		modify(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void modify(int input) {
		input = 20;
	} // ko ���i vi� ��y la� KNT 
	
	private static void modify(int[] array) {
		array[0] = 99;
	} // ���i vi� K�T => 2 bi��n K�T nh�ng cu�ng chi� va�o 1 � Heap => thay ���i �� Heap
}
