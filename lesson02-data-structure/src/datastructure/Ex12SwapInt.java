package datastructure;

public class Ex12SwapInt {

	public static void main(String[] args) {
		int a = 22;
		int b = 66;
		// swap in main method
		/*
		int temp = a;
		a = b;
		b = temp;
		a = a + b;
		b = a - b;
		a = a - b; 
		*/
		swap(a, b);
		System.out.println("a: " +a);
		System.out.println("a: " +b);
	}
	
	private static void swap(int first, int second) {
		int temporary = first;
		first = second;
		second = temporary;
	}

}
