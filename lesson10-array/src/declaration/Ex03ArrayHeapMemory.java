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
	} // ko ğôÒi viÌ ğây laÌ KNT 
	
	private static void modify(int[] array) {
		array[0] = 99;
	} // ğôÒi viÌ KĞT => 2 biêìn KĞT nhıng cuÌng chiÒ vaÌo 1 ô Heap => thay ğôÒi õÒ Heap
}
