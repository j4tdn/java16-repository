package datastructure;

public class Ex12SwapInt {
	public static void main(String[] args) {
		int a = 20;
		int b = 3;
		//swap in main method
		//create separate method to swap
//		int temp = a;
//	    a = b;
//		b = temp;
//		System.out.println(a);
//		System.out.println(b);
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	
	}
	private static void  swap(int first, int second) {
		int temporary = first;
		first = second;
		second = temporary;
	}

}
