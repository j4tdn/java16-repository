package datastructure;

public class Ex12SwapInt {

	public static void main(String[] args) {
		int a = 22;
		int b = 66;
//CACH 1:
//		int temp = a;
//		a = b;
//		b = temp;

//CACH 2:
//		a = a + b;
//		b = a - b;
//		a = a - b;
		swap(a,b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

	private static void swap(int first, int second) {
		int temp = first;
		first = second;
		second = temp;
	}

}
