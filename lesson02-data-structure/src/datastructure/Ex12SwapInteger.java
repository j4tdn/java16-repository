package datastructure;

public class Ex12SwapInteger {
	
	public static void main(String[] args) {
		int a=5;
		int b=6;
		
		swap(a,b);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
//		Integer first = a; H1
//		Integer second = b; H2
//		JAVA pass by VALUE at STACK
//		không thể thay đổi giá trị của biến ở STACK
	
	private static void swap(Integer first, Integer second) {
		Integer temp = first;
		first = second;
		second = temp;
	}
}
