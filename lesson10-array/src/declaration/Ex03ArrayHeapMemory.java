package declaration;

import java.util.Arrays;

public class Ex03ArrayHeapMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		modify(a);
		System.out.println("a: " + a); //pass by value
		
		int[] arrays = {2, 4};
		modify(arrays);
		System.out.println(Arrays.toString(arrays));
	}
	
	private static void modify(int a) {
		a = 20;
	}
		
	private static void modify(int[] array) {
		array[0] = 99;
	}
}
