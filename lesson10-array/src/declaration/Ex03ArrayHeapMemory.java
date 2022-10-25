package declaration;

import java.util.Arrays;

public class Ex03ArrayHeapMemory {
	public static void main(String[] args) {

		int a = 10;
		modify(a); 
		System.out.println("a: " + a);
		
		int[] numbers = {2, 4};
		modify(numbers);//kiểu đối tượng 
		System.out.println("numbers: " + Arrays.toString(numbers));
		int[] aa = {1,2,4,2,2,1};
		
		
	}
	private static void modify(int input)
	{
		input = 20;
	}
	private static void modify(int[] array)
	{
		array[0] = 99;
	}
}
