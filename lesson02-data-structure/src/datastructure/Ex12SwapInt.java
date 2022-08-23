package datastructure;

public class Ex12SwapInt {
	public static void main(String[] args) {
		int a = 22 ; 
		int b = 66;
		
		// swap in main method
//		int temporary = a;
//		a = b;
//		b = temporary;
//		 a = a + b;// 88
//		 b = a - b;// 88 - 66
//		 a = a - b; // 88 - 22
		swap(a,b);
		System.out.println("a , b " + a +" " + b);
		// create separate method to swap		
	}
	private static void swap(int first, int second) {
		int temporary  = first;
		first = second;
		second = temporary;
		
	}
}
