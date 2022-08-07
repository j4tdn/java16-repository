package datastructure;

public class Ex12SwapInteger {
	public static void main(String[] args) {
		int a =22;
		int b = 66 ;
		//swap in main method
		//int temporary = a;
		//a = b;
		//b= temporary;
		System.out.println( a);
		System.out.println( b);
	}
	private static void swap(int first, int second) {
		int temporary = first;
		first = second;
		second= temporary;
	}

}
